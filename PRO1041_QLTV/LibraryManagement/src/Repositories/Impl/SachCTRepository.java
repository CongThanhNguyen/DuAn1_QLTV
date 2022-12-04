/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;


import DomainModels.Sach;
import Repositories.ISachCTRepository;
import DomainModels.SachCT;
import Utilities.DBConnection;
import java.math.BigDecimal;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SachCTRepository implements ISachCTRepository{
    final TacGiaRepository REPO_TACGIA = new TacGiaRepository();
    final TheLoaiSachRepository REPO_TLS = new  TheLoaiSachRepository();
    final SachRepository REPO_SACH = new SachRepository();
    
    String sql = "Select * from SachCT";
    String sql_by_IDSach = "Select * from SachCT where IDSach = ?";
    String sql_by_ID = "Select * from SachCT where IDSachCT = ?";
    String insert = "insert into SachCT(NamXuatBan, img, GiaInTrenSach, seri,"
            + "IDSach) values (?,?,?,?,?)";
    String sql_by_ma = "select * from Sach where MaSach like ?";
    String sql_by_ten = "select * from Sach where TenSach like ?";
    String sql_by_barcode = "Select * from Sachct where seri = ?";
    
    @Override
    public SachCT insert(SachCT sachCT) {
        try {
            PreparedStatement ps = DBConnection.getStmt(insert, sachCT.getNamxb(),
                    sachCT.getImg(), sachCT.getGiaIn(),sachCT.getSeri(), sachCT.getSach().getId());
            int i = ps.executeUpdate();
            return i==1?sachCT:null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public SachCT delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SachCT update(SachCT sachCT) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SachCT> getAll() {
        return getBySQL(sql);
    }

    @Override
    public SachCT getByIDSach(String ID) {
        System.out.println(ID);
        return this.getBySQL(sql_by_IDSach, ID).get(0);
    }
    
    private List<SachCT> getBySQL(String sql, Object ...args){
        List<SachCT> _lst = new ArrayList<>();
        PreparedStatement ps = DBConnection.getStmt(sql, args);
        ResultSet rs;
        try {
            rs = ps.executeQuery();
            while(rs.next()){
                String id = rs.getString(1);
                int namXb = rs.getInt(2);
                String img = rs.getString(3);
                BigDecimal giain = rs.getBigDecimal(4);
                String seri = rs.getString(5);
                String idSach = rs.getString(6);
                Sach sach = REPO_SACH.getByID(idSach);
                SachCT sachCT = new SachCT(id, namXb, img, giain, seri, sach);
                _lst.add(sachCT);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return _lst;
    }
    @Override
    public SachCT getByID(String ID) {
        return this.getBySQL(sql_by_ID, ID).get(0);
    }

    
    public List<SachCT> getBySearch(String tuKhoa) {

        tuKhoa = "%"+tuKhoa+"%";
        //Lấy danh sách bằng mã
        List<SachCT> _lst = getBySQL(sql_by_ma, tuKhoa);
        //Lấy danh sách bằng tên
        if (_lst.isEmpty()) {
            _lst = getBySQL(sql_by_ten, tuKhoa);
        }
        return _lst;
    }
    
    @Override
    public SachCT getByBarcode(String barcode) {
        return getBySQL(sql_by_barcode, barcode).get(0);
    }
}