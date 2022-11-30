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
    public NhaCC insert(NhaCC nhaCC);
    public NhaCC delete(String ma);
    public NhaCC update(NhaCC nhaCC);
    public List<NhaCC> getAll();
    public NhaCC getByID(String id);
}
