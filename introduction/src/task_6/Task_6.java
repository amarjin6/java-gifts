package task_6;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter array size: ");
        int n = scanner.nextInt();

        System.out.println("Please, enter array");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        try {
            int[][] matrix = Matrix.fillMatrix(array);
            for (int i = 0; i < matrix.length; i++)
                System.out.print(matrix[i] + " ");

        }catch( IllegalArgumentException e) {
            System.out.println( e.getMessage() );
        }

    }
}
