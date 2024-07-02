package structures;

import java.util.Set;

public class GraphDfs {
    public void dfs(GraphNode node, Set<GraphNode> visited) {
        if (node == null || visited.contains(node)) {
            return;
        }
        System.out.println("We visited this node: " + node.value);
        visited.add(node);
        for(GraphNode anotherNode : node.neighbors){
            dfs(anotherNode, visited);
        }
    }
}
