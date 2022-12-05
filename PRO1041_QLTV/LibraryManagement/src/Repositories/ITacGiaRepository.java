/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.TacGia;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ITacGiaRepository {
    public void insert(TacGia tacGia);
    public TacGia delete(String id);
    public void Xoa(String ten);
    public void Sua(TacGia tg);
    public TacGia update(TacGia tacGia);
    public List<TacGia> getAll();
    public TacGia getByMa(String ma);
    public TacGia getByID(String id);
    public int InsertTacGiaCT(String idsach, String idTacGia);
    public int UpdateTacGiaCT(TacGia tacgia);
   
}
