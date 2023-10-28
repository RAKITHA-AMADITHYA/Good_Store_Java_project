package Customer_table_Jframes;

import controller.CustomerController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Customer;

public class update_customer_form extends javax.swing.JFrame {

    public update_customer_form() {
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
        txtIdBox = new javax.swing.JTextField();
        txtnameBox = new javax.swing.JTextField();
        txtaddressBox = new javax.swing.JTextField();
        txtsalaryBox = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 730, 30));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel5.setFont(new java.awt.Font("Myanmar MN", 1, 42)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("UPDATE CUSTOMER FORM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
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

        txtIdBox.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        txtIdBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtIdBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 260, 50));

        txtnameBox.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        txtnameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtnameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 260, 50));

        txtaddressBox.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        txtaddressBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtaddressBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 260, 50));

        txtsalaryBox.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        txtsalaryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalaryBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtsalaryBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 260, 50));

        updatebtn.setBackground(new java.awt.Color(255, 153, 0));
        updatebtn.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel2.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 170, 50));

        cancelbtn.setBackground(new java.awt.Color(255, 153, 0));
        cancelbtn.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        cancelbtn.setText("CANCEL");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFramePackage/images/update cus.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, 280));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 730, 400));

        setSize(new java.awt.Dimension(727, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBoxActionPerformed
        try {
            Customer customer = CustomerController.searchCustomer(txtIdBox.getText());
            if (customer != null) {
                txtnameBox.setText(customer.getName());
                txtaddressBox.setText(customer.getAddress());
                txtsalaryBox.setText(customer.getSalary() + "");

            } else {
                JOptionPane.showMessageDialog(this, "Customer not found..");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
    }//GEN-LAST:event_txtIdBoxActionPerformed

    private void txtnameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameBoxActionPerformed

    private void txtaddressBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressBoxActionPerformed

    private void txtsalaryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalaryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaryBoxActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try {
            Customer customer = new Customer(txtIdBox.getText(), txtnameBox.getText(), txtaddressBox.getText(), Double.parseDouble(txtsalaryBox.getText()));
            boolean isUpdated = CustomerController.updateCustomer(customer);
            if (isUpdated) {
                JOptionPane.showMessageDialog(this, "Update Success...");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_updatebtnActionPerformed

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
            java.util.logging.Logger.getLogger(update_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new update_customer_form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtIdBox;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtSalary;
    private javax.swing.JTextField txtaddressBox;
    private javax.swing.JTextField txtnameBox;
    private javax.swing.JTextField txtsalaryBox;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
