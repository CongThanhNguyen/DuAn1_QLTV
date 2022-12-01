/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;


import DomainModels.NhaXuatBan;
import DomainModels.PhieuNhap;
import DomainModels.Sach;
import Repositories.ISachCTRepository;
import DomainModels.SachCT;
import DomainModels.TacGia;
import DomainModels.TheLoaiSach;
import Utilities.DBConnection;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    String insert = "insert into SachCT(NamXuatBan, img, GiaInTrenSach,"
            + "IDSach) values (?,?,?,?)";
    String sql_by_ma = "select * from Sach where MaSach like ?";
    String sql_by_ten = "select * from Sach where TenSach like ?";
    
    @Override
    public SachCT insert(SachCT sachCT) {
        try {
            PreparedStatement ps = DBConnection.getStmt(insert, sachCT.getNamxb(),
                    sachCT.getImg(), sachCT.getGiaIn(), sachCT.getSach().getId());
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
                String idSach = rs.getString(5);
                Sach sach = REPO_SACH.getByID(idSach);
                SachCT sachCT = new SachCT(id, namXb, img, giain, sach);
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
    
}
