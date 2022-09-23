package task_3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter h: ");
        double h = scanner.nextDouble();

        try {
            CheckValues.checkParams(a, b, h);
            double[][] arr = Function.calculate(a,b,h);
            PrintTable.printArray(arr);
        }catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
