/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookShop;

/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */
public class Stack {
    Node head=null;
    
    void push(Object data){
        Node eleman=new Node();
        eleman.data=data;
        Node temp=head;
        head=eleman;
        eleman.next=temp;        
    }
    
    void pop(){
       Node temp=head;
       head=temp.next;
    }
    
    void peek(){
        System.out.println("Peek : "+head.data);
    }
    
    void isEmpty(){
        if(head==null){
            System.out.println("Stack is empty.");
        }else{
            System.out.println("Stack is not empty.");
        }
        
    }
    
    void clear(){ 
       if(head==null){
           System.out.println("Stack is already empty.");
       }
       else{
            while(head!=null){
                head=head.next;
        }
       }
    }
    
    void printStack(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+"\n||\n");
             temp=temp.next;
         } 
    }
    
}
