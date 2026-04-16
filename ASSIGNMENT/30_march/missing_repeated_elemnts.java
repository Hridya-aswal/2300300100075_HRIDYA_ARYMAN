class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;
        int actual =0;
        int[] freq = new int [size+1];

        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                freq[grid[i][j]]++;
                actual += grid[i][j];
            }
        }
        int repeat= -1;
        for(int i =1;i<=size;i++){
            if(freq[i]==2){
                repeat = i;
                break;
            }
        }

        int exp = size * (size+1)/2;
        int missing = exp -(actual - repeat);
        return new int[] {repeat,missing};

       
        
    }
}