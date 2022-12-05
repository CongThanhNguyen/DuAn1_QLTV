/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.NhaXuatBan;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INhaXuatBanRepository {
    public NhaXuatBan insert(NhaXuatBan nhaXuatBan);
    public NhaXuatBan delete(String ma);
    public NhaXuatBan update(NhaXuatBan nhaXuatBan);
    public List<NhaXuatBan> getAll();
    public NhaXuatBan getByID(String id);
    public NhaXuatBan getByName(String ten);
    public int insertNXBCT(String idNXB, String idSachCT); 
    
    public void Them(NhaXuatBan nxb);
    public void Sua(NhaXuatBan nxb);
    public void Xoa(String ten);
}
