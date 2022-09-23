package task_9;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public static void main(String[] args) {
        List<Ball> basket = new ArrayList<>();

        basket.add(new Ball("Blue", 5));
        basket.add(new Ball("Red", 7));
        basket.add(new Ball("Green", 74));

        System.out.printf("Blue balls amount: %d\n", findBlueBallsAmount(basket));
        System.out.printf("Total weight: %d", findWeight(basket));
    }

    private static int findWeight(List<Ball> basket) {
        return basket.stream().mapToInt(ball -> ball.weight).sum();
    }

    private static long findBlueBallsAmount(List<Ball> basket) {
        return basket.stream().filter(ball -> ball.colour.equals("Blue")).count();
    }
}
