/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookShop;

/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */

public class Order {
    String customerMail;
    String books;
    int sum;

    public Order() {
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Siparis{" + "musteri_email=" + customerMail + ", kitaplar=" + books + ", tutar=" + sum + '}';
    }
    
    
}
