import java.util.Scanner;

public class pair {
    public static void findpair(int arr[], int sum){
        int counter=0;
        for(int i=0;i<arr.length;i++)
        {                                        // O(n^2)
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    counter++;
                    break;
                }
            }
        }
        System.out.println(counter);

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int size=in.nextInt();
            int arr1[]=new int[size];
            for(int j=0;j<size;j++)
            {
                arr1[j]=in.nextInt();
            }
            int sum=in.nextInt();
            findpair(arr1, sum);
        }
    }
    
}
