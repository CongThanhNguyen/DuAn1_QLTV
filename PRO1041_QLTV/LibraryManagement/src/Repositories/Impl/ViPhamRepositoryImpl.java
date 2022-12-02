/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.LoiVP;
import Repositories.ViPhamRepository;
import Utilities.DBContext;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Apc
 */
public class ViPhamRepositoryImpl implements ViPhamRepository{

    @Override
    public List<LoiVP> getAll() {
        ArrayList<LoiVP> dsbaoCaoPMViewModelses = new ArrayList<>();

        try {
            Connection connection = DBContext.getConnection();
            String sql = "SELECT TenLoi FROM LoiViPham";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String TenLoi = rs.getString("TenLoi");
                LoiVP loiVP = new LoiVP();
                loiVP.setTen(TenLoi);
                dsbaoCaoPMViewModelses.add(loiVP);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsbaoCaoPMViewModelses;
    }

    @Override
    public void Them(LoiVP loiVP) {
       String sql = "INSERT into LoiViPham(TenLoi) VALUES (?)";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, loiVP.getTen());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void Sua(String ma, LoiVP loiVP) {
        String sql = " UPDATE [dbo].[LoiViPham]\n"
                + " WHERE [IDLoiViPham] = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, loiVP.getTen());
            ps.setString(2, ma);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void Xoa(String ma) {
        String sql = " delete from LoiViPham where IDLoiViPham = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
}
