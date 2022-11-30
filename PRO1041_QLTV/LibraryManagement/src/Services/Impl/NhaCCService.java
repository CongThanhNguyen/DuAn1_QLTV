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
public class NhaCCService implements INhaCCService{
    final NhaCCRepository REPO;

    public NhaCCService() {
        this.REPO = new NhaCCRepository();
    }

    @Override
    public NhaCC insert(NhaCC nhaCC) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhaCC delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhaCC update(NhaCC nhaCC) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<NhaCC> getAll() {
        return REPO.getAll();
    }

    @Override
    public NhaCC getByID(String id) {
        return REPO.getByID(id);
    }
    
}