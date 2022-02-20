import java.util.*;
public class Removelast {
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
        public void display()
        {
            node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data);
                temp=temp.next;
            }
            System.out.println();
        }
        public void remove(){
            node temp=head;
            if(size<0)
            {
                System.out.println("cant remove Empty list");
            }
            else if(size==1)
            {
                System.out.println("Taile before removing="+tail.data);
                head=tail=temp=null;
                System.out.println("Taile after removing="+temp.data);
                
            }
            else{
            System.out.println("Taile before removing="+tail.data);
            for(int i=1;i<size-1;i++)
            {
                temp=temp.next;
                System.out.println(i);
            }
            temp.next=null;
            tail=temp;
            System.out.println("Taile after removing="+tail.data);
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
        list.display();
        list.remove();
        list.display();
        
    }
    
}
