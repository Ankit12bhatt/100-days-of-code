
import java.util.*;
public class inc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        inc(n);
    }
    public static void inc(int n)
    {
        if(n==0)
        {
            return;
        }
        inc(n-1);
        System.out.println(n);
        
    }
    
}
