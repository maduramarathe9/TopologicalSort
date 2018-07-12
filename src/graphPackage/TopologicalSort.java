package graphPackage;

import java.util.Stack;

public class TopologicalSort{
    Graph g;

    public TopologicalSort(Graph g){
        this.g= g;
    }


    public void topologicalSort(){
        boolean visited[] = new boolean[g.vertexCount];
        Stack<Integer> stk = new Stack<>();

        for(int i =0;i<g.vertexCount;i++){
            visited[i] = false;
        }
        for(int i=0;i<g.vertexCount;i++ ){
            if(!visited[i]){
                helper(i,visited,stk);
            }
        }

        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }

    }

    public void helper(int vertex,boolean[] visited, Stack<Integer> stk){

        visited[vertex] = true;

        for(Integer x: g.edges[vertex]){
            if(!visited[x]){
                helper(x,visited,stk);
            }
        }
        stk.push(vertex);
    }
}
