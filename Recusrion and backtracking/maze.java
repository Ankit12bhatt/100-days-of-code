import java.util.*;
public class maze {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList<String> result=getmaze(1,1,n,m);
        System.out.println(result);
    }
    public static ArrayList<String> getmaze(int sr, int sc, int dr, int dc)
    {
    //     if(sr>dr)
    //     {
    //         ArrayList<String> bres=new ArrayList<>();
    //         return bres;
    //     }
    //     if(sc>dc)
    //     {
    //         ArrayList<String> bres=new ArrayList<>();
    //         return bres;
    //     }
    //     if(sr==dr)
    //     {
    //         ArrayList<String> bres=new ArrayList<>();
    //         bres.add("H");
    //         return bres;
    //     }
    //     if(sc==dc)
    //     {
    //         ArrayList<String> bres=new ArrayList<>();
    //         bres.add("V");
    //         return bres;

    //     }
    if(sc==dc && sr==dr)
    {
        ArrayList<String> bres=new ArrayList<>();
        bres.add("");
        return bres;
    }
    //   ArrayList<String> hpaths=getmaze(sr,sc+1,dr,dc);
    //   ArrayList<String> cpaths=getmaze(sr+1,sc,dr,dc);
ArrayList<String> hpaths=new ArrayList<>();
ArrayList<String> cpaths=new ArrayList<>();
    if(sc<dc)
    {
        cpaths=getmaze(sr, sc+1, dr, dc);
    }
    if(sr<dr)
    {
        hpaths=getmaze(sr+1, sc, dr, dc);
    }
      ArrayList<String> finalresult=new ArrayList<>();
      for(String rst:hpaths)
      {
          finalresult.add("h"+rst);
      }
      for(String rst:cpaths)
      {
          finalresult.add("v"+rst);
      }
      return finalresult;

    }
}
