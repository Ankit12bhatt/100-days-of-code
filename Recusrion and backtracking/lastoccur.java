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
        System.out.println(occur+1);


    }
    public static int lastoccurance(int arr[], int data, int n)
    {
        if(n==arr.length)
        {
            return -1;
        }
        int lstindx=lastoccurance(arr, data, n+1);
        if(lstindx==-1)
        {
            if(arr[n]==data)
             {
            return n;
        }
        else{
            return -1;
        }
    }
        else{
            return lstindx;

        }
    
    }
    
}
