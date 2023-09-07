//counting stair path using tabulation          
import java.util.*;
public class climbingstair
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n+1];
        int res=countpath(n,arr);
        System.out.println(res);
        
    }
    // public static int countpath(int n, int[] qb)
    // {
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(n<0)
    //     {
    //         return 0;
    //     }
    //     if(qb[n]!=0)
    //     {
    //         return qb[n];
    //     }
    //     int sum=countpath(n-1, qb)+countpath(n-2, qb)+countpath(n-3, qb);
    //     qb[n]=sum;
    //     return sum;


    // }
    public static int countpath(int n, int[] arr)
    {
        arr[0]=1;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                arr[i]=arr[i-1];

            }
            else if(i==2)
            {
                arr[i]=arr[i-1]+arr[i-2];
            }
            else{
                arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
            }
        }
        return arr[n];


    }
}