/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOimplement;
import java.util.List;
import model.*;

/**
 *
 * @author Lab Informatika
 */
public interface tokoimplement {
    public void insert (toko t);
    public void update (toko t);
    public void delete (int id);
    public List<toko>getAll();
}
