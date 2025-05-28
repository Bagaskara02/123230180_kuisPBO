/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOtoko;

import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.toko;
import DAOimplement.tokoimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lab Informatika
 */
public class tokoDAO implements tokoimplement {
    private final Connection connection;
    
    private static final String select = "SELECT * FROM toko_db";
    private static final String insert = "INSERT INTO toko_db(nama_costumer, barang, nama_barang, cicilan, bunga_perbulan, angsuran_perbulan, total) VALUES (?,?,?,?,?,?,?)";
    private static final String update = "UPDATE toko_db SET nama_costumer=?, barang=?, nama_barang=?, cicilan=?, bunga_perbulan=?, angsuran_perbulan=?, total=? WHERE id=?";
    private static final String delete = "DELETE FROM toko_db WHERE id=?";
    
    
    public tokoDAO(){
        this.connection =  connector.connection();
    }
    
    @Override
    public void insert(toko t){
    }
    
    @Override
    public void delete(int id){
        try(PreparedStatement statement = connection.prepareStatement(delete)){
        statement.setInt(1, id);
        statement.executeUpdate();
        }catch(SQLException ex){
        Logger.getLogger(tokoDAO.class.getName().log(Level.SEVERE, null, ex));
        }
    }
}
