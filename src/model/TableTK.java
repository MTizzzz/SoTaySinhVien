package model;


import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class TableTK extends AbstractTableModel implements Serializable{
    String name[] = {"ID","Tên đăng nhập","Mật khẩu","Vai trò"};
    Class classes[] = {String.class,String.class,String.class,String.class};
    ArrayList<TaiKhoan> dstk = new ArrayList<>(); 

    public TableTK(ArrayList<TaiKhoan> dstk) {
        this.dstk = dstk;
    }
    @Override
    public int getRowCount(){
        return dstk.size();
    }
    @Override
    public int getColumnCount(){
        return name.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dstk.get(rowIndex).getId();
            case 1: return dstk.get(rowIndex).getTenDangNhap();
            case 2: return dstk.get(rowIndex).getMatKhau();
            case 3: return dstk.get(rowIndex).getVaiTro();
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
