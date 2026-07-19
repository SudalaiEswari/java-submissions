class Solution {
    public int maxScore(String s) {
        int max = 0;
      
        for(int i =1;i<s.length();i++)
        {
            String left = s.substring(0,i);
            String right = s.substring(i);
            int score =0;
             for(int j =0;j<left.length();j++)
             {
                
            if(left.charAt(j)=='0' )
            
            {
                score++;
            }
             }
            int score2 = 0;
            for(int j =0;j<right.length();j++)
            {
            if(right.charAt(j)=='1')
            {
                score2++;
            }
            }
             
             max = Math.max(max,score2+score);

        }
        return max;
    }
}