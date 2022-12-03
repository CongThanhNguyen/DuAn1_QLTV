/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.SachCT;
import Repositories.Impl.SachCTRepository;
import Services.ISachCTService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SachCTService implements ISachCTService{
    final SachCTRepository REPO;

    public SachCTService() {
        this.REPO = new SachCTRepository();
    }
    
    @Override
    public SachCT insert(SachCT sachCT) {
        return REPO.insert(sachCT);
    }

    @Override
    public SachCT delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SachCT update(SachCT sachCT) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SachCT> getAll() {
        return REPO.getAll();
    }

    @Override
    public SachCT getByIDSach(String ID) {
        return REPO.getByIDSach(ID);
    }

    @Override
    public SachCT getByID(String ID) {
        return REPO.getByID(ID);
    }
    
    public List<SachCT> Seach(String tukhoa) {
        return REPO.getBySearch(tukhoa);
    }

    @Override
    public SachCT getByBarcode(String barcode) {
        return REPO.getByBarcode(barcode);
    }
}
