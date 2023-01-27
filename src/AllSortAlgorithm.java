import java.util.Arrays;

public class AllSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {44,22,88,33,0,5};
        AllSortAlgorithm allSortAlgorithm = new AllSortAlgorithm();
//        allSortAlgorithm.bubble(arr);
//        allSortAlgorithm.selection(arr);
          allSortAlgorithm.insertion(arr);

    }

    public void insertion(int[] arr){
        for (int index = 0; index <arr.length-1 ; index++) {
            for (int element = index+1; element > 0 ; element--) {
                if (arr[element] < arr[element-1]) {
                    swap(arr,element,element-1);
                }else
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    private void bubble(int[] arr) {
        //compare the next two element in an array and sort till the last element is the largest element.
    boolean swapped;
        for (int index = 0; index < arr.length; index++) {
            swapped = false;
            for (int element = 1; element < arr.length - index; element++) {
                if (arr[element] < arr[element -1]){
                    swap(arr,element,element-1);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println("Answer from Bubble Sort "+Arrays.toString(arr));
    }
    //---------------------------------------------------------------------------------------------------------

    public void selection(int[] arr){
        // select one element example maximum element in the array and put in last index of the array.
        for (int index = 0; index < arr.length; index++) {
            int lastIndex = arr.length -index -1;
            int maxIndex = getMaxIndex(arr, 0 ,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
        System.out.println("Selection Sort "+Arrays.toString(arr));
    }
    // selection Sort Find Maximum element
    public int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <=end ; i++) {
            if (arr[start] < arr[i]){
                max = i;
            }
        }
        return max;
    }
//----------------------------------------------------------------------------------------------------------------







    public void swap(int[] arr, int wrongIndex, int correctIndex){
        int temp = arr[wrongIndex];
        arr[wrongIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
