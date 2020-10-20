package demo.bytecode;

/**
 * @Author : Wu.D.J
 * @Create : 2020.10.19
 */
public class LocalVariableTest {

    public static void main(String[] args) {
        MovingAverage average = new MovingAverage();
        int num1 = 1;
        int num2 = 2;
        average.submit(num1);
        average.submit(num2);
        double avg = average.getAvg();
    }
}
