/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.PhieuNhap;
import DomainModels.Sach;
import DomainModels.SachCT;
import Repositories.IPhieuNhapViewModelRepository;
import Utilities.DBConnection;
import Utilities.DBContext;
import ViewModels.PhieuNhapViewmodel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class PhieuNhapViewModelRepository implements IPhieuNhapViewModelRepository {
    
    final SachRepository REPO_SACH = new SachRepository();
    final SachCTRepository REPO_SACHCT = new SachCTRepository();
    final PhieuNhapRepository REPO_PN = new PhieuNhapRepository();
    String sql_TheLoai = """
                         SELECT DIStinct TenTL FROM TheLoaiSach JOIN TLSACHCT ON TheLoaiSach.IDTL = TLSACHCT.IdTLSach
                         JOIN Sach ON TLSACHCT.IDSach = ?""";
    String sql_TacGia = """
                        SELECT DIStinct TenTacGia FROM TacGia JOIN TacGiaCT ON TacGia.IDTacGia = TacGiaCT.IDTacGia
                        JOIN Sach ON TacGiaCT.IDSach = ?""";
    String sql_NCC = """
                        SELECT DIStinct TenNhaCC FROM NhaCC JOIN NHACCCT ON NHACCCT.IdNhacc = NhaCC.IdNhaCC
                        JOIN PhieuNhap ON NHACCCT.IdPhieuNhap = ?""";
    String sql_NXB = """
                        SELECT DIStinct TENNXB FROM NhaXuatBan JOIN NXBCT ON NXBCT.IDNhaXuatBan = NhaXuatBan.IDNhaXuatBan
                        JOIN SachCT ON NXBCT.IDSACHCT = ?""";
    @Override
    public PhieuNhapViewmodel getPhieuNhapView(String ma, PhieuNhap PN) {
        Sach sach = REPO_SACH.getByMa(ma);
        String idSach = sach.getId();
        SachCT sachCT = REPO_SACHCT.getByIDSach(idSach);
        List<String> _lstTacGia = getEnityName(sql_TacGia, idSach);
        String NXB = getEnityName(sql_NXB, sachCT.getId()).get(0);
        List<String> _lstTheLoai = getEnityName(sql_TheLoai, idSach);
        String NhaCC = getEnityName(sql_NCC, PN.getId()).isEmpty()?null: getEnityName(sql_NCC, PN.getId()).get(0);
        
        PhieuNhapViewmodel view = new PhieuNhapViewmodel(PN.getId(), sach.getMa(), sach.getTen(),
                sachCT.getImg(), _lstTacGia, PN.getSl(), NXB, _lstTheLoai, sachCT.getNamxb(),PN.getNgay(),
                PN.getGiaNhap(), NhaCC, sachCT.getSeri());
        return view;
    }
    
    public List<String> getEnityName(String sql, Object... args) {
        List<String> _lst = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while (rs.next()) {
                String ten = rs.getString(1);
                _lst.add(ten);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return _lst;
    }
    
    @Override
    public List<PhieuNhapViewmodel> getAll() {
        ArrayList<PhieuNhapViewmodel> listpnv = new ArrayList<>();
        String sql = "select PhieuNhap.IdPhieuNhap,PhieuNhap.NgayNhap,"
                + "Sach.MaSach from PhieuNhap join SachCT on PhieuNhap.IDSachCT "
                + "= SachCT.IDSachCT JOIN Sach on SachCT.IDSach = Sach.IDSach";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuNhapViewmodel pnv = new PhieuNhapViewmodel();
                pnv.setIdPhieuNhap(rs.getString("IdPhieuNhap"));
                pnv.setNgayNhap(rs.getDate("NgayNhap"));
                pnv.setMaSach(rs.getString("MaSach"));
                listpnv.add(pnv);
            }
        } catch (Exception e) {
        }
        return listpnv;
    }
    
}
