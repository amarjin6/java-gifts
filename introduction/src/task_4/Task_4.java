package task_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter array size: ");
        int n = scanner.nextInt();

        System.out.println("Please, enter array");
        int[] array = new int[n];
        for (int i = 0; i<n; i++){
                array[i] = scanner.nextInt();
        }

        try {

            int[] arr  = FindPrimeNumbers.findSimpleNumbers(array);
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");

        }catch( IllegalArgumentException e) {
            System.out.println( e.getMessage() );
        }
    }
}
