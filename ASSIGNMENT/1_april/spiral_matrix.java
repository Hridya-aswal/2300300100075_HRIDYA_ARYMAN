class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> result = new ArrayList<>();
        int startrow = 0;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            for( int col = startcol ; col<=endcol;col++){
                result.add(matrix[startrow][col]);

            }
            startrow++;
            for(int row = startrow ; row<=endrow ; row++){
                result.add(matrix[row][endcol]);

            }
            endcol--;
            if(startrow<=endrow){
            for(int col =endcol;col>=startcol;col-- ){
                result.add(matrix[endrow][col]);
            }
            
            endrow--;
            }
            
             if(startcol<=endcol){
            for(int row =endrow;row>=startrow;row-- ){
            
                result.add(matrix[row][startcol]);
            }
            
            startcol++;
             }


        
        }
        return result;
        
    }
}