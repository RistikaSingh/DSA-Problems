public class countNegativeno {
    public int countNegatives(int[][] grid) {
        int currnum = 0;
        int count = 0;
        for(int i =0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        int[][] grid = {{1,2,-3},{4,-5,6},{7,8,9}};
        countNegativeno negative = new countNegativeno();
        int countfinal = negative.countNegatives(grid);
        System.out.println(countfinal);
        
    }
}
