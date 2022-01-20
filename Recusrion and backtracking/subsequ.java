import java.util.*;
public class subsequ {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        ArrayList<String> res= gss(str);
        System.out.println(res);
    }
    public static ArrayList<String> gss(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        char ch=str.charAt(0);
        String str1=str.substring(1);

         ArrayList<String> restring=gss(str1);
         ArrayList<String> myrs= new ArrayList<>();
         for(String rstr : restring)
         {
             myrs.add(""+rstr);
         }
         for(String rstr : restring)
         {
             myrs.add(ch+rstr);
         }
         return myrs;

    }
}
