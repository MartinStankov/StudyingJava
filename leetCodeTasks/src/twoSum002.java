public class twoSum002 {
    public static void main(String[] args) {
        twoSum002 sumNumbers = new twoSum002();
//        int[] result = sumNumbers.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] result1 = sumNumbers.twoSum(new int[]{2, 5, 5, 11}, 10);
//        int[] result2 = sumNumbers.twoSum(new int[]{3,3}, 6);
//        System.out.println(java.util.Arrays.toString(result));
        System.out.println(java.util.Arrays.toString(result1));
//        System.out.println(java.util.Arrays.toString(result2));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
