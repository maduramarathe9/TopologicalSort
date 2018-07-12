package graphPackage;

public class Main {

    public static void main(String[] args){
        Graph g = new Graph(5);
        g.addEdge(2,1);
        g.addEdge(0,1);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(3,4);

        TopologicalSort topologicalSort = new TopologicalSort(g);
        topologicalSort.topologicalSort();

    }
}
