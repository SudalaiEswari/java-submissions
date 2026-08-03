class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum =0;

        for(int i =0;i<k;i++)
        {
            
            sum = sum +cardPoints[i];
        }
        int max = sum;
        int leftsum =0;
         for(int i =1;i<=k;i++)
        {
            sum = sum -cardPoints[k-i];
            sum = sum+cardPoints[cardPoints.length-i];
            max = Math.max(sum,max);

        
    }
    return max;
    }
}