/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookShop;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */
public class CustomerSignUp extends Customer{
    static ArrayList<Customer> customers = new ArrayList<>();
    static CustomerSignUp signUp;
    
    public CustomerSignUp(String name_surname,String email, String password) {
        super.setName_surname(name_surname);
        super.setEmail(email);
        super.setPassword(password);
    }

    
    public void signUp(Customer customer){
        customers.add(customer);
        JOptionPane.showMessageDialog(null, "Başarıyla kayıt olunmuştur.");
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
