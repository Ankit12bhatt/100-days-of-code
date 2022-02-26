import java.util.*;
public class ReverseLL {
    public static class node{
        int data;
        node next;
    }
    public static class LinkedList{
        node head;
        node tail;
        int size=0;
        public void adddata(int val){
            node temp=new node();
            if(size==0)
            {
                temp.data=val;
                temp.next=null;
                head=tail=temp;
                size++;
            }
            else
            {
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
             System.out.println(temp.data);
             temp=temp.next;
         }
        }
        private node getnode(int indx){
            node temp=head;
            for(int i=0;i<indx;i++)
            {
                temp=temp.next;
            }
            return temp;
        }
        public void reverse(){
            int lf=0;
            int ri=size-1;
            while(lf<ri)
            {
                node left=getnode(lf);
                node right=getnode(ri);
                int temp;
                temp=left.data;
                left.data=right.data;
                right.data=temp;
                lf++;
                ri--;
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
        System.out.println("After reverse:-");
        list.reverse();
        System.out.println("Display");
        list.display();
        
    }
    
}
