/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookShop;

import static bookShop.CustomerSignUp.customers;

/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */
public class CustomerLogin extends Customer implements Login {
    
    public CustomerLogin(String email, String sifre) {
        super.setEmail(email);
        super.setPassword(sifre);
    }
    

    @Override
    public boolean login() {
        for(int i = 0; i < customers.size(); i++) {   
            System.out.println("Email:"+ super.getEmail());
            if (customers.get(i).getEmail().equals(super.getEmail()) && customers.get(i).getPassword().equals(super.getPassword()) ){
                return true;
            }
           }
        return false; 
    }
    
    
}
