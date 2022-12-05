/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Utilities.SetColor;
import Utilities.SetSize;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;  

/**
 *
 * @author Admin
 */
public class FrmChinh extends javax.swing.JFrame {
    final private SetSize setsize =new SetSize();
    final private SetColor setcolor =new SetColor();
    //Đây là form chính
    
    /**
     * Creates new form FrmTrangChu
     */
    public FrmChinh() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIcon();
        this.setFrmChinh(new FrmTrangChu());
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JPanel();
        iconHome = new javax.swing.JLabel();
        lblTrangChu = new javax.swing.JLabel();
        btnDocGia = new javax.swing.JPanel();
        iconDocGia = new javax.swing.JLabel();
        lblDocGia = new javax.swing.JLabel();
        btnBaoCao = new javax.swing.JPanel();
        iconBaoCao = new javax.swing.JLabel();
        lblBaoCao = new javax.swing.JLabel();
        btnMuonTra = new javax.swing.JPanel();
        iconMuonTra = new javax.swing.JLabel();
        lblMuonTra = new javax.swing.JLabel();
        btnKhoSach = new javax.swing.JPanel();
        iconKhoSach = new javax.swing.JLabel();
        lblKhoSach = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnThongke = new javax.swing.JPanel();
        iconThongKe = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        btnViPham = new javax.swing.JPanel();
        iconViPham = new javax.swing.JLabel();
        lblViPham = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        iconmatCuoi = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JLabel();
        frmDiff = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(125, 180, 125));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 660));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTrangChu.setBackground(new java.awt.Color(125, 220, 125));
        btnTrangChu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrangChu.setPreferredSize(new java.awt.Dimension(300, 60));
        btnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTrangChuMousePressed(evt);
            }
        });

        iconHome.setPreferredSize(new java.awt.Dimension(60, 60));

        lblTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTrangChu.setText("Trang chủ");

        javax.swing.GroupLayout btnTrangChuLayout = new javax.swing.GroupLayout(btnTrangChu);
        btnTrangChu.setLayout(btnTrangChuLayout);
        btnTrangChuLayout.setHorizontalGroup(
            btnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTrangChuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(iconHome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        btnTrangChuLayout.setVerticalGroup(
            btnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTrangChuLayout.createSequentialGroup()
                .addGroup(btnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 143, -1, -1));

        btnDocGia.setBackground(new java.awt.Color(125, 190, 125));
        btnDocGia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDocGia.setPreferredSize(new java.awt.Dimension(300, 60));
        btnDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDocGiaMousePressed(evt);
            }
        });

        iconDocGia.setPreferredSize(new java.awt.Dimension(60, 60));

        lblDocGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDocGia.setText("Độc giả");

        javax.swing.GroupLayout btnDocGiaLayout = new javax.swing.GroupLayout(btnDocGia);
        btnDocGia.setLayout(btnDocGiaLayout);
        btnDocGiaLayout.setHorizontalGroup(
            btnDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDocGiaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(iconDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        btnDocGiaLayout.setVerticalGroup(
            btnDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDocGiaLayout.createSequentialGroup()
                .addGroup(btnDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, -1));

        btnBaoCao.setBackground(new java.awt.Color(125, 190, 125));
        btnBaoCao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaoCao.setPreferredSize(new java.awt.Dimension(300, 60));
        btnBaoCao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBaoCaoMousePressed(evt);
            }
        });

        iconBaoCao.setPreferredSize(new java.awt.Dimension(60, 60));

        lblBaoCao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBaoCao.setText("Báo cáo");

        javax.swing.GroupLayout btnBaoCaoLayout = new javax.swing.GroupLayout(btnBaoCao);
        btnBaoCao.setLayout(btnBaoCaoLayout);
        btnBaoCaoLayout.setHorizontalGroup(
            btnBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBaoCaoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(iconBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        btnBaoCaoLayout.setVerticalGroup(
            btnBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBaoCaoLayout.createSequentialGroup()
                .addGroup(btnBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnBaoCao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, -1));

        btnMuonTra.setBackground(new java.awt.Color(125, 190, 125));
        btnMuonTra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMuonTra.setPreferredSize(new java.awt.Dimension(300, 60));
        btnMuonTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMuonTraMousePressed(evt);
            }
        });

        iconMuonTra.setPreferredSize(new java.awt.Dimension(60, 60));

        lblMuonTra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMuonTra.setText("Mượn trả");

        javax.swing.GroupLayout btnMuonTraLayout = new javax.swing.GroupLayout(btnMuonTra);
        btnMuonTra.setLayout(btnMuonTraLayout);
        btnMuonTraLayout.setHorizontalGroup(
            btnMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMuonTraLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(iconMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMuonTra, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        btnMuonTraLayout.setVerticalGroup(
            btnMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMuonTraLayout.createSequentialGroup()
                .addGroup(btnMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconMuonTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMuonTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnMuonTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, -1));

        btnKhoSach.setBackground(new java.awt.Color(125, 190, 125));
        btnKhoSach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKhoSach.setPreferredSize(new java.awt.Dimension(300, 60));
        btnKhoSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhoSachMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKhoSachMousePressed(evt);
            }
        });

        iconKhoSach.setPreferredSize(new java.awt.Dimension(60, 60));

        lblKhoSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblKhoSach.setText("Kho sách");

        javax.swing.GroupLayout btnKhoSachLayout = new javax.swing.GroupLayout(btnKhoSach);
        btnKhoSach.setLayout(btnKhoSachLayout);
        btnKhoSachLayout.setHorizontalGroup(
            btnKhoSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKhoSachLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(iconKhoSach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKhoSach, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        btnKhoSachLayout.setVerticalGroup(
            btnKhoSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKhoSachLayout.createSequentialGroup()
                .addGroup(btnKhoSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconKhoSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKhoSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnKhoSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, -1));

        jPanel10.setBackground(new java.awt.Color(125, 180, 125));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Quản lý thư viện");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel10.add(jLabel6);

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 20));

        btnThongke.setBackground(new java.awt.Color(125, 190, 125));
        btnThongke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongke.setPreferredSize(new java.awt.Dimension(300, 60));
        btnThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThongkeMousePressed(evt);
            }
        });

        iconThongKe.setPreferredSize(new java.awt.Dimension(60, 60));

        lblThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblThongKe.setText("Thống kê");

        javax.swing.GroupLayout btnThongkeLayout = new javax.swing.GroupLayout(btnThongke);
        btnThongke.setLayout(btnThongkeLayout);
        btnThongkeLayout.setHorizontalGroup(
            btnThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThongkeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(iconThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        btnThongkeLayout.setVerticalGroup(
            btnThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThongkeLayout.createSequentialGroup()
                .addGroup(btnThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnThongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 300, -1));

        btnViPham.setBackground(new java.awt.Color(125, 190, 125));
        btnViPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViPham.setPreferredSize(new java.awt.Dimension(300, 60));
        btnViPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnViPhamMousePressed(evt);
            }
        });

        iconViPham.setPreferredSize(new java.awt.Dimension(60, 60));

        lblViPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblViPham.setText("Vi phạm");

        javax.swing.GroupLayout btnViPhamLayout = new javax.swing.GroupLayout(btnViPham);
        btnViPham.setLayout(btnViPhamLayout);
        btnViPhamLayout.setHorizontalGroup(
            btnViPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnViPhamLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(iconViPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblViPham, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        btnViPhamLayout.setVerticalGroup(
            btnViPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnViPhamLayout.createSequentialGroup()
                .addGroup(btnViPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconViPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblViPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnViPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 300, -1));

        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(125, 200, 150));
        jPanel2.setPreferredSize(new java.awt.Dimension(677, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Library management...");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Happy library from FPT polytechnic");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        iconmatCuoi.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.add(iconmatCuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 60, 60));

        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseClicked(evt);
            }
        });
        jPanel2.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 20, 20));
        btnDangXuat.getAccessibleContext().setAccessibleDescription("");

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 780, 130));

        frmDiff.setBackground(new java.awt.Color(255, 255, 255));
        frmDiff.setPreferredSize(new java.awt.Dimension(780, 530));
        frmDiff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(frmDiff, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 780, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnTrangChuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMousePressed
        // TODO add your handling code here:
        this.setcolor.changeColorBtn("Trang chủ", getBtn());
        this.setFrmChinh(new FrmTrangChu());
    }//GEN-LAST:event_btnTrangChuMousePressed

    private void btnKhoSachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhoSachMousePressed
        // TODO add your handling code here:
        this.setFrmChinh(new FrmQuanLyKhoSach());
        this.setcolor.changeColorBtn("Kho sách", getBtn());
        
    }//GEN-LAST:event_btnKhoSachMousePressed

    private void btnDocGiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocGiaMousePressed
        // TODO add your handling code here:
        this.setFrmChinh(new FrmQuanLyDocGia());
        this.setcolor.changeColorBtn("Độc giả", getBtn());
    }//GEN-LAST:event_btnDocGiaMousePressed

    private void btnMuonTraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuonTraMousePressed
        // TODO add your handling code here:
        this.setFrmChinh(new FrmQuanLyMuonTra());
        this.setcolor.changeColorBtn("Mượn trả", getBtn());
    }//GEN-LAST:event_btnMuonTraMousePressed

    private void btnBaoCaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaoCaoMousePressed
        // TODO add your handling code here:
        this.setFrmChinh(new FrmQuanLyBaoCao());
        this.setcolor.changeColorBtn("Báo cáo", getBtn());
    }//GEN-LAST:event_btnBaoCaoMousePressed

    private void btnThongkeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongkeMousePressed
        // TODO add your handling code here:
        this.setFrmChinh(new FrmQuanLyThongKe());
        this.setcolor.changeColorBtn("Thống kê", getBtn());
    }//GEN-LAST:event_btnThongkeMousePressed

    private void btnViPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViPhamMousePressed
        // TODO add your handling code here:
        this.setFrmChinh(new FrmQuanLyViPham());
        this.setcolor.changeColorBtn("Vi phạm", getBtn());
    }//GEN-LAST:event_btnViPhamMousePressed

    private void btnKhoSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhoSachMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKhoSachMouseClicked

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new FrmLogin().setVisible(true);
    }//GEN-LAST:event_btnDangXuatMouseClicked


    private void setIcon(){
        URL urlHome = getClass().getResource("/Images/home.png");
        URL urlKhoSach = getClass().getResource("/Images/book-alt.png");
        URL urlDocGia = getClass().getResource("/Images/users-alt.png");
        URL urlMuonTra = getClass().getResource("/Images/user-time.png");
        URL urlBaoCao = getClass().getResource("/Images/megaphone.png");
        URL urlViPham = getClass().getResource("/Images/exclamation.png");
        URL urlThongKe = getClass().getResource("/Images/document-signed.png");
        URL urlMatCuoi = getClass().getResource("/Images/grin-wink.png");
        URL urlDangXuat = getClass().getResource("/Images/exit.png");
        iconHome.setIcon(setsize.setSizeAnh(urlHome, 20, 20));
        iconKhoSach.setIcon(setsize.setSizeAnh(urlKhoSach, 20, 20));
        iconDocGia.setIcon(setsize.setSizeAnh(urlDocGia, 20, 20));
        iconMuonTra.setIcon(setsize.setSizeAnh(urlMuonTra, 20, 20));
        iconBaoCao.setIcon(setsize.setSizeAnh(urlBaoCao, 20, 20));
        iconViPham.setIcon(setsize.setSizeAnh(urlViPham, 20, 20));
        iconThongKe.setIcon(setsize.setSizeAnh(urlThongKe, 20, 20));
        iconmatCuoi.setIcon(setsize.setSizeAnh(urlMatCuoi, 40, 40));
        btnDangXuat.setIcon(setsize.setSizeAnh(urlDangXuat, 20, 20));
        URL url = getClass().getResource("/Images/iconTrangchu.png");
        ImageIcon imgi = setsize.setSizeAnh(url, 24, 24);
        Image img = imgi.getImage();
        this.setIconImage(img);
    }
    
    public void setFrmChinh(Component frmSet){
        frmDiff.removeAll();
        frmDiff.setLayout(new CardLayout(0, 0));
        frmDiff.add(frmSet);
        frmDiff.revalidate();
        frmDiff.repaint();
    }
    
    private JLabel [] getBtn(){
        final JLabel[] _lstCN= {lblTrangChu, lblBaoCao, lblDocGia, lblKhoSach, 
            lblMuonTra, lblThongKe,lblViPham};
        return _lstCN;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBaoCao;
    private javax.swing.JLabel btnDangXuat;
    private javax.swing.JPanel btnDocGia;
    private javax.swing.JPanel btnKhoSach;
    private javax.swing.JPanel btnMuonTra;
    private javax.swing.JPanel btnThongke;
    private javax.swing.JPanel btnTrangChu;
    private javax.swing.JPanel btnViPham;
    private javax.swing.JPanel frmDiff;
    private javax.swing.JLabel iconBaoCao;
    private javax.swing.JLabel iconDocGia;
    private javax.swing.JLabel iconHome;
    private javax.swing.JLabel iconKhoSach;
    private javax.swing.JLabel iconMuonTra;
    private javax.swing.JLabel iconThongKe;
    private javax.swing.JLabel iconViPham;
    private javax.swing.JLabel iconmatCuoi;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBaoCao;
    private javax.swing.JLabel lblDocGia;
    private javax.swing.JLabel lblKhoSach;
    private javax.swing.JLabel lblMuonTra;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JLabel lblViPham;
    // End of variables declaration//GEN-END:variables
}
