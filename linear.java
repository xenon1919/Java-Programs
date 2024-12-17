import java.util.Scanner;
public class linear {
    public static void main(String args[]) {
        System.out.println("ENTER ROWS & COLUMNS");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        for(int i = 0;i<rows;i++) {
            for( int j=0;j<cols;j++) {
                numbers[i][j] = sc.nextInt();
            }
        } 
           System.out.println("ENTER THE NUMBER WHICH YOU WANT TO FIND");
        int x = sc.nextInt();
        for(int i = 0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(numbers[i][j]==x) {
                    System.out.println("x found at location ("+i+","+j+")");
                }

            }
        }
sc.close();

    }
}
