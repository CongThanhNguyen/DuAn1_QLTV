/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.SachCT;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ISachCTService {
    public SachCT insert(SachCT sachCT);
    public SachCT delete(String ma);
    public SachCT update(SachCT sachCT);
    public List<SachCT> getAll();
    public SachCT getByIDSach(String ID);
}
