import java.util.*;
public class addlast{
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        void addlast(int val)
        {
            if(size==0)
            {
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            head=tail=temp;
            size++;
        }
        else
        {
          Node temp=new Node();
          temp.data=val;
          temp.next=null;
          tail.next=temp;
          tail=temp;
          size++;
        }
    }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        
        
    }
}