/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.TheLoaiSach;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ITheLoaiSachService {
    public TheLoaiSach insert(TheLoaiSach loaiSach);
    public TheLoaiSach delete(String ma);
    public TheLoaiSach update(TheLoaiSach loaiSach);
    public List<TheLoaiSach> getAll();
    public TheLoaiSach getByID(String ID);
    public TheLoaiSach getByName(String name);
    public int insertTLCT(String idSach, String idtl);
}
