
public class addRecur {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int result=addition(arr,arr.length,0);
        System.out.println(result);

    }
    public static int addition(int arr[], int n, int i)
    {
        // int n=arr.length;
        if(i<n)
        {
            return arr[i]+addition(arr, n, ++i);
        }
        else{
               return 0;
        }
        // int add=add+sum(arr);
    }
    
}
