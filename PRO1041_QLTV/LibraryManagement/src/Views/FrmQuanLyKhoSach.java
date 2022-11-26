/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import Utilities.SetSize;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.net.URL;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Admin
 */
public class FrmQuanLyKhoSach extends javax.swing.JPanel {
    final SetSize setsize = new SetSize();
    /**
     * Creates new form FrmKhoSach
     */
    public FrmQuanLyKhoSach() {
        initComponents();
        this.setTable();
        this.seticon();
        URL urlBook = getClass().getResource("/Images/book-demo.jpg");
        imgBook.setIcon(setsize.setSizeAnh(urlBook, 170, 243));
    }

    private void setTable(){
        Font bigFont = new Font("Segoe UI", Font.PLAIN, 14);
        tblKhoSach.getTableHeader().setFont(bigFont);
        tblKhoSach.getTableHeader().setPreferredSize(new Dimension(WIDTH, 32));
        tblKhoSach.getColumnModel().getColumn(0).setPreferredWidth(150);
        tblKhoSach.getColumnModel().getColumn(0).setMaxWidth(150);
        tblKhoSach.getColumnModel().getColumn(2).setPreferredWidth(200);
        tblKhoSach.getColumnModel().getColumn(2).setMaxWidth(200);
        tblKhoSach.setRowHeight(28);
        
        JTableHeader header = tblKhoSach.getTableHeader();
        header.setBackground(new Color(125,200,150));
        header.setForeground(Color.white);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhoSach = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        imgBook = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnXemChiTiet = new javax.swing.JPanel();
        lblXCT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnXemPhieuNhap = new javax.swing.JPanel();
        lblXCT1 = new javax.swing.JLabel();
        btnXoaSach = new javax.swing.JPanel();
        lblXCT3 = new javax.swing.JLabel();
        btnVietPhieuNhap = new javax.swing.JPanel();
        lblXCT4 = new javax.swing.JLabel();
        btnThemSach = new javax.swing.JPanel();
        lblXCT5 = new javax.swing.JLabel();
        btnSuaSach = new javax.swing.JPanel();
        lblXCT6 = new javax.swing.JLabel();
        txtTimSach = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 530));
        setPreferredSize(new java.awt.Dimension(780, 530));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KHO SÁCH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(780, 427));

        tblKhoSach.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblKhoSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MÃ SÁCH", "TÊN SÁCH", "THỂ LOẠI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhoSach.setGridColor(new java.awt.Color(0, 0, 0));
        tblKhoSach.setPreferredSize(new java.awt.Dimension(780, 80));
        tblKhoSach.setSelectionBackground(new java.awt.Color(125, 214, 150));
        tblKhoSach.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblKhoSach.setShowGrid(false);
        jScrollPane1.setViewportView(tblKhoSach);
        if (tblKhoSach.getColumnModel().getColumnCount() > 0) {
            tblKhoSach.getColumnModel().getColumn(0).setResizable(false);
            tblKhoSach.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblKhoSach.getColumnModel().getColumn(1).setResizable(false);
            tblKhoSach.getColumnModel().getColumn(2).setResizable(false);
            tblKhoSach.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(170, 243));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tư duy nhanh và chậm");

        btnXemChiTiet.setBackground(new java.awt.Color(125, 200, 150));
        btnXemChiTiet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(125, 200, 150), null, null));
        btnXemChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXemChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemChiTietMouseClicked(evt);
            }
        });

        lblXCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXCT.setText("Xem chi tiết");
        btnXemChiTiet.add(lblXCT);

        jLabel2.setText("Tác giả:");

        jLabel3.setText("Daniel Kehlmann");

        jLabel5.setText("Số lượng:");

        jLabel7.setText("50");

        jLabel8.setText("Nhà xb:");

        jLabel9.setText("Alpha book");

        jLabel10.setText("Thể loại:");

        jLabel11.setText("Tâm Lý - Kỹ Năng Sống");

        jLabel12.setText("Lượt mượn:");

        jLabel13.setText("300");

        jLabel16.setText("Mã sách:");

        jLabel17.setText("SA2001");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXemChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel12))
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btnXemChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Nhập sách");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Thư viện");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 76, 320, 10));

        btnXemPhieuNhap.setBackground(new java.awt.Color(125, 200, 150));
        btnXemPhieuNhap.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(125, 200, 150), null, null));
        btnXemPhieuNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXemPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemPhieuNhapMouseClicked(evt);
            }
        });

        lblXCT1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXCT1.setText("Xem phiếu nhập ");
        lblXCT1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXemPhieuNhap.add(lblXCT1);

        jPanel4.add(btnXemPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 120, 30));

        btnXoaSach.setBackground(new java.awt.Color(125, 200, 150));
        btnXoaSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(125, 200, 150), null, null));
        btnXoaSach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaSachMouseClicked(evt);
            }
        });

        lblXCT3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXCT3.setText("Xóa sách");
        btnXoaSach.add(lblXCT3);

        jPanel4.add(btnXoaSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 120, 30));

        btnVietPhieuNhap.setBackground(new java.awt.Color(125, 200, 150));
        btnVietPhieuNhap.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(125, 200, 150), null, null));
        btnVietPhieuNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVietPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVietPhieuNhapMouseClicked(evt);
            }
        });

        lblXCT4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXCT4.setText("Viết phiếu nhập");
        btnVietPhieuNhap.add(lblXCT4);

        jPanel4.add(btnVietPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, 30));

        btnThemSach.setBackground(new java.awt.Color(125, 200, 150));
        btnThemSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(125, 200, 150), null, null));
        btnThemSach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemSachMouseClicked(evt);
            }
        });

        lblXCT5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXCT5.setText("Làm mới");
        btnThemSach.add(lblXCT5);

        jPanel4.add(btnThemSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 120, 30));

        btnSuaSach.setBackground(new java.awt.Color(125, 200, 150));
        btnSuaSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(125, 200, 150), null, null));
        btnSuaSach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaSachMouseClicked(evt);
            }
        });

        lblXCT6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXCT6.setText("Sửa sách");
        btnSuaSach.add(lblXCT6);

        jPanel4.add(btnSuaSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 120, 30));

        txtTimSach.setPreferredSize(new java.awt.Dimension(64, 24));
        jPanel4.add(txtTimSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 210, -1));

        jPanel3.setPreferredSize(new java.awt.Dimension(24, 24));

        btnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiem.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemChiTietMouseClicked
        // TODO add your handling code here:
        FrmSach sach = new FrmSach();
        sach.setEdit();
        sach.setVisible(true);
    }//GEN-LAST:event_btnXemChiTietMouseClicked

    private void btnXemPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemPhieuNhapMouseClicked
        // TODO add your handling code here:
         new FrmDSPN().setVisible(true);
    }//GEN-LAST:event_btnXemPhieuNhapMouseClicked

    private void btnXoaSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaSachMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaSachMouseClicked

    private void btnVietPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVietPhieuNhapMouseClicked
        // TODO add your handling code here:
        new FrmPhieuNhap().setVisible(true);
    }//GEN-LAST:event_btnVietPhieuNhapMouseClicked

    private void btnThemSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemSachMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemSachMouseClicked

    private void btnSuaSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaSachMouseClicked
        // TODO add your handling code here:
        new FrmSach().setVisible(true);
    }//GEN-LAST:event_btnSuaSachMouseClicked

    private void seticon(){
        URL urlSearch = getClass().getResource("/Images/search.png");
        btnTimKiem.setIcon(setsize.setSizeAnh(urlSearch, 24, 24));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSuaSach;
    private javax.swing.JPanel btnThemSach;
    private javax.swing.JLabel btnTimKiem;
    private javax.swing.JPanel btnVietPhieuNhap;
    private javax.swing.JPanel btnXemChiTiet;
    private javax.swing.JPanel btnXemPhieuNhap;
    private javax.swing.JPanel btnXoaSach;
    private javax.swing.JLabel imgBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblXCT;
    private javax.swing.JLabel lblXCT1;
    private javax.swing.JLabel lblXCT3;
    private javax.swing.JLabel lblXCT4;
    private javax.swing.JLabel lblXCT5;
    private javax.swing.JLabel lblXCT6;
    private javax.swing.JTable tblKhoSach;
    private javax.swing.JTextField txtTimSach;
    // End of variables declaration//GEN-END:variables
}
