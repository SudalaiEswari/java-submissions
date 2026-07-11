class Solution {
    public int reverse(int n) {
        long rev =0;
        int temp = n;
      
        while(n != 0)
        {
            int digit = n % 10;
            rev= rev*10+digit;
            n = n/10; 
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
        {
            return 0;
        }
        return (int)rev;
    }
}
