import java.util.*;
public class max {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int result= maxarr(arr, 0);
        System.out.println(result);

    }
    public static int maxarr(int arr[], int n)
    {
        if(n==arr.length-1)
        {
            return arr[n];
        }
        int newmax=maxarr(arr, n+1);
        if(newmax>arr[n])
        {
            return newmax;
        }
        else{
            return arr[n];
        }


    }
    
}
