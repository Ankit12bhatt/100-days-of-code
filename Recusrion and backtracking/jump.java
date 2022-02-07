import java.util.*;
public class jump {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList<String> result=getjump(1,1,n,m);
        System.out.println(result);
    }
    public static ArrayList<String> getjump(int sr, int sc, int dc, int dr)
    {
        if(sc==dc && sr==dr)
    {
        ArrayList<String> bres=new ArrayList<>();
        bres.add("");
        return bres;
    }
    ArrayList<String> finalresult=new ArrayList<>();
        ArrayList<String> hpath=new ArrayList<>();
        ArrayList<String> cpath=new ArrayList<>();
        ArrayList<String> dpath=new ArrayList<>();
        for(int h=1;h<=dc-sc;h++)
        {
            hpath=getjump(sr, sc+h, dc, dr);
            // ArrayList<String> finalresult=new ArrayList<>();
              for(String rst:hpath)
              {
                  finalresult.add("h"+h+rst);
              }

        }
        for(int c=1;c<=dr-sr;c++)
        {
            cpath=getjump(sr+c, sc, dc, dr);
            for(String rst:cpath)
              {
                  finalresult.add("v"+c+rst);
              }

        }
        for(int d=1;d<=dr-sr && d<=dc-sc;d++)
        {
            dpath=getjump(sr+d, sc+d, dc, dr);
            for(String rst:dpath)
              {
                  finalresult.add("d"+d+rst);
              }
        }
    //     ArrayList<String> finalresult=new ArrayList<>();
    //   for(String rst:hpath)
    //   {
    //       finalresult.add("h"+rst);
    //   }
    //   for(String rst:cpath)
    //   {
    //       finalresult.add("v"+rst);
    //   }
    //   for(String rst:dpath)
    //   {
    //       finalresult.add("d"+rst);
    //   }
      return finalresult;

    }
    
}
