import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int n=in.nextInt();
        int result =pow(x, n);
        System.out.println(result);
    }
    public static int pow(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        int result= x*pow(x, (n-1));
        return result;

    }
    
}
