

package Item_table_jframes;

import controller.ItemController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Item;

public class add_Item_form extends javax.swing.JFrame {

    
    public add_Item_form() {
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
        txtDisBox = new javax.swing.JTextField();
        txtUniPriBox = new javax.swing.JTextField();
        txtQtyOHBox = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Myanmar MN", 1, 42)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("ADD ITEM FORM");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtId.setText("CODE");
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtName.setText("DESCRIPTION");
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtAddress.setText("UNITPRICE");
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 30));

        txtSalary.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        txtSalary.setText("QTYONHAND");
        jPanel2.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        txtCodeBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtCodeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 43, 230, 54));

        txtDisBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtDisBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtDisBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 106, 230, 50));

        txtUniPriBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtUniPriBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniPriBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtUniPriBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 230, 50));

        txtQtyOHBox.setFont(new java.awt.Font("Malayalam MN", 1, 20)); // NOI18N
        txtQtyOHBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyOHBoxActionPerformed(evt);
            }
        });
        jPanel2.add(txtQtyOHBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 230, 50));

        addBtn.setBackground(new java.awt.Color(255, 153, 0));
        addBtn.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, 50));

        cancelBtn.setBackground(new java.awt.Color(255, 153, 0));
        cancelBtn.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFramePackage/images/7af74a58-9668-4771-8744-bfa086ca9676.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 290, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 820, 390));

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

        setSize(new java.awt.Dimension(819, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String code=txtCodeBox.getText();
        String dis=txtDisBox.getText();
        double uPrice=Double.parseDouble(txtUniPriBox.getText());
        int COH = Integer.parseInt(txtQtyOHBox.getText());
        
        Item item=new Item(code,dis,uPrice,COH);
         try {
            boolean isAdded = ItemController.addItem(item);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Added Success");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        Item_main_page hPge = new Item_main_page();
        hPge.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void txtCodeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeBoxActionPerformed
       txtDisBox.requestFocus();
    }//GEN-LAST:event_txtCodeBoxActionPerformed

    private void txtDisBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisBoxActionPerformed
        txtUniPriBox.requestFocus();
    }//GEN-LAST:event_txtDisBoxActionPerformed

    private void txtUniPriBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniPriBoxActionPerformed
        txtQtyOHBox.requestFocus();
    }//GEN-LAST:event_txtUniPriBoxActionPerformed

    private void txtQtyOHBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyOHBoxActionPerformed
        addBtn.requestFocus();
    }//GEN-LAST:event_txtQtyOHBoxActionPerformed

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
            java.util.logging.Logger.getLogger(add_Item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_Item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_Item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_Item_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_Item_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JTextField txtCodeBox;
    private javax.swing.JTextField txtDisBox;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtName;
    private javax.swing.JTextField txtQtyOHBox;
    private javax.swing.JLabel txtSalary;
    private javax.swing.JTextField txtUniPriBox;
    // End of variables declaration//GEN-END:variables

}
