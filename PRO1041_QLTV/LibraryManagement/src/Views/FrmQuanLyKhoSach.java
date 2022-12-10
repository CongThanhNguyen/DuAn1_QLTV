/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import DomainModels.CuonSach;
import DomainModels.PhieuMuon;
import DomainModels.PhieuMuonCT;
import DomainModels.Sach;
import DomainModels.SachCT;
import Services.Impl.CuonSachService;
import Services.Impl.KhoSachServices;
import Services.Impl.NhaXuatBanService;
import Services.Impl.PhieuMuonCTService;
import Services.Impl.PhieuNhapService;
import Services.Impl.PhieuNhapViewModelService;
import Services.Impl.SachCTService;
import Services.Impl.SachService;
import Services.Impl.TacGiaService;
import Services.Impl.TheLoaiService;
import Services.KhoSachService;
import Utilities.SetSize;
import ViewModels.KhoSachViewModels;
import ViewModels.SachCTViewModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.net.URL;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Admin
 */
public class FrmQuanLyKhoSach extends javax.swing.JPanel {

    final SetSize setsize = new SetSize();

    public static KhoSachService ksSV = new KhoSachServices();
    final PhieuNhapService SERVICE = new PhieuNhapService();
    final SachService SERVICE_SACH = new SachService();
    final SachCTService SERVICE_SACHCT = new SachCTService();
    final TheLoaiService SERVICE_TLS = new TheLoaiService();
    final TacGiaService SERVICE_TG = new TacGiaService();
    final NhaXuatBanService SERVICE_NXB = new NhaXuatBanService();
    final PhieuNhapViewModelService SERVICE_VIEW = new PhieuNhapViewModelService();
    final CuonSachService SERVICE_CS = new CuonSachService();
    final PhieuMuonCTService SERVICE_PMCT = new PhieuMuonCTService();

    /**
     * Creates new form FrmKhoSach
     */
    public FrmQuanLyKhoSach() {
        initComponents();
        setTable(tblKhoSach);
        this.seticon();
        this.fillTable(ksSV.getAll());
        this.setViewSach(SERVICE_SACH.getAll().isEmpty()?null:"MS20001");
    }

    public void fillTable(List<KhoSachViewModels> listKS) 
    {
        DefaultTableModel tblModel = (DefaultTableModel) tblKhoSach.getModel();
        tblModel.setRowCount(0);
        for (KhoSachViewModels khoSachViewModels : listKS) {
            String theLoai = "";
            for (String string : khoSachViewModels.getTenLoaiSach()) {
                theLoai += string+", ";
            }
//            theLoai = theLoai.substring(0, theLoai.length()-2);
            Object[] row = new Object[]{
                khoSachViewModels.getMaSach(),
                khoSachViewModels.getTenSach(),
                theLoai
            };
            tblModel.addRow(row);
        }
        tblKhoSach.setModel(tblModel);
    }

    public static void setTable(JTable table) {
        Font bigFont = new Font("Segoe UI", Font.PLAIN, 14);
        table.getTableHeader().setFont(bigFont);
        table.getTableHeader().setPreferredSize(new Dimension(WIDTH, 32));
        table.getColumnModel().getColumn(0).setPreferredWidth(150);
        table.getColumnModel().getColumn(0).setMaxWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setMaxWidth(200);
        table.setRowHeight(28);

        JTableHeader header = table.getTableHeader();
        header.setBackground(new Color(125, 200, 150));
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

        pnSachView = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        imgBook = new javax.swing.JLabel();
        lblTenSach = new javax.swing.JLabel();
        btnXemChiTiet = new javax.swing.JPanel();
        lblXCT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTacGia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblNXB = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTL = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblLuotMuon = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblMaSach = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnXemPhieuNhap = new javax.swing.JPanel();
        lblXCT1 = new javax.swing.JLabel();
        btnVietPhieuNhap = new javax.swing.JPanel();
        lblXCT4 = new javax.swing.JLabel();
        btnSuaSach = new javax.swing.JPanel();
        lblXCT6 = new javax.swing.JLabel();
        txtTimSach = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JLabel();
        btnrefresh = new javax.swing.JLabel();
        btnSuaSach1 = new javax.swing.JPanel();
        lblXCT7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhoSach = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 530));
        setPreferredSize(new java.awt.Dimension(780, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(170, 250));
        jPanel2.setPreferredSize(new java.awt.Dimension(170, 250));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgBook, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblTenSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenSach.setText("Tư duy nhanh và chậm");

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

        lblTacGia.setText("Daniel Kehlmann");

        jLabel5.setText("Số lượng:");

        lblSoLuong.setText("50");

        jLabel8.setText("Nhà xb:");

        lblNXB.setText("Alpha book");

        jLabel10.setText("Thể loại:");

        lblTL.setText("Tâm Lý - Kỹ Năng Sống");

        jLabel12.setText("Lượt mượn:");

        lblLuotMuon.setText("300");

        jLabel16.setText("Mã sách:");

        lblMaSach.setText("SA2001");

        javax.swing.GroupLayout pnSachViewLayout = new javax.swing.GroupLayout(pnSachView);
        pnSachView.setLayout(pnSachViewLayout);
        pnSachViewLayout.setHorizontalGroup(
            pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSachViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnSachViewLayout.createSequentialGroup()
                        .addGroup(pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMaSach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSoLuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNXB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(lblLuotMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTacGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(pnSachViewLayout.createSequentialGroup()
                        .addComponent(btnXemChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnSachViewLayout.setVerticalGroup(
            pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSachViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addGroup(pnSachViewLayout.createSequentialGroup()
                        .addComponent(lblTenSach)
                        .addGap(18, 18, 18)
                        .addGroup(pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lblMaSach))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTacGia)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSoLuong)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblNXB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTL, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnSachViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblLuotMuon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXemChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Nhập sách");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Thư viện");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(125, 200, 150));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 320, 10));

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
        jPanel4.add(txtTimSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 210, -1));

        jPanel3.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        btnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiem.setPreferredSize(new java.awt.Dimension(24, 24));
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
        });
        jPanel4.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 23, -1));

        btnrefresh.setText("jLabel3");
        btnrefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnrefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrefreshMouseClicked(evt);
            }
        });
        jPanel4.add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 32, 32));

        btnSuaSach1.setBackground(new java.awt.Color(125, 200, 150));
        btnSuaSach1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(125, 200, 150), null, null));
        btnSuaSach1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaSach1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaSach1MouseClicked(evt);
            }
        });

        lblXCT7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblXCT7.setText("Sách cần thay");
        btnSuaSach1.add(lblXCT7);

        jPanel4.add(btnSuaSach1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 120, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("KHO SÁCH"));

        tblKhoSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MÃSÁCH", "TÊN SÁCH", "THỂ LOẠI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhoSach.setGridColor(new java.awt.Color(255, 255, 255));
        tblKhoSach.setMaximumSize(new java.awt.Dimension(225, 80));
        tblKhoSach.setSelectionBackground(new java.awt.Color(125, 220, 125));
        tblKhoSach.setShowGrid(false);
        tblKhoSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhoSach);
        if (tblKhoSach.getColumnModel().getColumnCount() > 0) {
            tblKhoSach.getColumnModel().getColumn(0).setResizable(false);
            tblKhoSach.getColumnModel().getColumn(1).setResizable(false);
            tblKhoSach.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnSachView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(pnSachView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemChiTietMouseClicked
        String ma = lblMaSach.getText();
        SachCTViewModel view = ksSV.getKhoSachView(ma);
        FrmSach sach = new FrmSach();
        sach.setVisible(true);
        sach.setEdit();
        sach.setDisplay(view);
    }//GEN-LAST:event_btnXemChiTietMouseClicked

    private void btnXemPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemPhieuNhapMouseClicked
        // TODO add your handling code here:
        new FrmDSPN().setVisible(true);
    }//GEN-LAST:event_btnXemPhieuNhapMouseClicked

    private void btnVietPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVietPhieuNhapMouseClicked
        // TODO add your handling code here:
        FrmKiemTraPhieuNhap frm =new FrmKiemTraPhieuNhap();
        frm.setVisible(true);
        frm.setLocationRelativeTo(this.btnVietPhieuNhap);
    }//GEN-LAST:event_btnVietPhieuNhapMouseClicked

    private void btnSuaSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaSachMouseClicked
        String ma = lblMaSach.getText();
        SachCTViewModel view = ksSV.getKhoSachView(ma);
        FrmSach sach = new FrmSach();
        sach.setDisplay(view);
        sach.setVisible(true);
        
    }//GEN-LAST:event_btnSuaSachMouseClicked

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked
        // TODO add your handling code here:
        String tuKhoa = txtTimSach.getText();
        if (tuKhoa.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hoặc sách để thực hiện!");
            return;
        }
        List<KhoSachViewModels> _lst = ksSV.getBySearch(tuKhoa);
        if (_lst.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy sách!");
            return;
        }
        fillTable(_lst);
    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void tblKhoSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoSachMouseClicked
        // TODO add your handling code here:
        int i = tblKhoSach.getSelectedRow();
        String ma = tblKhoSach.getValueAt(i, 0).toString();
        this.setViewSach(ma);
    }//GEN-LAST:event_tblKhoSachMouseClicked

    public void setViewSach(String ma){
        if(ma != null){
            SachCTViewModel view = ksSV.getKhoSachView(ma);
            String ten = view.getTenSach();
            lblTenSach.setText(ten);
            String hoten = "";
            for (String string : view.getTacGia()) {
                hoten += string + "-";
            }
//            hoten = hoten.substring(0, hoten.length() - 1);
            String theloai = "";
            for (String string : view.getTheLoai()) {
                theloai += string + "-";
            }
            theloai = theloai.substring(0, theloai.length() - 1);
            String icon = view.getImg();
            URL urlicon = getClass().getResource(icon);
            imgBook.setIcon(setsize.setSizeAnh(urlicon, 170, 250));
            lblMaSach.setText(view.getMaSach());
            lblTacGia.setText(hoten);
            lblSoLuong.setText(view.getSoLuong() + "");
            lblNXB.setText(view.getNhaXuatBan());
            lblTL.setText(theloai);
            Sach sach = SERVICE_SACH.getByMa(ma);
            SachCT sachct = SERVICE_SACHCT.getByIDSach(sach.getId());
            String luotMuon = SERVICE_PMCT.LuotMuonSach(sachct.getId());
            lblLuotMuon.setText(luotMuon);
        }
    }
    private void btnrefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrefreshMouseClicked
        // TODO add your handling code here:
        fillTable(ksSV.getAll());
    }//GEN-LAST:event_btnrefreshMouseClicked

    private void btnSuaSach1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaSach1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaSach1MouseClicked

    private void seticon() {
        imgBook.setIcon(setsize.setSizeAnh(getClass().getResource("/Images/imgSach/book-demo.jpg"), 170, 250));
        URL urlSearch = getClass().getResource("/Images/search.png");
        URL urlRefreash = getClass().getResource("/Images/refresh.png");
        btnrefresh.setIcon(setsize.setSizeAnh(urlRefreash, 32, 32));
        btnTimKiem.setIcon(setsize.setSizeAnh(urlSearch, 24, 24));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSuaSach;
    private javax.swing.JPanel btnSuaSach1;
    private javax.swing.JLabel btnTimKiem;
    private javax.swing.JPanel btnVietPhieuNhap;
    private javax.swing.JPanel btnXemChiTiet;
    private javax.swing.JPanel btnXemPhieuNhap;
    private javax.swing.JLabel btnrefresh;
    private javax.swing.JLabel imgBook;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLuotMuon;
    public javax.swing.JLabel lblMaSach;
    private javax.swing.JLabel lblNXB;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTL;
    private javax.swing.JLabel lblTacGia;
    private javax.swing.JLabel lblTenSach;
    private javax.swing.JLabel lblXCT;
    private javax.swing.JLabel lblXCT1;
    private javax.swing.JLabel lblXCT4;
    private javax.swing.JLabel lblXCT6;
    private javax.swing.JLabel lblXCT7;
    public static javax.swing.JPanel pnSachView;
    public static javax.swing.JTable tblKhoSach;
    private javax.swing.JTextField txtTimSach;
    // End of variables declaration//GEN-END:variables

}
