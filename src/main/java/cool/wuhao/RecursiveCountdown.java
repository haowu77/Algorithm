package cool.wuhao;

public class RecursiveCountdown {

    private static void countdown(int i) throws InterruptedException {
        System.out.println(i);
        Thread.sleep(1000);
        if (i != 0) {
            countdown(i-1);
        }
    }
    public static void main(String[] args) {
        try {
            countdown(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
