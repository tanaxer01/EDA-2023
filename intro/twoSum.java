
class twoSum {
    public static int[] solve(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) { // 0 .. N
            for (int j=i+1; j < nums.length; i++) { // N - 1
                if(nums[i] + nums[j] == target) 
                    return new int[]{ nums[0], nums[1] };
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] res  = twoSum.solve(nums, 9);

        System.out.printf("%d %d\n",res[0], res[1]);
    }
}
