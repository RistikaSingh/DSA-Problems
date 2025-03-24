public class split {
    public int maxScore(String s) {
        int n = s.length();
        int countzero = 0;
        int countone = 0;
        for(int i = 0; i < n; i++){
             if(s.charAt(i)=='1'){
                countone++;
             }
        }
        int maxscore = 0;
        for(int j = 0; j < n-1; j++){
            if(s.charAt(j)=='0'){
                countzero++;
            }
            else{
                countone--;
            }
            int score = (countzero + countone);
            maxscore = Math.max(maxscore , score);
        }
        return maxscore;

    }
    public static void main(String[] args) {
        String s = "1100101001";
        split cls = new split();
        int result = cls.maxScore(s);
        System.out.println(result);
    }
}
