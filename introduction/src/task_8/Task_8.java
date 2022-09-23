package task_8;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first sequence size: ");
        int n1 = scanner.nextInt();

        System.out.println("Please, enter first sequence");
        double[] sequence1 = new double[n1];
        for (int i = 0; i < n1; i++) {
            sequence1[i] = scanner.nextInt();
        }

        System.out.println("Please, enter second sequence size: ");
        int n2 = scanner.nextInt();

        System.out.println("Please, enter second sequence");
        double[] sequence2 = new double[n1];
        for (int i = 0; i < n2; i++) {
            sequence2[i] = scanner.nextInt();
        }

        try {
            ArrayList<Double> finalSequence = SequencesMerging.merge(sequence1, sequence2);
            System.out.println("Final sequence: " + (finalSequence.toString().substring(1, finalSequence.toString().length() - 1)));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
