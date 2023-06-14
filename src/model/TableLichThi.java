package model;


import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TableLichThi extends AbstractTableModel implements  Serializable{
    String name[] = {"STT","Môn thi","Ngày thi","Ca thi","SBD","Vị trí","Phòng thi","Lần thi"};
    Class classes[] = {Integer.class,String.class,String.class,String.class,Integer.class,String.class,String.class,Integer.class};
    ArrayList<LichThi> dslt = new ArrayList<>();
    
    public TableLichThi(ArrayList<LichThi> dslt){
        this.dslt = dslt;
    }
    @Override
    public int getRowCount(){
        return dslt.size();
    }
    @Override
    public int getColumnCount(){
        return name.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dslt.get(rowIndex).getSTT();
            case 1: return dslt.get(rowIndex).getMonThi();
            case 2: return dslt.get(rowIndex).getNgayThi();
            case 3: return dslt.get(rowIndex).getCaThi();
            case 4: return dslt.get(rowIndex).getSBD();
            case 5: return dslt.get(rowIndex).getViTri();
            case 6: return dslt.get(rowIndex).getPhongThi();
            case 7: return dslt.get(rowIndex).getLanThi();
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
