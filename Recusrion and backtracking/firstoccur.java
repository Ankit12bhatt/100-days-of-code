import java.util.*;
public class firstoccur {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter search data");
        int searchdata=in.nextInt();
        int occur=occurance(arr, searchdata, 0);
        System.out.println(occur);
    }
    public static int occurance(int arr[], int data, int n)
    {
        if(n==arr.length)
        {
            return n; 
        }
        if(arr[n]==data)
        {
            return n+1;
        }
        int occur=occurance(arr, data, n+1);
        return occur;

    }
    
}
