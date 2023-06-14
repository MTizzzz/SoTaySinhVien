package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MyPC
 */
public class TBKetQua extends AbstractTableModel implements Serializable{
    
    String name[] = {"Mã môn học","Tên môn học","TX1","TX2","Điểm thi","Điểm trung bình","Kết quả"};
    Class classes[] = {String.class,String.class,float.class,float.class,float.class,float.class,EKetQua.class};
    ArrayList<KetQua> dskq = new ArrayList<>();

    public TBKetQua(ArrayList<KetQua> dskq) {
        this.dskq = dskq;
    }
    @Override
    public int getRowCount(){
        return dskq.size();
    }
    @Override
    public int getColumnCount(){
        return name.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dskq.get(rowIndex).getMaMH();
            case 1: return dskq.get(rowIndex).getTenMH();
            case 2: return dskq.get(rowIndex).getTx1();
            case 3: return dskq.get(rowIndex).getTx2();
            case 4: return dskq.get(rowIndex).getDiemThi();
            case 5: return dskq.get(rowIndex).tinhDiemTB();
            case 6: return dskq.get(rowIndex).tinhKetQua();
                
            default: return null;
        }
    }
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getColumnName(int column) {
        return name[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
