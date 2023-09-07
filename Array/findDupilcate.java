import java.util.*;
public class findDupilcate
{
    public static void solution(int arr1[], int arr2[])
    {
        int data = 0;
        for(int i =0  ; i< arr1.length ; i++){
            for(int j = 0 ; j < arr2.length ; j++){
                
                if(arr1[i] == arr2[j]){
                    data = arr1[i];
                    arr2[j] = 0;
                    break;
                }
            }
            if(data !=0){
                System.out.print(data +" ");
            }
            

                data = 0 ;
            
            
        }



        // int data=0;
        // int n=arr1.length;
        // int m=arr2.length;
        // for(int i=0;i<n;i++)
        // {
            
        //     for(int j=0;j<m;j++)
        //     {
        //         if(arr1[i]==arr2[j])
        //         {

                    
        //             data=arr2[i];
        //             arr2[j]=0;
        //             break;
        //         }
        //     }
        //     if(data!=0)
        //     {
        //         System.out.print(" "+data);
                
        //     }
        //         data=0;
        //     
        // }
    }
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int testCase=in.nextInt();
	    for(int i=0;i<testCase;i++)
	    {
	        int n=in.nextInt();
	        int arr1[]=new int[n];
	        for(int j=0;j<n;j++)
	        {
	            arr1[j]=in.nextInt();
	        }
	        int m=in.nextInt();
	        int arr2[]=new int[m];
	        for(int k=0;k<m;k++)
	        {
	            arr2[k]=in.nextInt();
	        }
	        solution(arr1, arr2);
	    }
	}
}
