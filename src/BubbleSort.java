import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,7,1,8,6,4};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.fun(arr)));
    }
    private int[] fun(int[] arr) {
        boolean sorted;
        for (int index = 0; index < arr.length; index++) {
            sorted = false;
            for (int element = 1; element < arr.length - index; element++) {
                if (arr[element] < arr[element-1]){
                    int temp = arr[element -1];
                    arr[element - 1] = arr[element];
                    arr[element]= temp;
                }
            }
           if(!sorted)
               break;
        }
        return arr;
    }
}
