/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import javax.swing.JRadioButton;

/**
 *
 * @author Admin
 */
public class FrmKiemTraPhieuNhap extends javax.swing.JFrame {
    public static boolean Q_A;
    /**
     * Creates new form FrmKiemTraPhieuNhap
     */
    public FrmKiemTraPhieuNhap() {
        this.setUndecorated(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDaCos = new javax.swing.JButton();
        btnChuaCo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Bạn muốn nhập sách?");

        btnDaCos.setBackground(new java.awt.Color(125, 200, 150));
        btnDaCos.setText("Đã có");
        btnDaCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaCosActionPerformed(evt);
            }
        });

        btnChuaCo.setBackground(new java.awt.Color(125, 200, 150));
        btnChuaCo.setText("Chưa có");
        btnChuaCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuaCoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnDaCos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChuaCo)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDaCos)
                    .addComponent(btnChuaCo))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaCosActionPerformed
        // TODO add your handling code here:
        FrmScanBC.where = 2;
        FrmScanBC frmScan = new FrmScanBC();
        frmScan.setVisible(true);
        this.dispose();
        Q_A = true;
    }//GEN-LAST:event_btnDaCosActionPerformed

    private void btnChuaCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuaCoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FrmPhieuNhap pnFrm = new FrmPhieuNhap();
        pnFrm.setSachChuaCo();
        this.setDisplay(pnFrm, pnFrm.rdoDaCo);
        pnFrm.setVisible(true);
        Q_A =false;
    }//GEN-LAST:event_btnChuaCoActionPerformed
    
    private void setDisplay(FrmPhieuNhap pnFrm ,JRadioButton rdo){
        pnFrm.pnPhieuNhap.remove(rdo);
        pnFrm.pnPhieuNhap.validate();
        pnFrm.pnPhieuNhap.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuaCo;
    private javax.swing.JButton btnDaCos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
