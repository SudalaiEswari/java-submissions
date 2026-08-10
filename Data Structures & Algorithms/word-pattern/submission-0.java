class Solution {
    public boolean wordPattern(String pattern, String s) {
        String word[] =s.split(" ");
        if(pattern.length() != word.length)
        {
            return false;
        }
        for(int i =0;i<pattern.length();i++)
        {
            for(int j =i+1;j<pattern.length();j++)
            {
                if(pattern.charAt(i) == pattern.charAt(j))
                {
                    if(!word[i].equals(word[j]))
                    {
                        return false;
                    }
                }
                else{
                      if (word[i].equals(word[j])) {
                        return false;
                    }
                }
        }

        }
        return true;
        
    }
}