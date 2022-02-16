import java.util.*;
public class size {
    public static class node{
        int data;
        node next;
    }
    public static class LinkedList{
        node head;
        node tail;
        int size;
        public void adddata(int value)
        {
            if(size==0)
            {
                node temp=new node();
                temp.data=value;
                temp.next=null;
                head=tail=temp;
                size++;

            }
            else{
                node temp=new node();
                temp.data=value;
                temp.next=null;
                tail.next=temp;
                tail=temp;
                size++;
            }
        }
        public void size(){
            System.out.print(size);
            System.out.println();
        }
        public void display(){
            node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data);
                temp=temp.next;   
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LinkedList temp=new LinkedList();
        int n=in.nextInt();
        while(n>0)
        {
            temp.adddata(n);
            n=in.nextInt();
        }
        temp.size();
        temp.display();
        n=in.nextInt();
        while(n>0)
        {
            temp.adddata(n);
            n=in.nextInt();
        }
        temp.size();
        temp.display();
    }
    
}
