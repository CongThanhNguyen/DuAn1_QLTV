/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.Sach;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ISachService {
    public Sach insert(Sach khoSach);
    public Sach delete(String ma);
    public Sach update(Sach khoSach);
    public List<Sach> getAll();
    public Sach getByMa(String Ma);
    public Sach getByID(String id);;
}
