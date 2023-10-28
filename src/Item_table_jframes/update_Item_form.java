package Item_table_jframes;

import controller.ItemController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Item;

public class update_Item_form extends javax.swing.JFrame {

    public update_Item_form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        txtSalary = new javax.swing.JLabel();
        txtCodeBox = new javax.swing.JTextField();
        txtDesBox = new javax.swing.JTextField();
        txtUpricBox = new javax.swing.JTextField();
        txtQOHBox = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Myanmar MN", 1, 42)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("UDATE ITEM FORM");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtId.setText("CODE");
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtName.setText("DESCRIPTION");
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtAddress.setText("UNITPRICE");
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        txtSalary.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtSalary.setText("QTYONHAND");
        jPanel2.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txtCodeBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtCodeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 250, 50));

        txtDesBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtDesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtDesBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 250, 50));

        txtUpricBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtUpricBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpricBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtUpricBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 250, 50));

        txtQOHBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtQOHBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQOHBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtQOHBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 250, 50));

        updateBtn.setBackground(new java.awt.Color(255, 153, 0));
        updateBtn.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 299, 160, 50));

        cancelBtn.setBackground(new java.awt.Color(255, 153, 0));
        cancelBtn.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 299, 160, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFramePackage/images/update cus.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 280, 280));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 820, 380));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 490, 830, 50));

        setSize(new java.awt.Dimension(819, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeBoxActionPerformed
        try {
            Item item = ItemController.searchItem(txtCodeBox.getText());
            if (item != null) {
                txtDesBox.setText(item.getDescription());
                txtUpricBox.setText(item.getUnitPrice() + "");

                txtQOHBox.setText(String.valueOf(item.getQtyOnHand()));

            } else {
                JOptionPane.showMessageDialog(this, "Item not found..");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
    }//GEN-LAST:event_txtCodeBoxActionPerformed

    private void txtDesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesBoxActionPerformed

    private void txtUpricBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpricBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpricBoxActionPerformed

    private void txtQOHBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQOHBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQOHBoxActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
            Item item = new Item(
                    txtCodeBox.getText(),
                    txtDesBox.getText(),
                    Double.parseDouble(txtUpricBox.getText()),
                    Integer.parseInt(txtQOHBox.getText())
            );

            boolean isUpdated = ItemController.updateItem(item);
            if (isUpdated) {
                JOptionPane.showMessageDialog(this, "Update Success...");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        Item_main_page hPge = new Item_main_page();
        hPge.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(update_Item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_Item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_Item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_Item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_Item_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JTextField txtCodeBox;
    private javax.swing.JTextField txtDesBox;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtName;
    private javax.swing.JTextField txtQOHBox;
    private javax.swing.JLabel txtSalary;
    private javax.swing.JTextField txtUpricBox;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
