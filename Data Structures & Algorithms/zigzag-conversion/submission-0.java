class Solution {
    public String convert(String s, int x) {
        if(x==1 || x >= s.length()  )
        {
            return s ;
        }
        StringBuilder rows[] = new StringBuilder[x];
        for(int i =0;i<x;i++)
        {
            rows[i] = new StringBuilder();
        }
        int currentrow =0;
        boolean goingdown = true;
        for(int i=0;i<s.length();i++)
        {
            rows[currentrow].append(s.charAt(i));
        if(currentrow == 0)
        {
            goingdown = true;
        }
        else if(currentrow == x-1)
        {
            goingdown = false;
        }
        if(goingdown)
        {
            currentrow++;
        }
        else
        {
            currentrow--;
        }
        }
        StringBuilder row = new StringBuilder();
        for(int i =0;i<x;i++)
        {
            row.append(rows[i]);
        }
        return row.toString();
    }
}