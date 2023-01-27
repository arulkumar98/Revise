public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        MajorityElement majorityElement = new MajorityElement();
        int ans = majorityElement.sort(arr);
        System.out.println(ans);
    }

    private int sort(int[] nums) {
        int counter = 1;
        int candidate = nums[0];
        for (int index = 0; index < nums.length; index++) {
           if (counter == 0){
               candidate = nums[index];
           }
            if (nums[index] == candidate){
                counter ++;
            }else
                counter --;
        }
        return candidate;
    }
}
