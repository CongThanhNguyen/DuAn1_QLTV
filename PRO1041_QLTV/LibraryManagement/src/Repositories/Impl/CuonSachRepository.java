/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.CuonSach;
import DomainModels.SachCT;
import Repositories.ICuonSachRepository;
import Utilities.DBConnection;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class CuonSachRepository implements ICuonSachRepository{
    final SachCTRepository REPO_SACHCT = new SachCTRepository();
    String getAll = "Select * from CuonSach";
    String getByIDSachCT = "Select * from CuonSach where IDSachCT = ?";
    String getByIDAndMa = "Select * from CuonSach where IDSachCT = ? and MaCuonSach = ?";
    String getByMa = "Select * from CuonSach where MaCuonSach = ?";
    String getByIDCuonSach = "Select * from CuonSach where IDCuonSach = ?";
    String insert = "exec addcuonsach ?, ?, ?";
    String upDate = "Delete from cuonsach where idsachct=? go"+" exec addcuonsach ? ? ?";
    @Override
    public CuonSach insert(int soLuong, CuonSach cuonSach, int soBatDau) {
        int i = DBConnection.ExcuteDungna(insert, soLuong, cuonSach.getSachct().getId(), soBatDau);
        return i==1?getByIDSachCT(cuonSach.getSachct().getId()).get(0):null;
    }

    @Override
    public CuonSach delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CuonSach update(int soLuong, CuonSach cuonSach, int soBatDau) {
        int i = DBConnection.ExcuteDungna(upDate,cuonSach.getSachct().getId(),soLuong, cuonSach.getSachct().getId(), soBatDau);
        return i==1?getByIDSachCT(cuonSach.getSachct().getId()).get(0):null;
    }

    @Override
    public List<CuonSach> getAll() {
        return getBySQL(getAll);
    }

    @Override
    public List<CuonSach> getByIDSachCT(String id) {
        return getBySQL(getByIDSachCT, id);
    }
    
    public List<CuonSach> getBySQL(String sql, Object ...args){
        List<CuonSach> _lst = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while(rs.next()){
                String id = rs.getString(1);
                int ma = rs.getInt(2);
                String idSachCT = rs.getString(3);
                float trangThai  = rs.getFloat(4);
                SachCT sachCT = REPO_SACHCT.getByID(idSachCT);
                CuonSach cs = new CuonSach(id, ma, sachCT, trangThai);
                _lst.add(cs);
            }
            return _lst;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<CuonSach> getByID(String id) {
        return getBySQL(getByIDCuonSach, id);
    }

    @Override
    public List<CuonSach> getByMa(String id) {
        return getBySQL(getByMa, id);
    }

    @Override
    public CuonSach getByMaAndID(String id, String ma) {
        return getBySQL(getByIDAndMa, id, ma).get(0);
    }
}
