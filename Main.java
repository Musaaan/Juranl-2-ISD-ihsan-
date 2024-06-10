public class Main {
    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList();
        graph.addEdge("A", "B");
        graph.addEdge("A", "E");
        graph.addEdge("A", "D");
        graph.addEdge("B", "E");
        graph.addEdge("C", "B");
        graph.addEdge("D", "G");
        graph.addEdge("E", "H");
        graph.addEdge("E", "F");
        graph.addEdge("F", "C");
        graph.addEdge("F", "H");
        graph.addEdge("G", "H");
        graph.addEdge("H", "I");
        graph.addEdge("I", "F");

        graph.printGraph();
    }
}