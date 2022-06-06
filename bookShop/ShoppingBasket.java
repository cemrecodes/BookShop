/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookShop;

import javax.swing.JOptionPane;
import static bookShop.CustomerSignUp.signUp;


/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */

// kullanicinin alisveris sepet icin olusturulan class

public class ShoppingBasket extends Customer{
    // kullanici sepeti icin stack olusuturuldu
   Stack stack =new Stack();
   static Queue queue=new Queue();
    
    static ShoppingBasket shopping_basket;

    /**
     * constructor
     */
    public ShoppingBasket(){
        
    }

    /**
     * sepeti onaylama metodudur ve siparisin kuyruga eklenmesini saglar
     */
    public void confirmBasket(){
        
        Node node = shopping_basket.getHead();
        Order order = new Order();
        String books= "";
        int sum = 0;
        
        while ( node != null){
            Book k= (Book) node.data;   
            books = books +"-"+k.getProductName();
            sum += k.getPrice();
            // System.out.println("Sum:" + sum);
            
            node = node.next;
          
        }

        order.setBooks(books);
        order.setCustomerMail(signUp.getEmail());
        order.setSum(sum);
        queue.enqueue(order);
        JOptionPane.showMessageDialog(null, "Siparişiniz alınmıştır.\n");
        //System.out.println("Books: "+ order.toString());
        queue.printQueue();
        
    }
    
    /**
     * sepete kitap ekleme metodu
     * @param book
     */
    public void addToBasket(Book book){
        stack.push(book);
        JOptionPane.showMessageDialog(null, "Sepetinize eklenmiştir.");
        //stack.printStack();
    }
    
    /**
     *
     * @return Node
     */
    public Node getHead(){
        return stack.head;
    }

    /**
     * sepetten son kitabi siler
     * @param book
     */
    public void removeFromBasket(Book book){
        stack.pop();
    }

    /**
     * sepeti bosaltir  
     */
    public void emptyTheBasket(){
        stack.clear();
    }
     
}
