
package Customer_table_Jframes;

import controller.CustomerController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Customer;


public class add_customer_form extends javax.swing.JFrame {

    /**
     * Creates new form add_customer_form
     */
    public add_customer_form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtIdBox = new javax.swing.JTextField();
        txtNameBox = new javax.swing.JTextField();
        txtaddressBox = new javax.swing.JTextField();
        txtsalaryBox = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        txtSalary = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Myanmar MN", 1, 42)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("ADD CUSTOMER FORM");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 100));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 730, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtIdBox.setToolTipText("Enter customer id");
        txtIdBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBoxActionPerformed(evt);
            }
        });
        jPanel4.add(txtIdBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 240, 50));

        txtNameBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtNameBox.setToolTipText("Enter customer name");
        txtNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameBoxActionPerformed(evt);
            }
        });
        jPanel4.add(txtNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 240, 50));

        txtaddressBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtaddressBox.setToolTipText("Enter customer address");
        txtaddressBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressBoxActionPerformed(evt);
            }
        });
        jPanel4.add(txtaddressBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 240, 50));

        txtsalaryBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtsalaryBox.setToolTipText("Enter customer salary");
        txtsalaryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalaryBoxActionPerformed(evt);
            }
        });
        jPanel4.add(txtsalaryBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 240, 50));

        cancelBtn.setBackground(new java.awt.Color(255, 153, 0));
        cancelBtn.setFont(new java.awt.Font("Myanmar Sangam MN", 1, 18)); // NOI18N
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel4.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 180, 50));

        addbtn.setBackground(new java.awt.Color(255, 153, 0));
        addbtn.setFont(new java.awt.Font("Myanmar Sangam MN", 1, 18)); // NOI18N
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel4.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, 50));

        txtId.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtId.setText("ID");
        jPanel4.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtName.setText("NAME");
        jPanel4.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtAddress.setText("ADDRESS");
        jPanel4.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        txtSalary.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtSalary.setText("SALARY");
        jPanel4.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFramePackage/images/ADD:UPDATE:SEARCH:DELETE.jpg"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 720, 400));

        setSize(new java.awt.Dimension(721, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        String id=txtIdBox.getText();
        String name=txtNameBox.getText();
        String address=txtaddressBox.getText();
        double salary=Double.parseDouble(txtsalaryBox.getText());
        
        
        Customer customer=new Customer(id,name,address,salary);
        try {
            boolean isAdded = CustomerController.addCustomer(customer);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Added Success");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
       customer cus = new customer ();  
        cus.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void txtIdBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBoxActionPerformed

    private void txtNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameBoxActionPerformed

    private void txtaddressBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressBoxActionPerformed

    private void txtsalaryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalaryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaryBoxActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(add_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_customer_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtIdBox;
    private javax.swing.JLabel txtName;
    private javax.swing.JTextField txtNameBox;
    private javax.swing.JLabel txtSalary;
    private javax.swing.JTextField txtaddressBox;
    private javax.swing.JTextField txtsalaryBox;
    // End of variables declaration//GEN-END:variables
}
