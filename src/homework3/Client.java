package homework3;

import homework3.pro2.AddOperation;
import homework3.pro2.Context;
import homework3.pro2.MultiplyOperation;
import homework3.pro2.SubtractOperation;

public class Client {
    public static void main(String[] args) {
        Context contextAdd = new Context(new AddOperation());
        System.out.println(contextAdd.execute(5, 15)); // Expects 20
        Context contextSubtract = new Context(new SubtractOperation());
        System.out.println(contextSubtract.execute(50, 40)); // Expects 10
        Context contextMultiply = new Context(new MultiplyOperation());
        System.out.println(contextMultiply.execute(4, 25)); // Expects 100
    }
}
