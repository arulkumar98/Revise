class MissingNumbers {
    public static void main(String[] args) {
        int[] numbs = {4, 0, 2, 1};
        MissingNumbers missingNumbers = new MissingNumbers();
        int ans = missingNumbers.missingNumber(numbs);
        System.out.println(ans);
    }

    public int missingNumber(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            int correct = nums[index];
            if (nums[index] < nums.length && nums[index] != nums[correct]) {
                swap(nums, index, correct);
            }else index++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    public void swap(int[] numbs, int wrongIndex, int correctIndex) {
        int temp = numbs[wrongIndex];
        numbs[wrongIndex] = numbs[correctIndex];
        numbs[correctIndex] = temp;
    }


}