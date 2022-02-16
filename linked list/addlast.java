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
        void addLast(int val)
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
    public static void testList(LinkedList list) {
        System.out.println(list.size);    
        if (list.size > 0) {
          System.out.println(list.tail.data);
        } 
      }
      public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        LinkedList list = new LinkedList();
        String str = in.nextLine();
        while(str.equals("quit") == false){
          if(str.startsWith("addLast")){
            int val = Integer.parseInt(str.split(" ")[1]);
            list.addLast(val);
          } 
          str = in.nextLine();
        }
        testList(list);
      }
    }
