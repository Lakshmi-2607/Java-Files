import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    Graph(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add Edge
    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // BFS Traversal
    void BFS(int start) {
        boolean[] visited = new boolean[vertices];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);

        System.out.println("Breadth First Traversal starting from vertex 0:");
        g.BFS(0);
    }
}