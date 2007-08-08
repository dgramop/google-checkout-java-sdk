package com.google.checkoutsdk.nbmodule.integrationwizard;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;
import org.netbeans.api.project.Project;
import org.openide.WizardDescriptor;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileStateInvalidException;
import org.openide.util.HelpCtx;
import org.openide.windows.WindowManager;

public final class WebXmlWizardPanel extends JPanel {
    
    // The currently selected project
    private Project project;
    
    // The located web.xml file
    private File webXmlFile;
    
    // The modified web.xml
    private String modifiedWebXml;
    
    // The xml fragment to insert into web.xml
    private String webFragment;
    
    // Whether there was an error reading the file or not
    boolean error = false;
        
    /**
     * Creates the web.xml choosing panel for the Integration Wizard. 
     */
    public WebXmlWizardPanel() {        
        initComponents();
        webWarningLabel.setVisible(false);
        previewWarningLabel.setVisible(false);
        continueCheckBox.setEnabled(false);
        continueCheckBox.setSelected(false);
        readWebFragment();
    }
    
    /**
     * Returns the name for this panel, which is used in the wizard as both the
     * title and the name of each step.
     *
     * @return Name of this panel
     */
    public String getName() {
        return "Modify web.xml";
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        webLabel = new javax.swing.JLabel();
        webTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        previewTextArea = new javax.swing.JTextArea();
        previewLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        webWarningLabel = new javax.swing.JLabel();
        previewDescriptionLabel = new javax.swing.JLabel();
        previewWarningLabel = new javax.swing.JLabel();
        continueCheckBox = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(webLabel, "web.xml file:");

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, "Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        previewTextArea.setColumns(20);
        previewTextArea.setRows(5);
        previewTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                previewTextAreaKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(previewTextArea);

        org.openide.awt.Mnemonics.setLocalizedText(previewLabel, "Preview");

        webWarningLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        webWarningLabel.setForeground(new java.awt.Color(255, 0, 0));
        webWarningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(webWarningLabel, "Warning: File not named \"web.xml\"");

        previewDescriptionLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        org.openide.awt.Mnemonics.setLocalizedText(previewDescriptionLabel, "Preview the changes to web.xml.  You may modify them if necessary.");

        previewWarningLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        previewWarningLabel.setForeground(new java.awt.Color(255, 0, 0));
        previewWarningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(previewWarningLabel, "Warning: Preview has ben modified");

        org.openide.awt.Mnemonics.setLocalizedText(continueCheckBox, "I will modify web.xml manually (see help)");
        continueCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        continueCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(previewLabel)
                    .add(previewDescriptionLabel)
                    .add(webWarningLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .add(separator, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(webLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(webTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseButton))
                    .add(continueCheckBox)
                    .add(previewWarningLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(webLabel)
                    .add(browseButton)
                    .add(webTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(webWarningLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(separator, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(previewLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(previewDescriptionLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(continueCheckBox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(previewWarningLabel)
                .add(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    /*************************************************************************/
    /*                           EVENT HANDLERS                              */
    /*************************************************************************/
    
    private void previewTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_previewTextAreaKeyTyped
        // TODO: fix warning display to show after first character
        if (modifiedWebXml != null) {
            previewWarningLabel.setVisible(!error && !modifiedWebXml.equals(previewTextArea.getText()));
        }
    }//GEN-LAST:event_previewTextAreaKeyTyped

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        // Generate and show the file chooser
        JFileChooser jfc = new JFileChooser(getFile(project.getProjectDirectory()));
        jfc.setDialogTitle("Locate web.xml");
        jfc.setFileSelectionMode (JFileChooser.FILES_ONLY);
        jfc.showOpenDialog(WindowManager.getDefault().getMainWindow());
        
        // Get the selected file
        webXmlFile = jfc.getSelectedFile();
        
        // Process the new web.xml file
        processWebXmlFile();
        
    }//GEN-LAST:event_browseButtonActionPerformed
    
    /*************************************************************************/
    /*                          SWING VARIABLES                              */
    /*************************************************************************/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JCheckBox continueCheckBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel previewDescriptionLabel;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JTextArea previewTextArea;
    private javax.swing.JLabel previewWarningLabel;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel webLabel;
    private javax.swing.JTextField webTextField;
    private javax.swing.JLabel webWarningLabel;
    // End of variables declaration//GEN-END:variables
 
    /*************************************************************************/
    /*                          UTILITY METHODS                              */
    /*************************************************************************/
  
    /**
     * Reads the new web.xml file, generates the modified version (by inserting
     * the web fragment), and displays the final text or an error message.
     */
    private void processWebXmlFile() {        
        String errorMsg = null;
        
        if (webXmlFile == null) {
            getDefaultWebXmlFile();
        }
        
        if (webFragment == null) {
            errorMsg = "Error reading webFragment.xml file.";
        } else if (webXmlFile == null) {
            errorMsg = "No file selected.";
        } else {
            // Reset error status
            error = false;
            modifiedWebXml = null;
            continueCheckBox.setEnabled(false);
            continueCheckBox.setSelected(false);
            webWarningLabel.setVisible(false);
            
            // Display file name
            webTextField.setText(webXmlFile.getAbsolutePath());
        
            // Display warning if file is not web.xml
            if (!webXmlFile.getName().equals("web.xml")) {
                webWarningLabel.setVisible(true);
            }
            
            // Read the file and display it in the preview area
            try {
                BufferedReader reader = new BufferedReader(new FileReader(webXmlFile));
                String line = reader.readLine();
                StringBuilder lines = new StringBuilder();
                while (line != null) {
                    lines.append(line + "\n");
                    line = reader.readLine();
                }
                
                // Remove trailing new line
                if (lines.toString().endsWith("\n")) {
                    lines.deleteCharAt(lines.length()-1);
                }
                
                // Insert CheckoutSDK web.xml and set preview text
                if (insertWebFragment(lines.toString())) {
                    previewTextArea.setText(modifiedWebXml);
                } else {
                    errorMsg = "Unable to automatically insert web.xml fragment.";
                }
            } catch (FileNotFoundException ex) {
                errorMsg = "File not found.";
            } catch (IOException ex) {
                errorMsg = "Error reading file.";
            }
        }
        
        // Handle errors
        if (errorMsg != null) {
            error = true;
            continueCheckBox.setEnabled(true);
            previewTextArea.setText(errorMsg);
        }
    }
    
    private void getDefaultWebXmlFile() {
        try {
            File projectDirectory = new File(project.getProjectDirectory().getURL().toURI());
            webXmlFile = new File(projectDirectory.toURL().toURI().resolve("web/WEB-INF/web.xml"));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        } catch (FileStateInvalidException ex) {
            ex.printStackTrace();
        }
    }
    
    private File getFile(FileObject file) {
        File ret = null;
        try {
            ret = new File(file.getURL().getFile());
        } catch (FileStateInvalidException ex) {}
        return ret;
    }
    
    private boolean insertWebFragment(String file) {
        // TODO: Add coloring to new fragment
        int index = file.indexOf("</web-app>");
        
        if (index >= 0) {
            modifiedWebXml = file.substring(0, index) + "\n" + webFragment + "\n" + file.substring(index);
            return true;
        }
        
        return false;
    }
    
    private void readWebFragment() {
        // TODO: Read this from a file as oposed to hard coding it (I had trouble
        // with the getResource() method)
        webFragment = "" +
                "<!-- Begin: Configuration for Google checkout message processing -->\n" +
                "  <servlet>\n" +
                "    <description>\n" +
                "      Servlet that receives notifications for Google Checkout\n" +
                "    </description>\n" +
                "    <display-name>CheckoutNotificationServlet</display-name>\n" +
                "    <servlet-name>CheckoutNotificationServlet</servlet-name>\n" +
                "    <servlet-class>\n" +
                "      com.google.checkout.sdk.CheckoutMessageHandlerServlet\n" +
                "    </servlet-class>\n" +
                "    <init-param>\n" +
                "      <param-name>handler-type</param-name>\n" +
                "      <param-value>notification-handler</param-value>\n" +
                "    </init-param>\n" +
                "    <load-on-startup>0</load-on-startup>\n" +
                "  </servlet>\n" +
                "\n" +
                "  <servlet>\n" +
                "    <description>\n" +
                "      Servlet that receives callback requests for Google Checkout\n" +
                "    </description>\n" +
                "    <display-name>CheckoutCallbackServlet</display-name>\n" +
                "    <servlet-name>CheckoutCallbackServlet</servlet-name>\n" +
                "    <servlet-class>\n" +
                "      com.google.checkout.sdk.CheckoutMessageHandlerServlet\n" +
                "    </servlet-class>\n" +
                "    <init-param>\n" +
                "      <param-name>handler-type</param-name>\n" +
                "      <param-value>callback-handler</param-value>\n" +
                "    </init-param>\n" +
                "    <load-on-startup>0</load-on-startup>\n" +
                "  </servlet>\n" +
                "\n" +
                "  <servlet-mapping>\n" +
                "    <servlet-name>CheckoutNotificationServlet</servlet-name>\n" +
                "    <url-pattern>/notification</url-pattern>\n" +
                "  </servlet-mapping>\n" +
                "\n" +
                "  <servlet-mapping>\n" +
                "    <servlet-name>CheckoutCallbackServlet</servlet-name>\n" +
                "    <url-pattern>/callback</url-pattern>\n" +
                "  </servlet-mapping>\n" +
                "\n" +
                "  <!-- location of configuration file for checkout with respect to context \n" +
                "    root. Using the default path here. -->\n" +
                "  <context-param>\n" +
                "    <param-name>checkout-config-file</param-name>\n" +
                "    <param-value>/WEB-INF/checkout-config.xml</param-value>\n" +
                "  </context-param>\n" +
                "\n" +
                "  <listener>\n" +
                "    <description>\n" +
                "      Servlet context listener that configures some needed context attributes\n" +
                "    </description>\n" +
                "    <listener-class>com.google.checkout.web.ConfigurationListener</listener-class>\n" +
                "  </listener>\n" +
                "  <!-- End: Configuration for Google checkout message processing -->";
    }

    /*************************************************************************/
    /*                       SHARED DATA ACCESSORS                           */
    /*************************************************************************/
    
    private void setCurrentProject(Project project) {
        this.project = project;
    }
    
    private File getWebXmlFile() {
        return webXmlFile;
    }
    
    private void setWebXmlFile(File webXmlFile) {
        this.webXmlFile = webXmlFile;
    }

    private String getModifiedWebXml() {
        return modifiedWebXml;
    }
    
    /*************************************************************************/
    /*                       WIZARD DESCRIPTOR PANEL                         */
    /*************************************************************************/
    
    public static class Panel implements WizardDescriptor.Panel {
        // The visual component of this panel
        private WebXmlWizardPanel component;
        
        public Component getComponent() {
            if (component == null) {
                component = new WebXmlWizardPanel();
            }
            return component;
        }

        public HelpCtx getHelp() {
            return HelpCtx.DEFAULT_HELP;
        }

        public boolean isValid() {
            return true;
        }

        public final void addChangeListener(ChangeListener l) {}
        public final void removeChangeListener(ChangeListener l) {}
        
        public void readSettings(Object settings) {
            // Read shared info from the wizard descriptor
            IntegrationWizardDescriptor descriptor = (IntegrationWizardDescriptor) settings;
            component.setCurrentProject(descriptor.getProject());
            component.setWebXmlFile(descriptor.getWebXmlFile());
                        
            component.processWebXmlFile();
        }
        
        public void storeSettings(Object settings) {
            // Write shared info from the wizard descriptor
            IntegrationWizardDescriptor descriptor = (IntegrationWizardDescriptor) settings;
            descriptor.setWebXmlFile(component.getWebXmlFile());
            descriptor.setModifiedWebXml(component.getModifiedWebXml());
        }
    }
}
