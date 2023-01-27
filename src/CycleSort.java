import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 0};
        CycleSort cycleSort = new CycleSort();
        cycleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }
    private void sort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
           int correctIndex = arr[index] ;
          if (arr[index] != arr[correctIndex]) {
            swap(arr, index, correctIndex);
        } else {
            index++;
        }
    }

}
    private void swap(int[] arr, int numOne, int numTwo) {
        int temp = arr[numOne];
        arr[numOne] = arr[numTwo];
        arr[numTwo] = temp;
    }
}
