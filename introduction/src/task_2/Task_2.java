package task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        scanner.close();
        boolean flag = false;
        if((x >= -6 && x <= 6) && (y <= 0 && y >= -3))
        {
            flag = true;
        } else if ((x >= -4 && x <= 4) && (y >= 0 && y <= 5)) {
            flag = true;
        }
        System.out.println(flag);
    }
}
