package Graph;
//O(V^V)
import java.util.ArrayList;

public class allPathGraph {
    static class Edge{
        int src;
        int dest;
        int wt;
        
        public Edge(int s, int d, int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[], int vertex)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 4, 10));
        // graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, -1));
        graph[3].add(new Edge(3, 5, -1));

        graph[4].add(new Edge(4, 2, -1));
        graph[4].add(new Edge(4, 3, -1));
        graph[4].add(new Edge(4, 5, -1));

        graph[5].add(new Edge(5, 3, -1));
        graph[5].add(new Edge(5, 4, -1));
        graph[5].add(new Edge(5, 6, -1));

        graph[6].add(new Edge(6, 5, -1));
    }
    public static void dfs(ArrayList<Edge> graph[], int target, boolean vst[], String path, int curr){
        if(curr==target)
        {
            System.out.print(path);
            System.out.println();
            return;
        }
        if(vst[curr]==true)
        {
            return;
        }
        // vst[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e= graph[curr].get(i);
            vst[curr]=true;
            dfs(graph, target, vst, path+e.dest, e.dest);
            vst[curr]=false;
        }
        

    }
    public static void main(String[] args) {
        int vertex=7;
        ArrayList<Edge> graph[]=new ArrayList[7];
        createGraph(graph, vertex);
        int target=5;
        int src=0;
        String path="0";
        // String path;
        boolean vst[]=new boolean[7];
        dfs(graph, target, vst, path, src);
        
    }
    
}
