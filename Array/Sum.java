import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       
        int arr[]=new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter second size");
        int m=in.nextInt();
        int arr1[]=new int[m];
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=in.nextInt();
        }
        int k=checksize(m,n);
        System.out.println("array two defined ");
        int arr2[]=new int[k];
        for(int i=n;i>=0;i--)
        {
            for(int j=m;j>=0;j--)
            {
                arr2[i]=arr[i]+arr[j];
                m=m-1;
                break;
            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }

        
    }
    public static int checksize(int m, int n)
    {
        if(m>n)
        return m;
        else
        return n;
    }
}
