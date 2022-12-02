/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.CuonSach;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ICuonSachService {
    public CuonSach insert(int soluong, CuonSach cuonSach, int soBatDau);
    public CuonSach delete(String id);
    public CuonSach update(CuonSach cuonSach);
    public List<CuonSach> getAll();
    public List<CuonSach> getByIDSachCT(String id);
}
