/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import Repositories.Impl.PhieuNhapViewModelRepository;
import Services.IPhieuNhapViewModelService;
import ViewModels.PhieuNhapViewmodel;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhieuNhapViewModelService implements IPhieuNhapViewModelService {

    final PhieuNhapViewModelRepository REPO = new PhieuNhapViewModelRepository();

    @Override
    public PhieuNhapViewmodel getPhieuNhapView(String ma) {
        return REPO.getPhieuNhapView(ma);
    }

    @Override
    public List<PhieuNhapViewmodel> getAll() {
        return REPO.getAll();
    }

}
