package cool.wuhao;

public class Factorial {

    private static int factorial(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
