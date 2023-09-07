import java.util.*;

public class leetcodeLinkedlist {
    public static class node{
        int value;
        node next;
    
    }
    public static class LinkedList{
        node head;
        node tail;
        int size=0;
        public void add(int val){
            node temp=new node();
            if(size==0)
            {
                temp.value=val;
                temp.next=null;
                head=tail=temp;
                size++;

            }
            else{
                temp.value=val;
                temp.next=null;
                tail.next=temp;
                tail=temp;
                size++;
            }
        }

        public void delete(int value)
        {
            node temp=head;
            while(temp!=null){
                

            }
            
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

    }
}
