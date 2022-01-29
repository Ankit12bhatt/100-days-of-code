import java.util.*;
public class stair {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<String> result=getstair(n);
        System.out.println(result);
    }
    public static ArrayList<String> getstair(int n)
    {
        if(n==0)
        {
            ArrayList<String> remlist=new ArrayList<>();
            remlist.add("");
            return remlist;
        }
        else if(n<0)
        {
            ArrayList<String> remlList=new ArrayList<>();
            return remlList;

        }
        ArrayList<String> result1=getstair(n-1);
        ArrayList<String> result2=getstair(n-2);
        ArrayList<String> result3=getstair(n-3);
        ArrayList<String> finalresult=new ArrayList<>();
        for(String rst:result1)
        {
            finalresult.add(1+rst);
        }
        for(String rst:result2)
        {
            finalresult.add(2+rst);
        }
        for(String rst:result3)
        {
            finalresult.add(3+rst);
        }
        return finalresult;

    } 
    
}
