public class wealth {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int maxWealth = 0; 
        
        for (int i = 0; i < n; i++) {
            int currWealth = 0;  
            for (int j = 0; j < accounts[i].length; j++) {
                currWealth += accounts[i][j];  
            }
            maxWealth = Math.max(maxWealth, currWealth);  
        }
        return maxWealth;
        
    }
    public static void main(String[] args) {
        int[][] accounts= {{1,2,3},{4,5,6},{7,8,9}};
        wealth result = new wealth();
        int resultfinal = result.maximumWealth(accounts);
        System.out.println(resultfinal);
    }
}
