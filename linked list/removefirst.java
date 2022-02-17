import java.util.*;
public class removefirst {
    public static class node{
        int data;
        node next;
    }
    public static class LinkedList{
        node head;
        node tail;
        int size=0;
        public void addlist(int val)
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
        public void removefirst()
        {
            
            if(size==0)
            {
                System.out.println("emptylist");
            }
            else{
                node temp=head.next;
                while(temp!=null)
                {
                    System.out.println(temp.data);
                    temp=temp.next;
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        LinkedList list=new LinkedList();
        int n=in.nextInt();
        while(n!=0)
        {
            list.addlist(n);
            n=in.nextInt();

        }
        System.out.println("removed element");
        list.removefirst();
        System.exit();
        
    }
}
