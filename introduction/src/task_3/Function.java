package task_3;

public class Function {
    public static double[][] calculate(double a, double b, double h) {
        double x = a;
        double[][] arr = initArray(a, b, h);

        for (int j = 0; j < arr[0].length; j++) {
            arr[0][j] = x;
            arr[1][j] = Math.tan(x);

            x += h;
        }

        return arr;
    }

    private static double[][] initArray(double a, double b, double h) {

        int size = (int) ((b - a) / (Math.abs(h))) + 1;
        double[][] arr = new double[2][size];

        return arr;
    }
}
