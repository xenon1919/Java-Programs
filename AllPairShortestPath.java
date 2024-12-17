import java.util.Scanner;

public class AllPairShortestPath {
    public static void allPairShortestPath(int[][] adjacencyMatrix) {
        int n = adjacencyMatrix.length - 1;

        for (int intermediate = 1; intermediate <= n; intermediate++) {
            for (int source = 1; source <= n; source++) {
                for (int destination = 1; destination <= n; destination++) {
                    adjacencyMatrix[source][destination] = Math.min(adjacencyMatrix[source][destination],
                            adjacencyMatrix[source][intermediate] + adjacencyMatrix[intermediate][destination]);
                }
            }
        }

        for (int source = 1; source <= n; source++) {
            for (int destination = 1; destination <= n; destination++) {
                System.out.print(adjacencyMatrix[source][destination] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String... arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int n = scan.nextInt();
        int[][] adjacencyMatrix = new int[n + 1][n + 1];
        System.out.println("Enter the Weighted Matrix for the graph");
        for (int source = 1; source <= n; source++) {
            for (int destination = 1; destination <= n; destination++) {
                adjacencyMatrix[source][destination] = scan.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            adjacencyMatrix[i][i] = 0; // Set diagonal values to 0 (no self-loop)
        }

        System.out.println("Shortest Distances between all pairs of vertices:");
        allPairShortestPath(adjacencyMatrix);
        scan.close();
    }
}