import java.util.*;
public class Ngetr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        Stack<Integer> st=new Stack<>();
        int arr[]=new int[10];
        System.out.println("Enter elements in array");
        for(int i=0;i<10;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=i;j<10;j++)
            {
                if(arr[i]<arr[j])
                {
                    System.out.println("NGETR of "+arr[i]);
                    System.out.println("is="+arr[j]);
                    count++;
                    break;
                }
               
            }
            
            
        }

    }
}
