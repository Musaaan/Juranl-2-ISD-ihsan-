import java.util.*;

public class AdjacencyList {
    Map<String, LinkedList<String>> adjListMap;

    // Constructor
    public AdjacencyList() {
        adjListMap = new HashMap<>();
    }


    public void addEdge(String src, String dest) {
        adjListMap.putIfAbsent(src, new LinkedList<>());
        adjListMap.putIfAbsent(dest, new LinkedList<>());
        
        adjListMap.get(src).add(dest);
    }

    public void printGraph() {
        for (String key : adjListMap.keySet()) {
            System.out.print("Vertex " + key + " is connected to: ");
            for (String node : adjListMap.get(key)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

}