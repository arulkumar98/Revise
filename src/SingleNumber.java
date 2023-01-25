class SingleNumber {
    public static void main(String[] args) {
        int[] numbs = {4,1,2,1,2};
        SingleNumber singleNumber = new SingleNumber();
        int ans = singleNumber.singleNumber(numbs);
        System.out.println(ans);
    }


    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int n : nums) {
            if (nums.length ==0){
                return nums[0];
            }

            ans ^= n;
        }
        return ans;
    }
}