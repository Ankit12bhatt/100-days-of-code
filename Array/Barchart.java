import java.util.*;
public class Barchart {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int floor=max; floor>=1; floor--)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]>=floor)
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println("");
            
        }
        
    }
    
}
