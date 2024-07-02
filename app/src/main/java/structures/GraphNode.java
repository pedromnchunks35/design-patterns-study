package structures;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    int value;
    List<GraphNode> neighbors;

    public GraphNode(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(GraphNode neighbor) {
        this.neighbors.add(neighbor);
    }
}
