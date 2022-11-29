/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.ViPham;
import ViewModels.BaoCaoDSViewModels;
import ViewModels.BaoCaoPMViewModels;
import java.util.List;

/**
 *
 * @author Apc
 */
public interface BaoCaoRepositories {
    List<BaoCaoPMViewModels> getPhieuMuonByMa( String ma);
    List<BaoCaoDSViewModels> LoadTableBaoCao();
    List<ViPham> getBaoCaoBymaPM(String ma);
    void Them(ViPham vp);
    void Sua(ViPham vp,String ma);
    Void Xoa( String ma);
    
}
