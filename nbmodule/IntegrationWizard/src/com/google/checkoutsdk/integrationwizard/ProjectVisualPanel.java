package com.google.checkoutsdk.integrationwizard;

import com.sun.org.apache.xpath.internal.operations.Mod;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;

public final class ProjectVisualPanel extends JPanel {
    
    // Model for 
    DefaultListModel projectModel;
    
    /** Creates new form IntegrationVisualPanel2 */
    public ProjectVisualPanel() {
        projectModel = new DefaultListModel();
        
        initComponents();
        refreshProjectList();
    }
    
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

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refreshProjectList();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void refreshProjectList() {
        // Get a list of open projects
        OpenProjects projectGetter = OpenProjects.getDefault();
        Project[] projects = projectGetter.getOpenProjects();
        
        // Get the default project name
        String defaultName = projectGetter.getMainProject().getProjectDirectory().getName();
        
        // Add open projects to the project list
        projectModel.clear();
        for (int i=0; i<projects.length; i++) {
            String name = projects[i].getProjectDirectory().getName();
            projectModel.addElement(name);
            
            // If main project, set as selected
            if (name.equals(defaultName)) {
                projectList.setSelectedIndex(i);
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JList projectList;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
    
}

