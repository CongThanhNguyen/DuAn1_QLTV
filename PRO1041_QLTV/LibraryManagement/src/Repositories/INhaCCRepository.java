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
    public NhaCC insert(NhaCC nhaCC);
    public NhaCC delete(String ma);
    public NhaCC update(NhaCC nhaCC);
    public List<NhaCC> getAll();
    public NhaCC getByID(String id);
}
