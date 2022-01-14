import java.util.*;
public class callogpow {
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
    int xpbn2= pow(x, n/2);
    int result= xpbn2 * xpbn2;
    if(n%2 == 1)
    {
        result= result *x;
    }
    return result;
}

}
