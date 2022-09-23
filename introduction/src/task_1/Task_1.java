package task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter y: ");
        double y = scanner.nextDouble();

        try {
            double  res = SolveTheEquation.equation(x, y);
            System.out.println("Result: "+ res);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }

    }
}