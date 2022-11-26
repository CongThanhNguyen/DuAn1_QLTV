/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Apc
 */
public class LoiViPham {
    private String idLoiVP;
    private ViPham idVP;
    private String tenLoi;

    public LoiViPham() {
    }

    public LoiViPham(String idLoiVP, ViPham idVP, String tenLoi) {
        this.idLoiVP = idLoiVP;
        this.idVP = idVP;
        this.tenLoi = tenLoi;
    }

    public String getIdLoiVP() {
        return idLoiVP;
    }

    public void setIdLoiVP(String idLoiVP) {
        this.idLoiVP = idLoiVP;
    }

    public ViPham getIdVP() {
        return idVP;
    }

    public void setIdVP(ViPham idVP) {
        this.idVP = idVP;
    }

    public String getTenLoi() {
        return tenLoi;
    }

    public void setTenLoi(String tenLoi) {
        this.tenLoi = tenLoi;
    }

    @Override
    public String toString() {
        return "LoiViPham{" + "idLoiVP=" + idLoiVP + ", idVP=" + idVP + ", tenLoi=" + tenLoi + '}';
    }

    
    
}
