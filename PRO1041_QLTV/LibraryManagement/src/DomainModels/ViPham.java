/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Apc
 */
public class ViPham {
    private String idVP;
    private String ngayVP;
    private String hinhPhat;
    private String moTa;

    public ViPham() {
    }

    public ViPham(String idVP, String ngayVP, String hinhPhat, String moTa) {
        this.idVP = idVP;
        this.ngayVP = ngayVP;
        this.hinhPhat = hinhPhat;
        this.moTa = moTa;
    }

    public String getIdVP() {
        return idVP;
    }

    public void setIdVP(String idVP) {
        this.idVP = idVP;
    }

    public String getNgayVP() {
        return ngayVP;
    }

    public void setNgayVP(String ngayVP) {
        this.ngayVP = ngayVP;
    }

    public String getHinhPhat() {
        return hinhPhat;
    }

    public void setHinhPhat(String hinhPhat) {
        this.hinhPhat = hinhPhat;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "ViPham{" + "idVP=" + idVP + ", ngayVP=" + ngayVP + ", hinhPhat=" + hinhPhat + ", moTa=" + moTa + '}';
    }
    
    
}
