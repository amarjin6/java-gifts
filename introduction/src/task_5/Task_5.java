package task_5;

import java.util.Scanner;

public class Task_5 {
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

            System.out.println("Min Amount for extracting: " + FindMinElements.getMinElements(array));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
