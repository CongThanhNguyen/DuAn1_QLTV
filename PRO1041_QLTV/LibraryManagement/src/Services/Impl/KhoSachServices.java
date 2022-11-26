/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import Repositories.Impl.KhoSachImpl;
import Repositories.KhoSach;
import Services.KhoSachService;
import ViewModels.KhoSachViewModels;
import java.util.List;

/**
 *
 * @author Apc
 */
public class KhoSachServices implements KhoSachService{
    private KhoSach khoSach = new KhoSachImpl();

    @Override
    public List<KhoSachViewModels> getAll() {
        List<KhoSachViewModels> khoSachViewModelses = khoSach.getALl();
        return khoSachViewModelses;
    }
    
}
