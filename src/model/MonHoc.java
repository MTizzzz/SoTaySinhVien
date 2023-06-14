package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class MonHoc implements  Serializable{
    private String maMH,tenMH,lopMH,trangThai;
    private int soTC;

    public MonHoc() {
    }

    public MonHoc(String maMH, String tenMH) {
        this.maMH = maMH;
        this.tenMH = tenMH;
    }

    public MonHoc(String maMH, String tenMH, String lopMH, String trangThai, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.lopMH = lopMH;
        this.trangThai = trangThai;
        this.soTC = soTC;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getLopMH() {
        return lopMH;
    }

    public void setLopMH(String lop) {
        this.lopMH = lop;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }
    public float tinhHocPhi(){
        return soTC * 350000;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.maMH);
        hash = 23 * hash + Objects.hashCode(this.tenMH);
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
        final TaiKhoan other = (TaiKhoan) obj;
        return true;
    }
}
