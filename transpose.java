import java.util.Scanner;
public class transpose {
    public static void main(String args[]) {
        System.out.println("ENTER MATRIX SIZE & ELEMENTS");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("TRANPOSE OF MATRIX IS :");
        for(int j=0;j<cols;j++) {
            for(int i =0;i<rows;i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
sc.close();

    }
}
