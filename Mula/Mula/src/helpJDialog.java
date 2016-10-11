
import java.util.Scanner;

/*
 Oct 11, 2016 - NOTE: Consider writing the help documents into another seperate file and write 
        a solution that reads from that file into the text area within this
        frmHelp. Include atomatic text formating methods so the text can be
        formatted to fit the text area and become readable.

 */

/**
 * Class: frmHelp
 * Description: A form that primarily documents helpful information on the 
 *      current application.
 * @author Trevor
 * Date Created: Oct, 11, 2016
 * History:
 */
public class helpJDialog extends javax.swing.JDialog {

    /**
     * Constructor
     * Description: Creates new form helpJDialog
     * @param: parent
     * @param: modal
     * Author: Trevor
     * Date Created: Oct. 11, 2016
     * History:
     */
    public helpJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.setTitle("Help");
        this.helpJTextArea.setEnabled(false);
        this.formatHelpDoc();
        
    }

    
    
    private void formatHelpDoc()
    {
        Scanner fileR = new Scanner("helpDoc.txt");
        StringBuffer doc = new StringBuffer();
        String temp;
        String line;
        
        line = fileR.nextLine();
        
        while(line != null)
        {
            if(line.length() > this.helpJTextArea.getWidth())
            {
                temp = line.substring(this.helpJTextArea.getWidth(), line.length());
                line = line.substring(0, this.helpJTextArea.getWidth());
            }
            
                doc.append(line);
                
        }
        
        this.helpJTextArea.setText(doc.toString());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        helpJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        helpJTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(615, 430));

        closeJButton.setText("Close");
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJButtonActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout(10, 10));

        helpJLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        helpJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpJLabel.setText("Expense Logger Help");
        helpJLabel.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(helpJLabel, java.awt.BorderLayout.NORTH);

        helpJTextArea.setColumns(20);
        helpJTextArea.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        helpJTextArea.setLineWrap(true);
        helpJTextArea.setRows(5);
        jScrollPane1.setViewportView(helpJTextArea);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeJButton)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(closeJButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    /**
     * Method: closeJButtonActionPerformed
     * Description: Click event that closes the current form.
     * @param evt
     * Author: Trevor 
     * Date Created: Oct. 11, 2016
     * History:
     */
    private void closeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeJButtonActionPerformed
        this.dispose();
//        this.setVisible(false);
    }//GEN-LAST:event_closeJButtonActionPerformed

    
    
    /**
     * Method: main
     * Description: The main method that sets up the form and displays it.
     * @param args the command line arguments
     * Date Created: Oct. 11, 2016
     * History:
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(helpJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(helpJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(helpJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(helpJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                helpJDialog dialog = new helpJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeJButton;
    private javax.swing.JLabel helpJLabel;
    private javax.swing.JTextArea helpJTextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
