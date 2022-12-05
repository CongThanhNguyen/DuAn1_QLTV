/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import Repositories.ITacGiaRepository;
import DomainModels.TacGia;
import Utilities.DBConnection;
import Utilities.DBContext;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class TacGiaRepository implements ITacGiaRepository {

    String sql = "Select * from TacGia";
    String sql_by_ma = "Select * from TacGia where MaTacGia = ?";
    String sql_by_id = "Select * from TacGia where IDTacGia = ?";
    String insert_tacgiaCT = "Insert into TacGiaCT(idSach, IDTacGia) values (?,?)";
    String update_tacgiaCT = "Update TacGia set TenTacGia = ? where IdTacGia = ?";
    String delelte = "DELETE TacGia where IdTacGia = ?";

    @Override
    public void insert(TacGia tacGia) {
        String sql = "insert into TacGia(MaTacGia,TenTacGia,DiaChi) values (?,?,?)";
        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, tacGia.getMa());
            ps.setString(2, tacGia.getHoTen());
            ps.setString(3, tacGia.getDiaChi());
            ps.execute();
        } catch (Exception e) {
        }
    }

    @Override
    public TacGia delete(String id) {
        int i = DBConnection.ExcuteDungna(delelte, id);
        return i == 1 ? getByID(id) : null;

    }

    @Override
    public TacGia update(TacGia tacGia) {
        String sql = "Update TacGia set TenTacGia = ? where IDTacGia = ?";
        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, tacGia.getHoTen());
            ps.setString(2, tacGia.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public List<TacGia> getAll() {
        return getBySQL(sql);
    }

    @Override
    public TacGia getByMa(String ma) {
        return this.getBySQL(sql_by_ma, ma).get(0);
    }

    private List<TacGia> getBySQL(String sql, Object... args) {
        List<TacGia> _lst = new ArrayList<>();
        PreparedStatement ps = DBConnection.getStmt(sql, args);
        ResultSet rs;
        try {
            rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String Ma = rs.getString(2);
                String hoTen = rs.getString(3);
                String diaChi = rs.getString(4);
                TacGia tacGia = new TacGia(id, Ma, hoTen, diaChi);
                _lst.add(tacGia);
            }
        } catch (SQLException ex) {
            return null;
        }
        return _lst;
    }

    @Override
    public TacGia getByID(String id) {
        return getBySQL(sql_by_id, id).get(0);
    }

    @Override
    public int InsertTacGiaCT(String idsach, String idTacGia) {
        PreparedStatement ps = DBConnection.getStmt(insert_tacgiaCT, idsach, idTacGia);
        try {
            return ps.executeUpdate();
        } catch (SQLException ex) {
            return 0;
        }
    }

    @Override
    public int UpdateTacGiaCT(TacGia tacGia) {
        PreparedStatement ps = DBConnection.getStmt(update_tacgiaCT, tacGia.getHoTen(), tacGia.getId());
        try {
            return ps.executeUpdate();
        } catch (SQLException e) {
            return 0;
        }
    }

    @Override
    public void Xoa(String ten) {
        String sql = "Delete from TacGia where TenTacGia = ?";
        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, ten);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Xóa thành công");
        } catch (Exception e) {
        }
    }

    @Override
    public void Sua(TacGia tg) {
        String sql = "update TacGia set TenTacGia = ?,set DiaChi = ? where MaTacGia = ?";
        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, tg.getHoTen());
            ps.setString(2, tg.getDiaChi());
            ps.setString(3, tg.getMa());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sửa thành công");
        } catch (Exception e) {
        }
    }
}
