/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.CuonSach;
import DomainModels.PhieuMuon;
import DomainModels.PhieuMuonCT;
import Repositories.IPhieuMuonCTRepository;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class PhieuMuonCTRepository implements IPhieuMuonCTRepository{
    final CuonSachRepository REPO_CS = new CuonSachRepository();
    final PhieuMuonRepository REPO_PM = new PhieuMuonRepository();
    
    String sql_all = "Select * from PhieuMuonCT";
    String sql_byManID = "Select * from PhieuMuonCT where maPhieuMuon =? and IdCuonSach=?";
    String sql_byMa = "Select * from PhieuMuonCT where maPhieuMuon =?";
    String insert = "Insert into PhieuMuonCT(IDCuonSach, maPhieuMuon) values(?,?)";
    String Delete = "Delete from phieuMuonCT where maPhieuMuon = ?";
    
    @Override
    public PhieuMuonCT insert(PhieuMuonCT phieuMuonCT) {
        int i = DBConnection.ExcuteDungna(insert, phieuMuonCT.getCuonSach().getId(),
                phieuMuonCT.getPhieuMuon().getMa());
        return i==1?getByManID(phieuMuonCT.getPhieuMuon().getMa(), phieuMuonCT.getCuonSach().getId()):null;
    }

    @Override
    public PhieuMuonCT delete(String id) {
        int i = DBConnection.ExcuteDungna(Delete, id);
        return null;
    }

    @Override
    public List<PhieuMuonCT> getAll() {
        return getBySql(sql_all);
    }

    @Override
    public PhieuMuonCT getByManID(String ma, String id) {
       return getBySql(sql_byManID, ma, id).get(0);
    }

    @Override
    public List<PhieuMuonCT> getBySearch(String tuKhoa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private List<PhieuMuonCT> getBySql(String sql, Object... args){
        try {
            List<PhieuMuonCT> _lst = new ArrayList<>();
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while(rs.next()){
                String id = rs.getString(1);
                String ma = rs.getString(2);
                CuonSach cuonSach = REPO_CS.getByID(id).get(0);
                PhieuMuon phieuMuon = REPO_PM.getByMa(ma);
                PhieuMuonCT pm = new PhieuMuonCT(cuonSach, phieuMuon);
                _lst.add(pm);
            }
            return _lst;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<PhieuMuonCT> getByMa(String ma) {
        return getBySql(sql_byMa, ma);
    }
    
}
