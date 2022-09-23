package task_3;

import java.util.Formatter;

public class PrintTable {
    public static void printArray(double[][] arr) {

        System.out.println( "_____________________________");
        System.out.println( "|      x      |    tg(x)    |");
        System.out.println( "|_____________|_____________|");

        for (int i = 0; i< arr[0].length; i++) {
            System.out.println(new Formatter().format("| %+10.4f  | %+10.4f  |", arr[0][i],arr[1][i]));
            System.out.println( "|_____________|_____________|");
        }
    }
}
