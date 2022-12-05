/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.Sach;
import DomainModels.TacGia;
import DomainModels.TacGiaCT;
import Repositories.ITacGiaChiTiet;
import Utilities.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huong
 */
public class TacGiaCTRepository implements ITacGiaChiTiet {

    final TacGiaRepository tgRepo = new TacGiaRepository();
    final SachRepository sachRepo = new SachRepository();

    String delete = "DELETE TacGiaCT where IdTacGia = ?";

    private List<TacGiaCT> getBySQl(String sql, Object... args) {
        try {
            List<TacGiaCT> _lst = new ArrayList<>();
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while (rs.next()) {
                String idTacGia = rs.getString(1);
                String idSach = rs.getString(2);
                TacGia tacGia = tgRepo.getByID(idTacGia);
                Sach sach = sachRepo.getByID(idSach);
                TacGiaCT tg = new TacGiaCT(tacGia, sach);
                _lst.add(tg);
            }
            return _lst;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public TacGiaCT delete(String id) {
        int i = DBConnection.ExcuteDungna(delete, id);
        return null;
    }
}
