/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookShop;

import javax.swing.JOptionPane;

/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */
public class Book extends Product{
    // iki tane kitap listesi olusturuldu
    static LinkedList bookList = new LinkedList();
    static LinkedList bookList_copy = new LinkedList();
    // kitap ID'si icin baslangic 1000 belirlendi
    static int id = 1000;
    
    public Book(){
        
        
    }
    
    public Book (String bookName,String author,int pageNumber,int price) {
        super.setProductName(bookName);
        super.setAuthor(author);
        super.setNumberOfPages(pageNumber);
        super.setPrice(price);
    }
    
    // overloaded Book constructor
    public Book (int bookID,String bookName,String author,int pageNumber,int price) {
        super.setProduct_id(bookID);
        super.setProductName(bookName);
        super.setAuthor(author);
        super.setNumberOfPages(pageNumber);
        super.setPrice(price);
    }
   
    
    public void addBook(Book book){
        if ( bookList.findBook(book) ){
           JOptionPane.showMessageDialog(null, "Eklemeye çalıştığınız kitap zaten bulunmaktadır.");
        }
        else{
            id++;
            book.setProduct_id(id);
            bookList.add(book); 
            bookList_copy.add(book);
            JOptionPane.showMessageDialog(null, "Kitap kütüphanemize eklenmiştir.");
       }
    }
    
    public void deleteBook(String book){
        bookList.delete(book);
        bookList_copy.delete(book);
    }
    


    
}
