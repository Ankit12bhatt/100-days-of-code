import java.util.*;
public class exp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
           
        }
        if(count>=0)
        {
            System.out.println("number is not prime");
        }
        else
        {
            System.out.println("number is  prime");
        }

    }
    
}
