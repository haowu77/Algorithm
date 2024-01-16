package cool.wuhao;

/**
 *
 */
public class BinarySearch {

    private static int binarySearch(int[] array, int target) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex <= rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (target == array[middleIndex]) {
                return middleIndex;
            } else if (target < array[middleIndex]) {
                rightIndex = middleIndex - 1;
            } else if (target > array[middleIndex]) {
                leftIndex = middleIndex + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target =3;
        System.out.println(binarySearch(array, target));
    }
}
