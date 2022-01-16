import java.util.*;
public class arrrecur {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();

        }
        System.out.println("array printed using recursion is:-  ");
        recarr(arr, 0);
        System.out.println("Array in reverse using recursion :- ");
        revarrrec(arr, 0);
        

    }
    public static void recarr(int arr[], int indx)
    {
        int siz=arr.length;
        if(indx>=siz)
        {
            return;
        }
        System.out.println(arr[indx]);
        recarr(arr, indx+1);

    }
    public static void revarrrec(int arr[], int n)
    {
        if(n == arr.length)
        {
            return;
        }
        
        revarrrec(arr, n+1);
        System.out.println(arr[n]);


    }
    
}
