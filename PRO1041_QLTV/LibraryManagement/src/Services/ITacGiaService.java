/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.TacGia;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ITacGiaService {
    public TacGia insert(TacGia tacGia);
    public TacGia delete(String ma);
    public TacGia update(TacGia tacGia);
    public List<TacGia> getAll();
    public TacGia getByMa(String ma);
    public int insertTGCT(String idsach, String idTG);
     public int UpdateTacGiaCT(TacGia tacgia);
}
