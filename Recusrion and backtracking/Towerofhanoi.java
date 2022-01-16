import java.util.*;
public class Towerofhanoi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(); // number of disk
        int TOA=in.nextInt(); // tower A
        int TOB=in.nextInt(); //Tower B 
        int TOC=in.nextInt(); // TOwer C
        hanoi(n,TOA,TOB, TOC);
    }
    public static void hanoi(int n, int TOA, int TOB, int TOC)
    {
        if(n==0)
        {
            return;
        }
        hanoi(n-1, TOA, TOC, TOB); // movement of disk from a->c
        System.out.println(n+"["+TOA+"->"+TOB+"]");
        hanoi(n-1, TOC, TOB, TOA); // movement disk from c-> b
    }

    
}
