/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.NhaCC;
import Repositories.INhaCCRepository;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class NhaCCRepository implements INhaCCRepository{
    String sql = "Select * from NhaCC";
    String sqlByID = "Select * from NhaCC where idNhaCC =?";
    
    @Override
    public NhaCC insert(NhaCC nhacc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhaCC delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhaCC update(NhaCC nhacc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<NhaCC> getAll() {
        return getBySql(sql);
    }

    @Override
    public NhaCC getByID(String id) {
        return getBySql(sqlByID, id).get(0);
    }
    
    private List<NhaCC> getBySql(String sql, Object ...args){
        List<NhaCC> _lst = new ArrayList<>();
        PreparedStatement ps = DBConnection.getStmt(sql, args);
        ResultSet rs;
        try {
            rs = ps.executeQuery();
            while(rs.next()){
                String id = rs.getString(1);
                String hoTen = rs.getString(2);
                String diaChi = rs.getString(3);
                String sdt = rs.getString(4);
                String email = rs.getString(5);
                NhaCC nhacc = new NhaCC(id, hoTen, diaChi, sdt, email);
                _lst.add(nhacc);
            }
        } catch (SQLException ex) {
            return null;
        }
        return _lst;
    }
}
