class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n+1];
        for(int i : nums)
        {
            visited[i] = true;
        }
        List<Integer> list = new ArrayList<>();
        for(int i =1;i<visited.length;i++)
        {
            if(!visited[i])
            {
                list.add(i);
            }
        }
        return list;
    }
}