/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import Repositories.ISachRepository;
import DomainModels.Sach;
import Utilities.DBConnection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SachRepository implements ISachRepository {

    String sql = "Select * from Sach";
    String sql_by_ma = "Select * from Sach where MaSach like ?";
    String sql_by_ten = "Select * from Sach where tensach like ?";
    String sql_by_id = "Select * from Sach where IDSach = ?";
    String insert = "Insert into Sach(MaSach, TenSach) values(?,?)";
    final String update = "Sach set TenSach = ? where MaSach = ?";

    @Override
    public Sach insert(Sach sach) {
        try {
            PreparedStatement ps = DBConnection.getStmt(insert, sach.getMa(), sach.getTen());
            int i = ps.executeUpdate();
            return i == 1 ? getByMa(sach.getMa()) : null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Sach delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Sach update(Sach sach) {
        int i = DBConnection.ExcuteDungna(update, sach.getTen(), sach.getMa());
        return i == 1 ? getByMa(sach.getMa()) : null;
    }

    @Override
    public List<Sach> getAll() {
        return getBySQL(sql);
    }

    @Override
    public Sach getByMa(String ma) {
        return this.getBySQL(sql_by_ma, ma).get(0);
    }

    public List<Sach> getBySQL(String sql, Object... args) {
        List<Sach> _lst = new ArrayList<>();
        PreparedStatement ps = DBConnection.getStmt(sql, args);
        ResultSet rs;
        try {
            rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String Ma = rs.getString(2);
                String ten = rs.getString(3);
                Sach sach = new Sach(id, Ma, ten);
                _lst.add(sach);
            }
        } catch (SQLException ex) {
            return null;
        }
        return _lst;
    }

    @Override
    public Sach getByID(String id) {
        return getBySQL(sql_by_id, id).get(0);
    }

}
