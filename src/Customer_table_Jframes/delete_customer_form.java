
package Customer_table_Jframes;

import controller.CustomerController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Customer;
public class delete_customer_form extends javax.swing.JFrame {

    /**
     * Creates new form delete_customer_form
     */
    public delete_customer_form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        txtSalary = new javax.swing.JLabel();
        txtidbox = new javax.swing.JTextField();
        txtnamebox = new javax.swing.JTextField();
        txtaddressbox = new javax.swing.JTextField();
        txtsalarybox = new javax.swing.JTextField();
        deletebtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel5.setFont(new java.awt.Font("Myanmar MN", 1, 42)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("DELETE CUSTOMER FORM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtId.setText("ID");
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtName.setText("NAME");
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtAddress.setText("ADDRESS");
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        txtSalary.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtSalary.setText("SALARY");
        jPanel2.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txtidbox.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        txtidbox.setToolTipText("Enter customer id.Press \"Enter\" or \"click the search button\" to see the result");
        txtidbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidboxActionPerformed(evt);
            }
        });
        jPanel2.add(txtidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 250, 50));

        txtnamebox.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        txtnamebox.setEditable(false);
        txtnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameboxActionPerformed(evt);
            }
        });
        jPanel2.add(txtnamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 250, 50));

        txtaddressbox.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        txtaddressbox.setEditable(false);
        txtaddressbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressboxActionPerformed(evt);
            }
        });
        jPanel2.add(txtaddressbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 250, 50));

        txtsalarybox.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        txtsalarybox.setEditable(false);
        txtsalarybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalaryboxActionPerformed(evt);
            }
        });
        jPanel2.add(txtsalarybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 250, 50));

        deletebtn.setBackground(new java.awt.Color(255, 153, 0));
        deletebtn.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel2.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 150, 50));

        cancelbtn.setBackground(new java.awt.Color(255, 153, 0));
        cancelbtn.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        cancelbtn.setText("CANCEL");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFramePackage/images/delete cus.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 730, 410));

        setSize(new java.awt.Dimension(728, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtidboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidboxActionPerformed
        try {
            Customer customer = CustomerController.searchCustomer(txtidbox.getText());
            if (customer != null) {
                txtnamebox.setText(customer.getName());
                txtaddressbox.setText(customer.getAddress());
                txtsalarybox.setText(customer.getSalary() + "");

            } else {
                JOptionPane.showMessageDialog(this, "Customer not found..");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
    }//GEN-LAST:event_txtidboxActionPerformed

    private void txtnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameboxActionPerformed

    }//GEN-LAST:event_txtnameboxActionPerformed

    private void txtaddressboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressboxActionPerformed

    }//GEN-LAST:event_txtaddressboxActionPerformed

    private void txtsalaryboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalaryboxActionPerformed

    }//GEN-LAST:event_txtsalaryboxActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        try {
            boolean isDeleted = CustomerController.deleteCustomer(txtidbox.getText());
            if (isDeleted) {
                JOptionPane.showMessageDialog(this, "Delete Success...");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        customer cus = new customer();
        cus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed

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
            java.util.logging.Logger.getLogger(delete_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new delete_customer_form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtSalary;
    private javax.swing.JTextField txtaddressbox;
    private javax.swing.JTextField txtidbox;
    private javax.swing.JTextField txtnamebox;
    private javax.swing.JTextField txtsalarybox;
    // End of variables declaration//GEN-END:variables
}
