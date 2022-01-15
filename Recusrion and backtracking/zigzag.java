import java.util.*;
public class zigzag {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pzz(n);
    }
    public static void pzz(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("Pre"+n); //line no. 1
        pzz(n-1); //Line no. 2 and (LEFT CALL)
        System.out.println("In"+n); //Line no.3
        pzz(n-1); // Line no. 4 and (RIGHT CALL)
        System.out.println("Post"+n); //Line no. 5
    }
    
}
