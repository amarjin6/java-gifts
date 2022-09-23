package task_3;

public class CheckValues {
    public static  void  checkParams(double a, double b, double h) {
        if (!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(h)) {
            throw new IllegalArgumentException("Invalid arguments!");
        }
        if (b < a) {
            throw new IllegalArgumentException("b should be less than a!");
        }
        if (h <= 0) {
            throw new IllegalArgumentException("h should be more then 0!");
        }
    }
}
