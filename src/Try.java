public class Try {
    public static void main(String[] args) {
        int[] arr = {77,55,888,99,444};

            int max = 0;
            for (int i = 0; i <arr.length ; i++) {
                if (arr[0] < arr[i]){
                    max = i;
                }
            }
        System.out.println(max);

        }
    }

