class Solution {
    public void segregateEvenOdd(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            // left is even → move forward
            if (nums[left] % 2 == 0) {
                left++;
            }
            // right is odd → move backward
            else if (nums[right] % 2 != 0) {
                right--;
            }
            // left is odd & right is even → swap
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }
    }
}