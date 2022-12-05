/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.NhaCC;
import Repositories.Impl.NhaCCRepository;
import Services.INhaCCService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhaCCService implements INhaCCService {

    final NhaCCRepository REPO = new NhaCCRepository();
    
    public List<NhaCC> GetAll() {
        try {
            return REPO.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Integer Them(NhaCC nhacc) {
        try {
            return REPO.Them(nhacc);
            
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public Integer Sua(NhaCC Nhacc) {
        try {
            return REPO.sua(Nhacc);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }    
    
    public Integer xoa(String ten) {
        try {
            return REPO.xoa(ten);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    @Override
    public List<NhaCC> getAll() {
        return REPO.getAll();
    }
    
    @Override
    public NhaCC getByID(String id) {
        return REPO.getByID(id);
    }
    
    @Override
    public NhaCC getbyName(String ten) {
        return REPO.getByName(ten);
    
    }
    
}
