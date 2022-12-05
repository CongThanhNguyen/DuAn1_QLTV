/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.NhaXuatBan;
import Repositories.INhaXuatBanRepository;
import Utilities.DBConnection;
import Utilities.DBContext;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NhaXuatBanRepository implements INhaXuatBanRepository {

    String sql = "Select * from NhaXuatBan";
    String sqlByID = "Select * from NhaXuatBan where id =?";
    String insert_NXBCT = "Insert into NXBCT values(?,?)";
    String sqlByName = "select * from NhaXuatBan where TenNhaXuatBan = ?";

    @Override
    public NhaXuatBan insert(NhaXuatBan nxb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhaXuatBan delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhaXuatBan update(NhaXuatBan nxb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<NhaXuatBan> getAll() {
        return getBySql(sql);
    }

    @Override
    public NhaXuatBan getByID(String id) {
        return getBySql(sqlByID, id).get(0);
    }

    private List<NhaXuatBan> getBySql(String sql, Object... args) {
        List<NhaXuatBan> _lst = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while (rs.next()) {
                String id = rs.getString(1);
                String hoTen = rs.getString(2);
                String diaChi = rs.getString(3);
                NhaXuatBan tacGia = new NhaXuatBan(id, hoTen, diaChi);
                _lst.add(tacGia);
            }
        } catch (SQLException ex) {
            return null;
        }
        return _lst;
    }

    @Override
    public int insertNXBCT(String idNXB, String idSachCT) {
        return DBConnection.ExcuteDungna(insert_NXBCT, idNXB, idSachCT);
    }

    @Override
    public NhaXuatBan getByName(String ten) {
        return getBySql(sqlByName, ten).get(0);
    }

    @Override
    public void Them(NhaXuatBan nxb) {
        String sql = "insert into NhaXuatBan(TENNXB,DiaChi) values (?,?)";
        try(Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nxb.getTen());
            ps.setString(2, nxb.getDiaChi());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        } catch (Exception e) {
        }
    }

    @Override
    public void Sua(NhaXuatBan nxb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Xoa(NhaXuatBan nxb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
