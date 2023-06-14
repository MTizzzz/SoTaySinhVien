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
 * @author Admin
 */
public class TableMonHoc extends AbstractTableModel implements  Serializable{
    String name[] = {"Ma mon hoc","Ten mon hoc","Lop","So tin chi","Thanh tien","Trang thai"};
    Class classes[] = {String.class,String.class,String.class,Integer.class,Float.class,String.class};
    ArrayList<MonHoc> dsmh = new ArrayList<>();
    
    public TableMonHoc(ArrayList<MonHoc> dsmh){
        this.dsmh = dsmh;
    }
    @Override
    public int getRowCount(){
        return dsmh.size();
    }
    @Override
    public int getColumnCount(){
        return name.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsmh.get(rowIndex).getMaMH();
            case 1: return dsmh.get(rowIndex).getTenMH();
            case 2: return dsmh.get(rowIndex).getLopMH();
            case 3: return dsmh.get(rowIndex).getSoTC();
            case 4: return dsmh.get(rowIndex).tinhHocPhi();
            case 5: return dsmh.get(rowIndex).getTrangThai();
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
