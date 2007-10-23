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

package com.google.checkout.sdk.nbmodule.integrationwizard;

import com.google.checkout.sdk.nbmodule.common.CheckoutConfigManager;
import java.io.File;
import org.netbeans.api.project.Project;

/**
 * Stores all of the information required to perform the Checkout Integration.
 * This class should be built by the Integration Wizard.
 *
 * @author David Rubel
 */
public class Settings {
  // Project panel
  private Project project;
  private File webInfDirectory;
  
  // WebXml panel
  private File webXmlFile;
  private String modifiedWebXml;
  
  // Config panel
  private CheckoutConfigManager configManager;
  
  // Samples panel
  private boolean addSamples;
  private File samplesDirectory;
  
  // Confirmation panel
  private boolean launchHandlerManager;
  
  public Settings() {
    reset();
  }
  
  // Reset all fields
  public void reset() {
    project = null;
    webInfDirectory = null;
    webXmlFile = null;
    modifiedWebXml = null;
    configManager = new CheckoutConfigManager();
    addSamples = true;
    samplesDirectory = null;
    launchHandlerManager = true;
  }
  
  /*************************************************************************/
  /*                           PUBLIC ACCESSORS                            */
  /*************************************************************************/
  
  public Project getProject() {
    return project;
  }
  
  public void setProject(Project project) {
    this.project = project;
  }
  
  public File getWebInfDirectory() {
    return webInfDirectory;
  }
  
  public void setWebInfDirectory(File webInfDirectory) {
    this.webInfDirectory = webInfDirectory;
  }
  
  public File getWebXmlFile() {
    return webXmlFile;
  }
  
  public void setWebXmlFile(File webXmlFile) {
    this.webXmlFile = webXmlFile;
  }
  
  public String getModifiedWebXml() {
    return modifiedWebXml;
  }
  
  public void setModifiedWebXml(String modifiedWebXml) {
    this.modifiedWebXml = modifiedWebXml;
  }
  
  public CheckoutConfigManager getConfigManager() {
    return configManager;
  }
  
  public void setConfigManager(CheckoutConfigManager configManager) {
    this.configManager = configManager;
  }
  
  public boolean addSamples() {
    return addSamples;
  }
  
  public void setAddSamples(boolean addSamples) {
    this.addSamples = addSamples;
  }
  
  public File getSamplesDirectory() {
    return samplesDirectory;
  }
  
  public void setSamplesDirectory(File samplesDirectory) {
    this.samplesDirectory = samplesDirectory;
  }
  
  public boolean launchHandlerManager() {
    return launchHandlerManager;
  }
  
  public void setLaunchHandlerManager(boolean launchHandlerManager) {
    this.launchHandlerManager = launchHandlerManager;
  }
}