/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.NhaXuatBan;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INhaXuatBanService {

    public NhaXuatBan insert(NhaXuatBan nhaXuatBan);

    public NhaXuatBan delete(String ma);

    public NhaXuatBan update(NhaXuatBan nhaXuatBan);

    public List<NhaXuatBan> getAll();

    public NhaXuatBan getByID(String id);

    public int insertNXBCT(String idNXB, String idSachCt);

    public void Them(NhaXuatBan nxb);

    public void Sua(NhaXuatBan nxb);

    public void Xoa(String ten);
    public NhaXuatBan getByName(String ten);
}
