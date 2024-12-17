import java.util.Scanner;

public class OptimalBinarySearchTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        int[] keys = new int[n];
        double[] probabilities = new double[n];
        double[] imaginaryProbabilities = new double[n + 1];

        System.out.println("Enter the values of nodes:");
        for (int i = 0; i < n; i++) {
            keys[i] = scanner.nextInt();
        }

        System.out.println("Enter the probabilities for each node:");
        for (int i = 0; i < n; i++) {
            probabilities[i] = scanner.nextDouble();
        }

        // Calculate the imaginary probabilities for each level
        imaginaryProbabilities[0] = 0;
        for (int i = 1; i <= n; i++) {
            imaginaryProbabilities[i] = imaginaryProbabilities[i - 1] + probabilities[i - 1];
        }

        double expectedSearchCost = optimalBST(keys, probabilities, imaginaryProbabilities);
        System.out.println("Minimum expected search cost: " + expectedSearchCost);

        scanner.close();
    }

    public static double optimalBST(int[] keys, double[] probabilities, double[] imaginaryProbabilities) {
        int n = keys.length;
        double[][] memo = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
        return optimalBSTHelper(keys, probabilities, imaginaryProbabilities, 0, n - 1, memo);
    }

    private static double optimalBSTHelper(int[] keys, double[] probabilities, double[] imaginaryProbabilities,
                                           int start, int end, double[][] memo) {
        if (start > end) {
            return 0;
        }

        if (memo[start][end] != -1) {
            return memo[start][end];
        }

        double cost = Double.MAX_VALUE;
        for (int root = start; root <= end; root++) {
            double leftCost = optimalBSTHelper(keys, probabilities, imaginaryProbabilities, start, root - 1, memo);
            double rightCost = optimalBSTHelper(keys, probabilities, imaginaryProbabilities, root + 1, end, memo);

            double rootCost = imaginaryProbabilities[end + 1] - imaginaryProbabilities[start];
            rootCost += leftCost + rightCost;

            cost = Math.min(cost, rootCost);
        }

        memo[start][end] = cost;
        return cost;
    }
}
