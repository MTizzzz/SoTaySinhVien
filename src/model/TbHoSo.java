/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Phạm Trí Đức
 */
public class TbHoSo extends AbstractTableModel implements Serializable{

    static void setModel(TbHoSo tbHoSo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String name[] = {"Ma SV","Ho ten","Gioi Tinh","Ngay Sinh","Dia Chi","Lop","Khoa","Nganh","Email","Bao Luu","Ghi Chu","SDT","Diem ren luyen","So thich"};
    Class classes[] = {String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    ArrayList<HoSo> dshs = new ArrayList<>();
    
    
    public TbHoSo(ArrayList<HoSo> dshs){
        this.dshs = dshs;
    }

    @Override
    public int getRowCount() {
        return dshs.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    /**
     *
     * @param columnIndex
     * @return
     */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dshs.get(rowIndex).getMaSV();
            case 1: return dshs.get(rowIndex).getHoten();
            case 2: return dshs.get(rowIndex).getGioitinh();
            case 3: return dshs.get(rowIndex).getNgaysinh();
            case 4: return dshs.get(rowIndex).getDiachi();
            case 5: return dshs.get(rowIndex).getLop();
            case 6: return dshs.get(rowIndex).getKhoa();
            case 7: return dshs.get(rowIndex).getNganh();
            case 8: return dshs.get(rowIndex).getEmail();
            case 9: return dshs.get(rowIndex).getBaoluu();
            case 10: return dshs.get(rowIndex).getGhichu();
            case 11: return dshs.get(rowIndex).getSdt();
            case 12: return dshs.get(rowIndex).getDiemrenluyen();
            default: return null;
        }
    }

    
    }

    

