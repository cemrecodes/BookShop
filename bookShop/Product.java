/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookShop;

/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */

// urunun nesnesi olusturulmaması istendiginden ve birden cok urun cesidi olabileceginden dolayi olusturuldu

abstract class Product {
    private int product_id;
    private String productName;
    private String author;
    private int numberOfPages;
    private int price;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Urun{" + "urunAdi=" + productName + ", yazarAdi=" + author + ", sayfaSayisi=" + numberOfPages + ", fiyat=" + price + '}';
    }

    
    
    
}
