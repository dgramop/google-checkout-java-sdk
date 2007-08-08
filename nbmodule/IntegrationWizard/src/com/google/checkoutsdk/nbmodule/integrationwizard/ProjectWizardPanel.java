package com.google.checkoutsdk.nbmodule.integrationwizard;

import java.awt.Component;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.WizardDescriptor;
import org.openide.util.HelpCtx;

public final class ProjectWizardPanel extends JPanel {
    
    // The contents of the project selector list
    private DefaultListModel projectModel;
    
    // The located web.xml file
    private File webXmlFile;
    
    // List of the currently displayed (open) projects
    private Project[] projects;
    
    // The currently selected project 
    private Project currentProject;
    
    /**
     * Creates the project choosing panel for the Integration Wizard. 
     */
    public ProjectWizardPanel() {
        projectModel = new DefaultListModel();
        
        initComponents();
        refreshProjectList();
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
        refreshButton = new javax.swing.JButton();

        projectLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        org.openide.awt.Mnemonics.setLocalizedText(projectLabel, "Select a project to integrate Google Checkout with.");

        projectList.setFont(new java.awt.Font("Dialog", 0, 12));
        projectList.setModel(projectModel);
        projectList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                projectListValueChanged(evt);
            }
        });

        jScrollPane1.setViewportView(projectList);

        org.openide.awt.Mnemonics.setLocalizedText(refreshButton, "Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(projectLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 19, Short.MAX_VALUE)
                        .add(refreshButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(projectLabel)
                    .add(refreshButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /*************************************************************************/
    /*                           EVENT HANDLERS                              */
    /*************************************************************************/
    
    private void projectListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_projectListValueChanged
        if (!evt.getValueIsAdjusting() && projectList.getSelectedIndex() >= 0) {
            Project newProject = projects[projectList.getSelectedIndex()];
            if (currentProject != newProject) {
                // Set the new project
                currentProject = newProject;
                
                // Clear the selected web.xml file
                webXmlFile = null;
            }
        }
    }//GEN-LAST:event_projectListValueChanged

    // TODO: Remove refresh button?  While wizard is open, NetBeans cannot
    // regain focus, so the user shouldn't be able to add/remove projects
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refreshProjectList();
    }//GEN-LAST:event_refreshButtonActionPerformed

    /*************************************************************************/
    /*                          SWING VARIABLES                              */
    /*************************************************************************/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JList projectList;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
    
    /*************************************************************************/
    /*                          UTILITY METHODS                              */
    /*************************************************************************/
    
    /**
     * Refreshes the project list with the list of currently opened projects.
     * The "default project" (defined by NetBeans) is selected by default.
     */
    public void refreshProjectList() {
        // Get a list of open projects
        OpenProjects openProjects = OpenProjects.getDefault();
        projects = openProjects.getOpenProjects();
        
        // Determine the selected projects name
        String selectedName = null;
        if (currentProject != null) {
            selectedName = currentProject.getProjectDirectory().getName();
        } else if (openProjects.getMainProject() != null) {
            selectedName = openProjects.getMainProject().getProjectDirectory().getName();
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
    }
    
    /*************************************************************************/
    /*                       SHARED DATA ACCESSORS                           */
    /*************************************************************************/
    
    public Project getCurrentProject() {
        return currentProject;
    }
    
    public void setCurrentProject(Project project) {
        this.currentProject= project;
    }

    private File getWebXmlFile() {
        return webXmlFile;
    }
    
    private void setWebXmlFile(File webXmlFile) {
        this.webXmlFile = webXmlFile;
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
            IntegrationWizardDescriptor descriptor = (IntegrationWizardDescriptor) settings;
            component.setCurrentProject(descriptor.getProject());
            component.setWebXmlFile(descriptor.getWebXmlFile());

            // Refresh the panel
            component.refreshProjectList();
        }
        
        public void storeSettings(Object settings) {
            // Write shared info to the wizard descriptor
            IntegrationWizardDescriptor descriptor = (IntegrationWizardDescriptor) settings;
            descriptor.setProject(component.getCurrentProject());
            descriptor.setWebXmlFile(component.getWebXmlFile());
        }
    }
}

