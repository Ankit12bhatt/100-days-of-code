import java.util.*;
public class triplet {
    public static void findtriplet(int arr[], int sum)
    {
        //O(n^3)
        int counter=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==sum)
                    {
                        counter++;
                    }
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
            findtriplet(arr1, sum);
        }
    }
}
