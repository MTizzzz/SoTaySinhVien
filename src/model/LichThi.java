package model;


import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class LichThi {
    int sTT;
    String monThi, ngayThi, caThi;
    int sBD;
    String viTri, phongThi;
    int lanThi;

    public LichThi(int sTT, String monThi, String ngayThi, String caThi, int sBD, String viTri, String phongThi, int lanThi) {
        this.sTT = sTT;
        this.monThi = monThi;
        this.ngayThi = ngayThi;
        this.caThi = caThi;
        this.sBD = sBD;
        this.viTri = viTri;
        this.phongThi = phongThi;
        this.lanThi = lanThi;
    }

    public LichThi() {
    }
    public int getSTT() {
        return sTT;
    }

    public String getMonThi() {
        return monThi;
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public String getCaThi() {
        return caThi;
    }

    public int getSBD() {
        return sBD;
    }

    public String getViTri() {
        return viTri;
    }

    public String getPhongThi() {
        return phongThi;
    }

    public int getLanThi() {
        return lanThi;
    }

    public void setSTT(int sTT) {
        this.sTT = sTT;
    }

    public void setMonThi(String monThi) {
        this.monThi = monThi;
    }

    public void setNgayThi(String ngayThi) {
        this.ngayThi = ngayThi;
    }

    public void setCaThi(String caThi) {
        this.caThi = caThi;
    }

    public void setSBD(int sBD) {
        this.sBD = sBD;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void setPhongThi(String phongThi) {
        this.phongThi = phongThi;
    }

    public void setLanThi(int lanThi) {
        this.lanThi = lanThi;
    }
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.sTT);
        hash = 79 * hash + Objects.hashCode(this.monThi);
        hash = 79 * hash + Objects.hashCode(this.ngayThi);
        hash = 79 * hash + Objects.hashCode(this.caThi);
        hash = 79 * hash + Objects.hashCode(this.sBD);
        hash = 79 * hash + Objects.hashCode(this.viTri);
        hash = 79 * hash + Objects.hashCode(this.phongThi);
        hash = 79 * hash + Objects.hashCode(this.lanThi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LichThi other = (LichThi) obj;
        if (!Objects.equals(this.sTT, other.sTT)) {
            return false;
        }
        if (!Objects.equals(this.monThi, other.monThi)) {
            return false;
        }
        if (!Objects.equals(this.ngayThi, other.ngayThi)) {
            return false;
        }
        if (!Objects.equals(this.caThi, other.caThi)) {
            return false;
        }
        if (!Objects.equals(this.sBD, other.sBD)) {
            return false;
        }
        if (!Objects.equals(this.viTri, other.viTri)) {
            return false;
        }
        if (!Objects.equals(this.phongThi, other.phongThi)) {
            return false;
        }
        if (!Objects.equals(this.lanThi, other.lanThi)) {
            return false;
        }
        return false;
        
    }
}


