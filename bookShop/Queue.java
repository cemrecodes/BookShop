/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookShop;

/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */
public class Queue {
    Node head=null;
    Node rear;

    // kuyruga node ekleme
    void enqueue(Object data){
        Node node=new Node();
        node.data=data;

        Node temp;
        
        if(head==null){
            head=node;
            rear=node;
        }
        else{
            temp=rear;
            temp.next=node;
            rear=node;
        }
    }
    
    // tabloya veri cekme icin olsuturulan metod
    Object[] getData(Node node){
        
        Order o = (Order) node.data;
        Object[] object = new Object[3];
        object[0] = o.getBooks();
        object[1] = o.getSum();
        object[2] = o.getCustomerMail();
        return object;
    }

    // kuyruktan node silme metodu
    void dequeue(){
        Node temp=head;
        head=temp.next;
    }

    // kuyrugu konsola yazdirma metodu
    void printQueue(){
     Node temp=head;
     while(temp!=null){
         if(temp.next==null){
             // rear'ı yazdırır.
             System.out.print(temp.data);
         }else{
             System.out.print(temp.data+" <<<< ");
         }
         temp=temp.next;
     }
        System.out.println();
    }

    
    // kuyrugun basini konsola yazdiran metod
    void peek(){
        System.out.println("Peek: "+head.data);
    }

    
    // kuyrugun bos olup olmadigi bilgisini veren metod
    void isEmpty(){
        if(head==null){
            System.out.println("Queue is empty.");
        }
        else{
            System.out.println("Queue is not empty.");
        }
    } 
    
}
