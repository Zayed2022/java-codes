
import java.util.Scanner;
import java.util.Stack;
public class TopologicalSortingUsingAdjacencyMatrix {
    private int V; // Number of vertices
    private int[][] adjacencyMatrix;

    public TopologicalSortingUsingAdjacencyMatrix(int v) {
        V = v;
        adjacencyMatrix = new int[V][V];
    }
    
    // Recursive function to perform topological sorting
    private void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;

        for (int i = 0; i < V; i++) {
            if (adjacencyMatrix[v][i] == 1 && !visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        stack.push(v);
    }

    // Perform topological sorting and return the sorted order as a stack
    public Stack<Integer> topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        return stack;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();
        TopologicalSortingUsingAdjacencyMatrix graph = new TopologicalSortingUsingAdjacencyMatrix(V);

        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph.adjacencyMatrix[i][j] = scanner.nextInt();
            }
        }

        Stack<Integer> result = graph.topologicalSort();
        System.out.println("Topological Sorting Order:");
        while (!result.isEmpty()) {
            System.out.print(result.pop() + " ");
        }
    }
}