package demo.bytecode;

/**
 * @Author : Wu.D.J
 * @Create : 2020.10.19
 */
public class MovingAverage {

    private int count = 0;

    private double sum = 0.0D;

    public void submit(double value) {
        count++;
        sum += value;
    }

    public double getAvg() {
        if (count == 0) {
            return sum;
        }
        return sum / count;
    }
}
