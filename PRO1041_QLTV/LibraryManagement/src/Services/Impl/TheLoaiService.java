/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.TheLoaiSach;
import Repositories.ITheLoaiRepository;
import Repositories.Impl.TheLoaiSachRepository;
import Services.ITheLoaiSachService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TheLoaiService implements ITheLoaiSachService{
    final TheLoaiSachRepository REPO;

    public TheLoaiService() {
        this.REPO = new TheLoaiSachRepository();
    }
    
    @Override
    public TheLoaiSach insert(TheLoaiSach loaiSach) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TheLoaiSach delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TheLoaiSach update(TheLoaiSach loaiSach) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TheLoaiSach> getAll() {
        return REPO.getAll();
    }

    @Override
    public TheLoaiSach getByID(String ID) {
        return REPO.getByID(ID);
    }

    @Override
    public TheLoaiSach getByName(String name) {
        return REPO.getByName(name);
    }

    @Override
    public int insertTLCT(String idSach, String idtl) {
        return REPO.insertTheLoaiCT(idSach, idtl);
    }
    
}
