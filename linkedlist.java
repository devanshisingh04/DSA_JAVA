/*class linkedlist{
    static class node {
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }

public static void main(String[] args) {
    node a = new node(10);
    node b = new node(20);
    node c = new node(30);
    //link the node
    a.next = b;
    b.next = c;

    //traverse the list
    node head = a ;
    node temp =head;
    while(temp!=null){
        System.out.print(temp.data + " ");
            temp = temp.next;
    } 

    }
}*/


// make link list by add, get, delete display

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
        class Linklist{
            Node head;
            Node tail;
            void addAttail(int val){
                Node temp = new Node(val);
                if(tail == null){
                    head = tail = temp;
                }else{
                    tail.next = temp;
                    tail = temp;
                }
            }
            void addAthead(int val){
                Node temp = new Node(val);
                if(head == null){
                    head = tail = temp;
                }
                temp.next = head;
                head = temp;
            }
            void deleteAthead(){
                if(head == null){
                    System.out.print("Empty");
                    return;
                }
                head = head.next;
                if(head == null){
                    tail = null;
                }
            }
            void display(){
                if(head == null){ 
                    return;
                }
                Node temp = head ;
                while(temp != null){
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
                System.out.println();  
            }
        }
    public class linkedlist{
    public static void main (String []args){
        Linklist ll = new Linklist();
        ll.addAttail(10); ll.display();
        ll.addAttail(20); ll.display();
        ll.addAthead(30); ll.display();
        ll.deleteAthead(); ll.display();

    }
}
