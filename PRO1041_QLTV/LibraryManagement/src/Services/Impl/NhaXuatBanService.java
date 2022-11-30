/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.NhaXuatBan;
import Repositories.Impl.NhaXuatBanRepository;
import Services.INhaXuatBanService;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhaXuatBanService implements INhaXuatBanService{
    final NhaXuatBanRepository REPO;

    public NhaXuatBanService() {
        this.REPO = new NhaXuatBanRepository();
    }

    @Override
    public NhaXuatBan insert(NhaXuatBan nhaXuatBan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhaXuatBan delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhaXuatBan update(NhaXuatBan nhaXuatBan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<NhaXuatBan> getAll() {
        return REPO.getAll();
    }

    @Override
    public NhaXuatBan getByID(String id) {
        return REPO.getByID(id);
    }

    @Override
    public int insertNXBCT(String idNXB, String idSachCt) {
        return REPO.insertNXBCT(idNXB, idSachCt);
    }
    
}
