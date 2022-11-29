/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;


import DomainModels.ViPham;
import ViewModels.BaoCaoDSViewModels;
import ViewModels.BaoCaoPMViewModels;
import java.util.List;

/**
 *
 * @author Apc
 */
public interface BaoCaoServices {
    List<BaoCaoPMViewModels> getPhieuMuonByMa(String ma);
    List<BaoCaoDSViewModels> LoadTableBaoCao();
    List<ViPham> LoadtableViPhams(String ma);
    void Them(ViPham vp);
    void Sua(String ma,ViPham vp);
    void Xoa(String ma);
}
