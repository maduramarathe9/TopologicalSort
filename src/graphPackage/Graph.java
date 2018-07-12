package graphPackage;

import java.util.ArrayList;

public class Graph {

    public  int vertexCount;
    public ArrayList<Integer>[] edges;

    public Graph(int vertexCount){
        this.vertexCount = vertexCount;
        edges = new ArrayList[vertexCount];
        for(int i = 0;i<vertexCount;i++){
            edges[i] = new ArrayList<>();
        }
    }

    public void addEdge(int src,int destination){
        if(src!=-1 || destination!=-1){
            edges[src].add(destination);
            //edges[destination].add(src);
        }
    }

}