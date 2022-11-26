/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author Admin
 */
public class DocGiaViPhamViewModel {
    private String id;
    private String tenDocGia;
    private String moTa;
    private String HinhPhat;
    private String img;

    public DocGiaViPhamViewModel() {
    }

    public DocGiaViPhamViewModel(String id, String tenDocGia, String moTa, String HinhPhat, String img) {
        this.id = id;
        this.tenDocGia = tenDocGia;
        this.moTa = moTa;
        this.HinhPhat = HinhPhat;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhPhat() {
        return HinhPhat;
    }

    public void setHinhPhat(String HinhPhat) {
        this.HinhPhat = HinhPhat;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
