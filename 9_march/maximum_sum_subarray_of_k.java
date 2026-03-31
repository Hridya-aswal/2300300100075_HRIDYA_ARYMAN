public class maximumsubaary{
    public static int maxSumSubarray(int[] arr, int k){
        int maxsum=0;
        for(int i=0;i<arr.length-k-1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
}