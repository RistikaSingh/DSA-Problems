public class Convert1DTo2D {
    public static void main(String[] args) {
        
        int[] oneDArray = {1, 2, 3, 4, 5, 6, 7, 8};

        
        int rows = 2;
        int cols = 4;

        
        int[][] twoDArray = new int[rows][cols];

        
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = oneDArray[index++];
            }
        }

       
        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}    