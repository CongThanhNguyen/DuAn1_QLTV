/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.TacGia;
import Repositories.Impl.TacGiaRepository;
import Services.ITacGiaService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TacGiaService implements ITacGiaService{
    final TacGiaRepository REPO;

    public TacGiaService() {
        this.REPO = new TacGiaRepository();
    }

    

    @Override
    public TacGia insert(TacGia tacGia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TacGia delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TacGia update(TacGia tacGia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TacGia> getAll() {
        return REPO.getAll();
    }

    @Override
    public TacGia getByMa(String ma) {
        return REPO.getByMa(ma);
    }

    @Override
    public int insertTGCT(String idsach, String idTG) {
        return REPO.InsertTacGiaCT(idsach, idTG);
    }
    
}
