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

package com.google.checkout.notification;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.google.checkout.util.Utils;

/**
 * This class encapsulates the structured name data.
 * 
 * @author simonjsmith
 */
public class StructuredName {

  private final Document document;

  private final Element element;

  public StructuredName(Document document, Element element) {
    this.document = document;
    this.element = element;
  }

  /**
   * @return the first-name
   */
  public String getFirstName() {
    return Utils.getElementStringValue(document, element, "first-name");
  }

  /**
   * @return the last-name
   */
  public String getLastName() {
    return Utils.getElementStringValue(document, element, "last-name");
  }

}
