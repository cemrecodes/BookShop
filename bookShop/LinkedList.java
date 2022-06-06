/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookShop;

/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */
public class LinkedList {
   Node head = null;

    /**
     * LinkedList constructor
     */
    public LinkedList() {
        
    }
    
    public Node getHead(){
        // System.out.println("gethead"+head.data);
        // System.out.println("gethead"+head.next.data);
        return head;
    }

    public static Object[] getData(Node node){
        Book book = (Book) node.data;
        Object[] object = new Object[5];
        object[0] = book.getProduct_id();
        object[1] = book.getProductName();
        object[2] = book.getAuthor();
        object[3] = book.getNumberOfPages();
        object[4] = book.getPrice();
        return object;
    }
    
    /**
     * data ekleme
     * @param data
     */
    public void add(Object data)
    {
     if ( head == null)
    {
      head = new Node();
      head.data = data;
      head.next = null;
      head.prev = null;
      System.out.println("kitap:"+head.data);
    }
     else{
       Node newNode = new Node();
       newNode.data = data;
       newNode.next = null;  
       newNode.prev = null;

       // listeyi gezmek icin temp olusturuldu
       Node temp = head;
           
       // bir sonraki eleman null olana kadar liste geziliyor
        while(temp.next != null)
        {
           temp = temp.next;
        }
        
        // yeni node bir önceki node'un next degiskenine ataniyor
        temp.next = newNode;
        newNode.prev = temp;
       
     }
       
    } 
    
    public void delete(String data){
        Node temp = head;
        Node node = new Node();
        Book k = (Book) temp.data;
        
        if ( k.getProductName().equals(data)  )
             head = head.next;       
        else{
            while (temp.next != null){
                k = (Book) temp.next.data;
                if(k.getProductName().equals(data) ){

                    if ( temp.next.next != null){
                        node = temp.next.next;
                        temp.next.next.prev = node;
                        temp.next = node;
                    }
                    else{
                        temp.next = null;
                        break;
                    }
                }
                else
                    temp = temp.next;
            }
        }
    }
    
    public Node splitHalf(Node head, Node tail)
    {
        if (head == tail || head == null || tail == null)
            return head;
 
        Node previousPivot = head;
        Node current = head;
        Object pivot = tail.data;
 
	Book book = (Book) head.data;
	Book pivotBook = (Book)pivot;

        while (head != tail) {
            if (book.getPrice() < pivotBook.getPrice()) {
                // bir onceki degistirilen node tutuluyor
                previousPivot = current;
                Object temp = current.data;
                current.data = head.data;
                head.data = temp;
                current = current.next;
            }
            head = head.next;
        }
 
        // bir sonraki pivot secimi
        Object temp = current.data;
        current.data = pivot;
        tail.data = temp;
 
        // bir onceki pivot returnlenir
        return previousPivot;
    }
 
    public void sort(Node head, Node tail)
    {
        if(head == null || head == tail|| head == tail.next )
            return;
 
        // listeyi ikiye boler ve recursive doner
        Node previousPivot = splitHalf(head, tail);
        sort(head, previousPivot);
 
        // eger pivot secilmis ve head olmus ise bu ikisinin de ayni oldugunu gosterir
        // pivot bir sonraki node olur
        if (previousPivot != null && previousPivot == head)
            sort(previousPivot.next, tail);
 
        // eger pivot arada bir node ise
        // next nodedan baslanir
        // pivotPrevious oldugu icin iki nodeun yeri degisir
        else if (previousPivot != null
                 && previousPivot.next != null)
            sort(previousPivot.next.next, tail);
    }

    /**
     *
     * @return number of Nodes
     */
    public int elementCount()
    {  // listeyi gezmek icin temp adli bir Node olusturduk ve head Node'unu atadik
       Node temp = head;
       // sayac
       int count = 0;
       // bir sonraki Node null olana kadar calisir
       while(temp != null)
       {
           count++;
           temp = temp.next;
       }
      return count;               
    }

     public Object[] linearSearch(int id)
    {
        Node temp = head;
        Object[] object = new Object[5];        
        
        while ( temp != null)
        {
            Book k = (Book) temp.data;
            if ( k.getProduct_id() == id){
                object[0] = k.getProduct_id();
                object[1] = k.getProductName();
                object[2] = k.getAuthor();
                object[3] = k.getNumberOfPages();
                object[4] = k.getPrice();
                System.out.println(object[1]);
                return object;
            }
            temp = temp.next;
        }
        return null;
    }
     
    public boolean findBook(Book book){ 
       
        if ( head == null)
            return false;
        
        Node temp = head;
        Book book2 = (Book) temp.data;
        
        if ( book2.getProductName().equals(book.getProductName())  )
            return true;
        
        else{
            
        while (temp.next != null){
            book2 = (Book) temp.data;
            if(book2.getProductName().equals(book.getProductName()) ){
                return true;
            }
            else
                temp = temp.next;
        }
        book2 = (Book) temp.data;
            if(book2.getProductName().equals(book.getProductName()))
                return true;
                 
        }
        return false;   
 
    }
            
    /**
     * listeyi yazdirir
     * @param list
     */
    public void printLinkedList(LinkedList list)
    {
       Node temp = list.head;       
       
    // bir sonraki Node bos olana kadar listede geziliyor ve degerler yazdiriliyor
       while(temp != null)
       {
           System.out.print(temp.data +" => ");
           temp = temp.next;
       }
        System.out.println("Null");               
    }

}
