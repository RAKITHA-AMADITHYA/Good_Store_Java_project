/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item_table_jframes;

import controller.ItemController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Item;
public class delete_item_form extends javax.swing.JFrame {

   
    public delete_item_form() {
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
        txtCodeBox = new javax.swing.JTextField();
        txtDiscBox = new javax.swing.JTextField();
        txtUnitPeiceBox = new javax.swing.JTextField();
        txtQOHBox = new javax.swing.JTextField();
        deteteBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 500, 830, 40));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel5.setFont(new java.awt.Font("Myanmar MN", 1, 42)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("DELETE ITEM FORM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(191, 191, 191))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

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

        txtCodeBox.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 20)); // NOI18N
        txtCodeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 270, 50));

        txtDiscBox.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 20)); // NOI18N
        txtDiscBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtDiscBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 270, 50));

        txtUnitPeiceBox.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 20)); // NOI18N
        txtUnitPeiceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPeiceBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtUnitPeiceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 270, 50));

        txtQOHBox.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 20)); // NOI18N
        txtQOHBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQOHBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtQOHBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 270, 50));

        deteteBtn.setBackground(new java.awt.Color(255, 153, 0));
        deteteBtn.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        deteteBtn.setText("DELETE");
        deteteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deteteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deteteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 309, 150, 50));

        cancelBtn.setBackground(new java.awt.Color(255, 153, 0));
        cancelBtn.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFramePackage/images/add_Item.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 820, 390));

        setSize(new java.awt.Dimension(820, 552));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeBoxActionPerformed
         try {
            Item item = ItemController.searchItem(txtCodeBox.getText());
            if (item != null) {
                txtDiscBox.setText(item.getDescription());
                txtUnitPeiceBox.setText(item.getUnitPrice() + "");

                txtQOHBox.setText(String.valueOf(item.getQtyOnHand()));

            } else {
                JOptionPane.showMessageDialog(this, "Item not found..");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
    }//GEN-LAST:event_txtCodeBoxActionPerformed

    private void txtDiscBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscBoxActionPerformed

    private void txtUnitPeiceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPeiceBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPeiceBoxActionPerformed

    private void txtQOHBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQOHBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQOHBoxActionPerformed

    private void deteteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deteteBtnActionPerformed
       try {
            boolean isDeleted = ItemController.deleteItem(txtCodeBox.getText());
            if (isDeleted) {
                JOptionPane.showMessageDialog(this, "Delete Success...");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_deteteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(delete_item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_item_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deteteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JTextField txtCodeBox;
    private javax.swing.JTextField txtDiscBox;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtName;
    private javax.swing.JTextField txtQOHBox;
    private javax.swing.JLabel txtSalary;
    private javax.swing.JTextField txtUnitPeiceBox;
    // End of variables declaration//GEN-END:variables
}
