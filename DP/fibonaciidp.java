import java.util.*;
public class fibonaciidp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n+1];
        int result= finbo(n, arr);
        System.out.println(result);
    }
    // Using only recurssion 
    // public static int finbo(int n)
    // {
    //     if(n<=2)
    //     return 1;
    //     int res=finbo(n-1)+finbo(n-2);
    //     return res;
    // }
    public static int finbo(int n, int qb[])
    {
        if(n<2)
        {
            return n;
        }
        if(qb[n]!=0)
        {
            return qb[n];
        }
        int fbn=finbo(n-1,qb)+finbo(n-2,qb);
        qb[n]=fbn;
        return fbn;
    }
    
}
