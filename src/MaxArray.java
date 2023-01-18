public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,100,75,6,8,-1};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
