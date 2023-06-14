/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Phạm Trí Đức
 */
public class HoSo implements Serializable{
    String maSV, hoten,gioitinh,ngaysinh,diachi,lop,khoa,nganh,email,baoluu,ghichu, sdt,diemrenluyen,sothich;
    
    public HoSo(){}

    public HoSo(String maSV, String hoten, String lop) {
        this.maSV = maSV;
        this.hoten = hoten;
        this.lop = lop;
    }

    public HoSo(String maSV, String hoten, String gioitinh, String ngaysinh, String diachi, String lop, String khoa, String nganh, String email, String baoluu, String ghichu, String sdt, String diemrenluyen, String sothich) {
        this.maSV = maSV;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.lop = lop;
        this.khoa = khoa;
        this.nganh = nganh;
        this.email = email;
        this.baoluu = baoluu;
        this.ghichu = ghichu;
        this.sdt = sdt;
        this.diemrenluyen = diemrenluyen;
        this.sothich = sothich;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getLop() {
        return lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getNganh() {
        return nganh;
    }

    public String getEmail() {
        return email;
    }

    public String getBaoluu() {
        return baoluu;
    }

    public String getGhichu() {
        return ghichu;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDiemrenluyen() {
        return diemrenluyen;
    }

    public String getSothich() {
        return sothich;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBaoluu(String baoluu) {
        this.baoluu = baoluu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDiemrenluyen(String diemrenluyen) {
        this.diemrenluyen = diemrenluyen;
    }

    public void setSothich(String sothich) {
        this.sothich = sothich;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.maSV);
        hash = 89 * hash + Objects.hashCode(this.hoten);
        hash = 89 * hash + Objects.hashCode(this.gioitinh);
        hash = 89 * hash + Objects.hashCode(this.ngaysinh);
        hash = 89 * hash + Objects.hashCode(this.diachi);
        hash = 89 * hash + Objects.hashCode(this.lop);
        hash = 89 * hash + Objects.hashCode(this.khoa);
        hash = 89 * hash + Objects.hashCode(this.nganh);
        hash = 89 * hash + Objects.hashCode(this.email);
        hash = 89 * hash + Objects.hashCode(this.baoluu);
        hash = 89 * hash + Objects.hashCode(this.ghichu);
        hash = 89 * hash + Objects.hashCode(this.sdt);
        hash = 89 * hash + Objects.hashCode(this.diemrenluyen);
        hash = 89 * hash + Objects.hashCode(this.sothich);
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
        final HoSo other = (HoSo) obj;
        if (!Objects.equals(this.maSV, other.maSV)) {
            return false;
        }
        if (!Objects.equals(this.hoten, other.hoten)) {
            return false;
        }
        if (!Objects.equals(this.gioitinh, other.gioitinh)) {
            return false;
        }
        if (!Objects.equals(this.ngaysinh, other.ngaysinh)) {
            return false;
        }
        if (!Objects.equals(this.diachi, other.diachi)) {
            return false;
        }
        if (!Objects.equals(this.lop, other.lop)) {
            return false;
        }
        if (!Objects.equals(this.khoa, other.khoa)) {
            return false;
        }
        if (!Objects.equals(this.nganh, other.nganh)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.baoluu, other.baoluu)) {
            return false;
        }
        if (!Objects.equals(this.ghichu, other.ghichu)) {
            return false;
        }
        if (!Objects.equals(this.sdt, other.sdt)) {
            return false;
        }
        if (!Objects.equals(this.diemrenluyen, other.diemrenluyen)) {
            return false;
        }
        return Objects.equals(this.sothich, other.sothich);
    }

    
}
