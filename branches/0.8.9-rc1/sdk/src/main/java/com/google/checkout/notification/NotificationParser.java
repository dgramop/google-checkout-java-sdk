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

/**
 * The interface for parsing notifications of a specified type
 * 
 * @author Charles Dang (cdang@google.com)
 */
public interface NotificationParser {
  
  /**
   * 
   * @param xmlDocument The xml document to be parsed
   * @return A CheckoutNotification object created by parsing the xml
   */
  public CheckoutNotification parse(Document xmlDocument) 
    throws CheckoutParserException;
}
