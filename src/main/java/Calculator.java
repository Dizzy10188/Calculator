import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator {

    public static void main(String[] args) {

    }

    public static double Add(double x, double y){
        return (x+y);
    }

    public static double Subtract(double x, double y){
        return (x-y);
    }

    public static double Multiply(double x, double y){
        return (x*y);
    }

    public static double Divide(double x, double y){
        if (y == 0) {
            throw new IllegalArgumentException("Number cannot be divided by 0");
        }
        return (x/y);
    }
}
