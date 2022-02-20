import java.util.*;
public class addfirst {
    public static class node{
        int data;
        node next;
    }
    public static class LinkedList{
        node head;
        node tail;
        int size=0;
        public void adddata(int val)
           {
               node temp=new node();
               if(size==0)
               {
                   temp.data=val;
                   temp.next=null;
                   head=tail=temp;
                   size++;
               }
               else{
                   temp.data=val;
                   temp.next=null;
                   tail.next=temp;
                   tail=temp;
                   size++;
               }
           }
           public void addfirst(int value)
           {
            node temp=new node();
               if(size==0)
               { 
                   temp.data=value;
                   temp.next=null;
                   head=tail=temp;
                   size++;
               }
               else{
                   temp.data=value;
                   temp.next=head;
                   head=temp;
                   size++;
               }
               
           }
           public void display()
           {
               node temp=head;
               while(temp!=null)
               {
                   System.out.print(temp.data);
                   temp=temp.next;
               }
           }
        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LinkedList list=new LinkedList();
        int n=in.nextInt();
        while(n!=0)
        {
            list.adddata(n);
            n=in.nextInt();
        }
        System.out.println("Enter data to be enterd at first");
        int data=in.nextInt();
        list.addfirst(data);
        list.display();
        
    }
}
