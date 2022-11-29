/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.NhaXuatBan;
import Repositories.INhaXuatBanRepository;
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
public class NhaXuatBanRepository implements INhaXuatBanRepository{
    String sql = "Select * from NhaXuatBan";
    String sqlByID = "Select * from NhaXuatBan where id =?";
    
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
    
    private List<NhaXuatBan> getBySql(String sql, Object ...args){
        List<NhaXuatBan> _lst = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while(rs.next()){
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
}
