/*******************************************************************************
 * Copyright (C) 2007 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/

package com.google.checkout.web;

import com.google.checkout.EnvironmentType;
import com.google.checkout.MerchantInfo;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.w3c.dom.Document;
import com.google.checkout.util.Utils;
import java.io.InputStream;
import javax.servlet.ServletContext;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * This servlet context listener sets up attributed that need to be present 
 * in the servlet context
 * @author inder
 */
public class ConfigurationListener implements ServletContextListener {
  
  
  /** Creates a new instance of ConfigurationListener */
  public ConfigurationListener() {
  }
  
 public void contextInitialized(ServletContextEvent sce) {
    ServletContext context = sce.getServletContext();
    String fileName = context.getInitParameter("checkout-config-file");
    InputStream is = context.getResourceAsStream(fileName);
    if (is == null) { // try default path
      fileName = "/WEB-INF/checkout-config.xml";
      is = context.getResourceAsStream(fileName);
    }
    if (is == null) {
      throw new IllegalArgumentException("web.xml must have <checkout-config-file> init parameter!");
    }
    Document doc = Utils.newDocumentFromInputStream(is);
    context.setAttribute(KeyConstants.MERCHANT_INFO_KEY, extractMerchantInfo(doc));   
 }

   private MerchantInfo extractMerchantInfo(Document doc) {
    NodeList elements = doc.getElementsByTagName("merchant-info");
    if (elements.getLength() != 1) {
      throw new IllegalArgumentException("checkout-config.xml must have exactly one <merchant-info> element!");
    }
    Element miElement = (Element) elements.item(0);
    
    String merchantId = Utils.getElementStringValue(doc, miElement, "merchant-id").trim();
    String merchantKey = Utils.getElementStringValue(doc, miElement, "merchant-key").trim();
    String env = Utils.getElementStringValue(doc, miElement, "env").trim();
    String currencyCode = Utils.getElementStringValue(doc, miElement, "currency-code").trim();
    String sandboxRoot = Utils.getElementStringValue(doc, miElement, "sandbox-root").trim();
    String productionRoot = Utils.getElementStringValue(doc, miElement, "production-root").trim();
    String checkoutSuffix = Utils.getElementStringValue(doc, miElement, "checkout-suffix").trim();
    String merchantCheckoutSuffix = Utils.getElementStringValue(doc, miElement, "merchant-checkout-suffix").trim();
    String requestSuffix = Utils.getElementStringValue(doc, miElement, "request-suffix").trim();
    
    String checkoutUrl = "";
    String merchantCheckoutUrl = "";
    String requestUrl = "";
    
    if (EnvironmentType.Sandbox.equals(env)) {
      checkoutUrl = sandboxRoot + "/" + merchantId + "/"
          + checkoutSuffix;
      merchantCheckoutUrl = sandboxRoot + "/" + merchantId + "/"
          + merchantCheckoutSuffix;
      requestUrl = sandboxRoot + "/" + merchantId + "/"
          + requestSuffix;
    } else if (EnvironmentType.Production.equals(env)) {
      checkoutUrl = productionRoot + "/" + merchantId + "/"
          + checkoutSuffix;
      merchantCheckoutUrl = productionRoot + "/" + merchantId + "/"
          + merchantCheckoutSuffix;
      requestUrl = productionRoot + "/" + merchantId + "/" + requestSuffix;
    } else {
      throw new RuntimeException("Env must be one of " + EnvironmentType.Sandbox
          + " or " + EnvironmentType.Production + ".");
    }
    return new MerchantInfo(merchantId, merchantKey, env, currencyCode,
        checkoutUrl, merchantCheckoutUrl, requestUrl);
  }
  

 public void contextDestroyed(ServletContextEvent sce) {
   // Nothing needs to be done, so ignore
 }
}