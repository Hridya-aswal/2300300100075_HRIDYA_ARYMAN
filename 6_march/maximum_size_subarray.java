class solution{
    public int subarraylength(int[] nums,int target){
        int left =0;
        int sum=0;
        int maxlen=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                maxlen=Math.max(maxlen,right-left+1);
                sum-=nums[left];
                left++;
            }   
        }
        return maxlen;
    }   
}
