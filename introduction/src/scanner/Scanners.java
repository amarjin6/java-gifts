package scanner;

import java.util.Scanner;

public class Scanners {
    public class ArrayScanner {
        private static final Scanner scanner = new Scanner(System.in);

        public static int[] inputIntArray(int size) {

            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter " + (i + 1) + " element out of " + array.length + ": ");
                array[i] = scanner.nextInt();
            }

            return array;
        }
    }
}
