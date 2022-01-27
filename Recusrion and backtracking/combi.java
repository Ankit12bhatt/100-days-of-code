import java.util.*;
public class combi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        ArrayList<String> str1=getcombi(str);
        System.out.println(str1);
    }
    static String[] mainstring={".,.", "abc","def","ghi","jkl","mno","pqrs","tu","vwx", "yz"};
    public static ArrayList<String> getcombi(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> re=new ArrayList<>();
            re.add("");
            return re;
        }
        ArrayList<String> str1;
        char ch=str.charAt(0);
        String str2=str.substring(1);
        ArrayList<String> instr=getcombi(str2);
        ArrayList<String> result=new ArrayList<>();
        String str3=mainstring[ch];
        for(int i=0;i<str3.length();i++)
        {
            char ch1=str3.charAt(i);
            for(String rstr: instr)
            {
             result.add(ch1 + rstr);

        }        
    }
    return result;
    
}
}
