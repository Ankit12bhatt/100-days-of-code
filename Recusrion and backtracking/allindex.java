import java.util.*;
public class allindex{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter data to be searched");
        int data=in.nextInt();
        int[] found=arrallindex(arr,data, 0,0);
        for(int i=0;i<found.length;i++)
        {
        System.out.println(found[i]);
    }
}
    public static int[] arrallindex(int arr[], int data, int indx, int fsf)
 {
     if(indx== arr.length)
     {
         return new int[fsf];
     }
     if(arr[indx]==data)
     {
     int arr2[]=arrallindex(arr, data, indx+1, fsf+1);
     arr2[fsf]=indx;
     return arr2;
     }
     else{
         int arr2[]=arrallindex(arr, data, indx+1, fsf);
         return arr2;
     }

    }
}