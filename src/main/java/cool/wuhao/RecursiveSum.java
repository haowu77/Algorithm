package cool.wuhao;

public class RecursiveSum {

    private static int sum(int start, int end, int[] arr) {
        if (start == end) {
            return arr[start];
        } else {
            return arr[start] + sum(start + 1, end, arr);
        }
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4};
        System.out.println(sum(0, test.length - 1, test));
    }
}
