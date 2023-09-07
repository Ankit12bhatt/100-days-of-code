import java.util.Scanner;

public class roatate {
    public static void  findRotate(int arr[], int k)
    {
        int temp=0;
        for(int i=0;i<=k;i++)
        {
            temp=arr[0];
            for(int j=1;j<arr.length;j++)
            {
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]);


    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        findRotate(arr, 3);
    }
    
}
