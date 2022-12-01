/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Admin
 */
public class CuonSach {
    private String id;
    private Integer ma;
    private SachCT sachct;
    private Float trangThai;

    public CuonSach() {
    }

    public CuonSach(String id, int ma, SachCT sachct, float trangThai) {
        this.id = id;
        this.ma = ma;
        this.sachct = sachct;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public SachCT getSachct() {
        return sachct;
    }

    public void setSachct(SachCT sachct) {
        this.sachct = sachct;
    }

    public float getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(float trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
