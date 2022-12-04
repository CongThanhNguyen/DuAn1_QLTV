/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import ViewModels.PhieuNhapViewmodel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IPhieuNhapViewModelRepository {
    public PhieuNhapViewmodel getPhieuNhapView(String ma);
    public List<PhieuNhapViewmodel> getAll();
}
