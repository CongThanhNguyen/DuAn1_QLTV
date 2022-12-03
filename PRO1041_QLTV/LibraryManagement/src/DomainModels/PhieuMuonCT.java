/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Apc
 */
public class PhieuMuonCT {
    private CuonSach cuonSach;
    private PhieuMuon phieuMuon;

    public PhieuMuonCT() {
    }

    public PhieuMuonCT(CuonSach cuonSach, PhieuMuon phieuMuon) {
        this.cuonSach = cuonSach;
        this.phieuMuon = phieuMuon;
    }

    public CuonSach getCuonSach() {
        return cuonSach;
    }

    public void setCuonSach(CuonSach cuonSach) {
        this.cuonSach = cuonSach;
    }

    public PhieuMuon getPhieuMuon() {
        return phieuMuon;
    }

    public void setPhieuMuon(PhieuMuon phieuMuon) {
        this.phieuMuon = phieuMuon;
    }

    
}
