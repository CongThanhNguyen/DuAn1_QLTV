/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.NhaCC;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INhaCCService {
   public Integer Them(NhaCC nhacc);
     public Integer xoa(String ten);
    public Integer Sua(NhaCC Nhacc);
    public List<NhaCC> getAll();
    public NhaCC getByID(String id);
    public NhaCC getbyName(String ten);
}
