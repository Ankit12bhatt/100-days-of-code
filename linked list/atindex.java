import java.util.*;
public class atindex {
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
        else{
            temp.data=val;
            temp.next=null;
            tail.next=temp;
            tail=temp;
            size++;
        }
    }
    public void atanyindex(int indx, int val){
        indx=indx-1;
        node temp=new node();
        temp.data=val;
        node temp1=head;
        
        for(int i=0;i<=indx-1;i++)
        {
            temp1=temp1.next;
        }
        temp.next=temp1.next;
        temp1.next=temp;
        
    }
   public void display(){
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
    System.out.println("Enter data and index");
    int index=in.nextInt();
    int data=in.nextInt();
    list.atanyindex(index, data);
    System.out.println("new list");
    list.display();


        
    }
}
