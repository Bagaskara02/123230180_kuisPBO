/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class TabelDataToko extends AbstractTableModel {

    List<toko> list;

    public TabelDataToko(List<toko> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColomnCount() {
        return 7;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int colomnIndex){
        toko t = list.get(rowIndex);
        switch(colomnIndex){
            case 0:
                return t.getId();
            case 1:
                return t.getNama_costomer();
            case 2:
                return t.getBarang();
            case 3:
                return t.getHarga_barang();
            case 4:
                return t.getCicilan();
            case 5:
                return t.getBunga_perbulan();
            case 6:
                return t.getAngsuran_perbulan();
            case 7:
                return t.getTotal();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama Customer";
            case 2:
                return "Barang";
            case 3:
                return "Harga Barang";
            case 4:
                return "Cicilan";
            case 5:
                return "Bunga Perbulan";
            case 6:
                return "Angsuran Perbulan";
            case 7:
                return "Total";
            default:
                return null;
        }
    }
}
