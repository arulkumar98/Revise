import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {55,77,55,66,8,7,5,2,-1}; //
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public void sort(int []arr ){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i -1;
            int maxIndex = getMax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    public int getMax(int[] arr, int start, int end){
       int max = start;
        for (int i = 0; i <= end ; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
