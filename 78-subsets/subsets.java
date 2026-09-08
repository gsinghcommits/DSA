class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums,0,tmp,res);
        return res;
        
    }

    private void dfs(int[] nums, int i, List<Integer> tmp, List<List<Integer>> res) {
        if(i == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        tmp.add(nums[i]);
        dfs(nums,i+1,tmp,res);
        tmp.remove(tmp.size()-1);
        dfs(nums,i+1,tmp,res);
    }
}