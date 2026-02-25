public class main{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[nums.length];
        
        // Calculate prefix sum
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        // Print prefix sum array
        System.out.println("Prefix Sum Array:");
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i] + " ");
        }
        int l = 1; 
        int r = 3;
        int rangeSum = prefixSum[r] - (l > 0 ? prefixSum[l- 1] : 0);
        System.out.println("\nRange Sum from index " + l + " to " +r + ": " + rangeSum);    
    }

}