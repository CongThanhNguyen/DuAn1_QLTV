/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import Repositories.KhoSach;
import Utilities.DBContext;
import ViewModels.KhoSachViewModels;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Apc
 */
public class KhoSachImpl implements KhoSach {

    @Override
    public List<KhoSachViewModels> getALl() {
        ArrayList<KhoSachViewModels> dsKhoSach = new ArrayList<>();
        try {
            Connection connection = (Connection) DBContext.getConnection();
            String sql = "SELECT S.MaSach,SCT.TenSach,Ls.TenLoaiSach FROM Sach S\n"
                    + "JOIN SachCT SCT ON S.IDSach = SCT.IdSach\n"
                    + "JOIN LoaiSach LS ON Ls.IDLoaiSach = SCT.IdLoaiSach";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String MaSach = rs.getString(1);
                String TenSach = rs.getString(2);
                String TenLoaiSach = rs.getString(3);

                KhoSachViewModels KSach = new KhoSachViewModels();
                KSach.setMaSach(MaSach);
                KSach.setTenSach(TenSach);
                KSach.setTenLoaiSach(TenLoaiSach);
                dsKhoSach.add(KSach);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsKhoSach;
    }
   public static void main(String[] args) {
        new KhoSachImpl().getALl().forEach(s -> System.out.println(s.toString()));
    }
}
