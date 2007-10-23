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

package com.google.checkout.sdk.nbmodule.integrationwizard.panels;

import com.google.checkout.sdk.nbmodule.integrationwizard.IntegrationWizardDescriptor;
import com.google.checkout.sdk.nbmodule.integrationwizard.Settings;
import java.awt.Component;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.WizardDescriptor;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileStateInvalidException;
import org.openide.filesystems.FileUtil;
import org.openide.util.HelpCtx;
import org.openide.windows.WindowManager;

public final class ProjectWizardPanel extends JPanel {
  
  // The contents of the project selector list
  private DefaultListModel projectModel;
  
  // List of the currently displayed (open) projects
  private Project[] projects;
  
  // Integration settings, built by this wizard
  private Settings settings;
  
  /**
   * Creates the project choosing panel for the Integration Wizard.
   */
  public ProjectWizardPanel() {
    projectModel = new DefaultListModel();
    initComponents();
  }
  
  /**
   * Returns the name for this panel, which is used in the wizard as both the
   * title and the name of each step.
   *
   * @return Name of this panel
   */
  public String getName() {
    return "Select Project";
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        projectLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectList = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        webInfLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        webInfTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();

        projectLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        org.openide.awt.Mnemonics.setLocalizedText(projectLabel, "Select a project to integrate with.");

        projectList.setFont(new java.awt.Font("Dialog", 0, 12));
        projectList.setModel(projectModel);
        projectList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                projectListValueChanged(evt);
            }
        });

        jScrollPane1.setViewportView(projectList);

        webInfLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        org.openide.awt.Mnemonics.setLocalizedText(webInfLabel, "Locate this project's WEB-INF directory");

        locationLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        org.openide.awt.Mnemonics.setLocalizedText(locationLabel, "Location:");

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, "Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(locationLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(webInfTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseButton))
                    .add(webInfLabel)
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(projectLabel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(projectLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(webInfLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(locationLabel)
                    .add(browseButton)
                    .add(webInfTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /*************************************************************************/
    /*                           EVENT HANDLERS                              */
    /*************************************************************************/
    
    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
      // Generate and show the file chooser
      File file = 
          FileUtil.toFile(settings.getProject().getProjectDirectory());
      JFileChooser jfc = new JFileChooser(file);
      jfc.setDialogTitle("WEB-INF Directory");
      jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      jfc.showOpenDialog(WindowManager.getDefault().getMainWindow());
      
      // Fill the samples directory text field with the located directory
      File selectedFile = jfc.getSelectedFile();
      if (selectedFile != null) {
        String text = selectedFile.getPath();
        webInfTextField.setText(text);
      }
    }//GEN-LAST:event_browseButtonActionPerformed
    
    private void projectListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_projectListValueChanged
      if (!evt.getValueIsAdjusting() && projectList.getSelectedIndex() >= 0) {
        Project newProject = projects[projectList.getSelectedIndex()];
        if (settings.getProject() != newProject) {
          // Project selection has changed, so reset settings (to clear
          // info from other panels)
          settings.reset();
          
          // Set the new project
          settings.setProject(newProject);
          
          // Update the WEB-INF text field
          updateWebInfTextField();
        }
      }
    }//GEN-LAST:event_projectListValueChanged
    
    /*************************************************************************/
    /*                          SWING VARIABLES                              */
    /*************************************************************************/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JList projectList;
    private javax.swing.JLabel webInfLabel;
    private javax.swing.JTextField webInfTextField;
    // End of variables declaration//GEN-END:variables
    
    /*************************************************************************/
    /*                          UTILITY METHODS                              */
    /*************************************************************************/
    
    /**
     * Refreshes the project list with the list of currently opened projects.
     * The "default project" (defined by NetBeans) is selected by default.
     */
    private void refreshProjectList() {
      // Get a list of open projects
      OpenProjects openProjects = OpenProjects.getDefault();
      projects = openProjects.getOpenProjects();
      
      // Determine the selected projects name
      String selectedName = null;
      if (settings.getProject() != null) {
        selectedName = settings.getProject().getProjectDirectory().getName();
      } else if (openProjects.getMainProject() != null) {
        selectedName = 
            openProjects.getMainProject().getProjectDirectory().getName();
      }
      
      // Add open projects to the project list
      projectModel.clear();
      for (int i=0; i<projects.length; i++) {
        String name = projects[i].getProjectDirectory().getName();
        projectModel.addElement(name);
        
        // If main project, set as selected
        if (selectedName != null && name.equals(selectedName)) {
          projectList.setSelectedIndex(i);
        }
      }
      
      // Refresh the WEB-INF text field
      updateWebInfTextField();
    }
    
    
    private void updateWebInfTextField() {
      // Generate default WEB-INF directory if none provided
      if (settings.getWebInfDirectory() == null) {
        try {
          FileObject projectDirectory = 
              settings.getProject().getProjectDirectory();
          URI uri = projectDirectory.getURL().toURI();
          File file = new File(uri.resolve("web/WEB-INF/"));
          settings.setWebInfDirectory(file);
        } catch (URISyntaxException ex) {
          // Okay to not have a default
        } catch (FileStateInvalidException ex) {
          // Okay to not have a default
        }
      }
      
      // Show the WEB-INF directory in the text field
      webInfTextField.setText(settings.getWebInfDirectory().getPath());
    }
    
    private void recordSettings() {
      // Validate WEB-INF directory
      File dir = new File(webInfTextField.getText());
      if (dir.isDirectory()) {
        settings.setWebInfDirectory(dir);
      }
    }
    
    /*************************************************************************/
    /*                         SETTINGS ACCESSORS                            */
    /*************************************************************************/
    
    public Settings getSettings() {
      return settings;
    }
    
    public void setSettings(Settings settings) {
      this.settings = settings;
    }
    
    /*************************************************************************/
    /*                       WIZARD DESCRIPTOR PANEL                         */
    /*************************************************************************/
    
    public static class Panel implements WizardDescriptor.Panel {
      // The visual component of this panel
      private ProjectWizardPanel component;
      
      public Component getComponent() {
        if (component == null) {
          component = new ProjectWizardPanel();
        }
        return component;
      }
      
      public HelpCtx getHelp() {
        return HelpCtx.DEFAULT_HELP;
      }
      
      public boolean isValid() {
        return true;
      }
      
      // TODO: Add listener to enable/disable 'next' button
      public final void addChangeListener(ChangeListener l) {}
      public final void removeChangeListener(ChangeListener l) {}
      
      public void readSettings(Object settings) {
        // Read shared info from the wizard descriptor
        IntegrationWizardDescriptor descriptor = 
            (IntegrationWizardDescriptor) settings;
        component.setSettings(descriptor.getSettings());
        
        // Refresh the panel
        component.refreshProjectList();
      }
      
      public void storeSettings(Object settings) {
        // Record the page state into settings
        component.recordSettings();
        
        // Write shared info to the wizard descriptor
        IntegrationWizardDescriptor descriptor = 
            (IntegrationWizardDescriptor) settings;
        descriptor.setSettings(component.getSettings());
      }
    }
}