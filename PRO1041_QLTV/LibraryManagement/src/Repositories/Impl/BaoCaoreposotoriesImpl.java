/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import Repositories.BaoCaoRepositories;
import Utilities.DBContext;
import ViewModels.BaoCaoDSViewModels;
import ViewModels.BaoCaoPMViewModels;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Apc
 */
public class BaoCaoreposotoriesImpl implements BaoCaoRepositories {

    @Override
    public List<BaoCaoPMViewModels> getPhieuMuonByMa(String ma) {
        ArrayList<BaoCaoPMViewModels> dsbaoCaoPMViewModelses = new ArrayList<>();

        try {
            Connection connection = DBContext.getConnection();
            String sql = "SELECT dg.TenDOcGia ,s.TenSach,pm.NgayMuon FROM PhieuMuonCT ct \n"
                    + "JOIN Sach s on s.IDSach = ct.IdSach\n"
                    + "JOIN PhieuMuon pm on pm.IDPhieuMuon = ct.IDPhieuMuon\n"
                    + "JOIN DocGia dg on dg.IDDocGia = pm.IDDocGia\n"
                    + "WHERE ct.MaPhieuMuon = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String DocGia = rs.getString("TenDOcGia");
                String Sach = rs.getString("TenSach");
                Date NgayMuon = rs.getDate("NgayMuon");
                BaoCaoPMViewModels baoCaoPMViewModels = new BaoCaoPMViewModels(DocGia, Sach, NgayMuon);
                dsbaoCaoPMViewModelses.add(baoCaoPMViewModels);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsbaoCaoPMViewModelses;
    }

    @Override
    public List<BaoCaoDSViewModels> LoadTableBaoCao() {
        ArrayList<BaoCaoDSViewModels> dsTablebaoCaoPMViewModelses = new ArrayList<>();

        try {
            Connection connection = DBContext.getConnection();
            String sql = "SELECT ct.MaPhieuMuon,dg.MaDocGia,vp.NgayVP FROM DocGia dg \n"
                    + "JOIN PhieuMuon pm ON pm.IDDocGia = dg.IDDocGia\n"
                    + "JOIN PhieuMuonCT ct ON pm.IDPhieuMuon = ct.IDPhieuMuon\n"
                    + "JOIN ViPham vp ON vp.MaPM = ct.MaPhieuMuon";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maPM = rs.getString("MaPhieuMuon");
                String maDG = rs.getString("MaDocGia");
                Date ngayMuon = rs.getDate("NgayVP");
                BaoCaoDSViewModels baoCaoDSViewModels = new BaoCaoDSViewModels(maPM, maDG, ngayMuon);
                dsTablebaoCaoPMViewModelses.add(baoCaoDSViewModels);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsTablebaoCaoPMViewModelses;
    }

}
