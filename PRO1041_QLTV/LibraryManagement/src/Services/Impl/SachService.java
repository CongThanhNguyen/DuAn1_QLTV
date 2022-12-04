/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.Sach;
import Repositories.Impl.SachRepository;
import Services.ISachService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SachService implements ISachService {

    final SachRepository REPO;
    
    public SachService() {
        this.REPO = new SachRepository();
    }
    
    @Override
    public Sach insert(Sach sach) {
        return REPO.insert(sach);
    }
    
    @Override
    public Sach delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Sach update(Sach sach) {
        return REPO.update(sach);
    }
    
    @Override
    public List<Sach> getAll() {
        return REPO.getAll();
    }
    
    @Override
    public Sach getByMa(String ma) {
        return REPO.getByMa(ma);
    }
    
    @Override
    public Sach getByID(String id) {
        return REPO.getByID(id);
    }
    
}
