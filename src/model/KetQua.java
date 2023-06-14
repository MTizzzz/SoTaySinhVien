package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Objects;

/**
 *
 * @author MyPC
 */
public class KetQua extends MonHoc{
    private double tx1;
    private double tx2;
    private double diemThi;
    private String ketQua;

    public KetQua(double tx1, double tx2, double diemThi, String ketQua, String maMH, String tenMH) {
        super(maMH, tenMH);
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.diemThi = diemThi;
        this.ketQua = ketQua;
    }

    public KetQua() {
    }
    
    
    public double getTx1() {
        return tx1;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.tx1) ^ (Double.doubleToLongBits(this.tx1) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.tx2) ^ (Double.doubleToLongBits(this.tx2) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.diemThi) ^ (Double.doubleToLongBits(this.diemThi) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.ketQua);
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
        final KetQua other = (KetQua) obj;
        if (Double.doubleToLongBits(this.tx1) != Double.doubleToLongBits(other.tx1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tx2) != Double.doubleToLongBits(other.tx2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.diemThi) != Double.doubleToLongBits(other.diemThi)) {
            return false;
        }
        return this.ketQua == other.ketQua;
    }

    

    public float tinhDiemTB(){
        return (float) (tx1*0.2 + tx2*0.2 + diemThi*0.6);
    }
    
    public String tinhKetQua(){
        if(tinhDiemTB() <= 4.0 ){
            return "Yeu";
        }
        if(tinhDiemTB() < 6.0){
            return "TB";
        }
        if(tinhDiemTB() < 8.0){
            return "Kha";
        }
        if(tinhDiemTB() < 9.0){
            return "Gioi";
        }
        else{
            return "Xuat sac";
        }
    }
}
