import java.util.*;
public class ser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=series(n);
        System.out.println(sum-1);
    }
    public static int series(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int result=series(n-1);
        while(n>0)
        {
            result=result+n;
            n--;
        }
        return result;
    }
}
