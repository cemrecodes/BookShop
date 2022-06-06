/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookShop;


/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */
public class AdminLogin implements Login {
    // sadece bir admin olacak ve onun bilgileri private final olarak belirlendi
    private final String name = "Admin";
    private final String password = "1admin0";
    // admin girisi icin private degiskenler
    private String loginName;
    private String loginPassword;

    
    /**
     *
     * @param loginName
     * @param loginPassword
     */
    public AdminLogin(String loginName,String loginPassword) {
        this.loginName = loginName;
        this.loginPassword = loginPassword;
    }

    /**
     *
     * @return loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     *
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     *
     * @return loginPassword
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     *
     * @param loginPassword
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    /**
     *
     * @return true/false
     */
    @Override
    public boolean login() {
        if (getLoginName().equals(name) && getLoginPassword().equals(password) )
                return true;   
        return false;
    }
        
 }
    

