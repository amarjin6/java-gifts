package task_9;

public class Ball {
    public String colour;
    public int weight;

    public Ball(String colour, int weight){
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight can't be negative");
        }
        if ((colour == null) || colour.isEmpty()) {
            throw new IllegalArgumentException("Ball should have a colour");
        }

        this.colour = colour;
        this.weight = weight;
    }
}