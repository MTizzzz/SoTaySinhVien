/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ComboBoxEditor;
import java.util.Comparator;
/**
 *
 * @author Administrator
 */
public class SortByUserName implements Comparator<TaiKhoan>{

    @Override
    public int compare(TaiKhoan o1, TaiKhoan o2) {
        return  o1.getTenDangNhap().compareTo(o2.getTenDangNhap());
    }
    
}
