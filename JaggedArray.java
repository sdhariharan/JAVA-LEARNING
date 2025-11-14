import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating jagged array with different row sizes
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];   // 2 columns
        jagged[1] = new int[4];   // 4 columns
        jagged[2] = new int[3];   // 3 columns

        System.out.println("Enter values for the jagged array:");

        for(int i = 0; i < jagged.length; i++) {
            System.out.println("Enter " + jagged[i].length + " values for row " + i + ":");
            for(int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nJagged Array Output:");
        for(int i = 0; i < jagged.length; i++) {
            for(int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

