import java.util.*;
public class lastoccur {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter search element");
        int data=in.nextInt();
        int occur=lastoccurance(arr, data, 0);
        System.out.println(occur);


    }
    public static int lastoccurance(int arr[], int data, int n)
    {
        if(n==0)
        {
            return n;
        }
        if(n==data)
        {
            return n;
            
        }
        int occur=lastoccurance(arr, data, arr.length-1);
        return occur;
    }
    
}
