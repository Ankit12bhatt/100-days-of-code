import java.util.*;
public class find {
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
        public void search(int index)
        {
            System.out.println("Head="+head.data);
            System.out.println("Last="+tail.data);
            index=index-1;
            node temp=head;
            int number=0;
            while(temp!=null)
            {
                if(number==index)
                {
                System.out.println(temp.data);
                break;
                }
                else{
                    temp=temp.next;
                    number++;
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
            list.adddata(n);
            n=in.nextInt();
        }
        System.out.println("Enter index to return data");
        int index=in.nextInt();
        list.search(index);
    }
    
}
