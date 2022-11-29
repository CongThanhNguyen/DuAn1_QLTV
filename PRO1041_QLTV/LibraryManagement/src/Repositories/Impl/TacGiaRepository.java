/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import Repositories.ITacGiaRepository;
import DomainModels.TacGia;
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
public class TacGiaRepository implements ITacGiaRepository{ 
    
    String sql = "Select * from TacGia";
    String sql_by_ma = "Select * from TacGia where MaTacGia = ?";
    String sql_by_id = "Select * from TacGia where IDTacGia = ?";
    String insert_tacgiaCT = "Insert into TacGiaCT(idSach, IDTacGia) values (?,?)";
    
    @Override
    public TacGia insert(TacGia tacGia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TacGia delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TacGia update(TacGia tacGia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TacGia> getAll() {
        return getBySQL(sql);
    }

    @Override
    public TacGia getByMa(String ma) {
        return this.getBySQL(sql_by_ma, ma).get(0);
    }
    
    private List<TacGia> getBySQL(String sql, Object ...args){
        List<TacGia> _lst = new ArrayList<>();
        PreparedStatement ps = DBConnection.getStmt(sql, args);
        ResultSet rs;
        try {
            rs = ps.executeQuery();
            while(rs.next()){
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
}
