import java.util.*;
public class Printsubseq {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        ppsq(str, "");
    }
    public static void ppsq(String str, String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String sb=str.substring(1);
        ppsq(sb, ans+ch);
        ppsq(sb, ans+"");

    }
}
