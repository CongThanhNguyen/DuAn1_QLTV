/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.NhaCC;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INhaCCRepository {
   public Integer Them(NhaCC nhacc);
    public Integer xoa(String ten);
    public Integer sua(NhaCC nhacc);
    public List<NhaCC> getAll();
    public NhaCC getByID(String id);
    public NhaCC getByName(String ten);
}
