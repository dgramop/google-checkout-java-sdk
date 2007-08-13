package com.google.checkoutsdk.nbmodule.integrationwizard;

import com.google.checkoutsdk.nbmodule.integrationwizard.handlers.CheckoutConfigManager;
import java.io.File;
import org.netbeans.api.project.Project;

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
    private boolean addHandlers;
    private File handlerDirectory;
    
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
        addHandlers = true;
        handlerDirectory = null;
        launchHandlerManager = true;
    }
    
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

    public boolean addHandlers() {
        return addHandlers;
    }

    public void setAddHandlers(boolean addHandlers) {
        this.addHandlers = addHandlers;
    }

    public File getHandlerDirectory() {
        return handlerDirectory;
    }

    public void setHandlerDirectory(File handlerDirectory) {
        this.handlerDirectory = handlerDirectory;
    }

    public boolean launchHandlerManager() {
        return launchHandlerManager;
    }

    public void setLaunchHandlerManager(boolean launchHandlerManager) {
        this.launchHandlerManager = launchHandlerManager;
    }
}
