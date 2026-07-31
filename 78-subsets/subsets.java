class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> m=new ArrayList<>();
        int n=nums.length;
        res(li,m,nums,n,0);
        return li;

    }
    static void res(List<List<Integer>> li,List<Integer> m,int[] nums,int n,int i)
    {
        if(n==i)
        {
            li.add(new ArrayList<>(m));
        }
        else{
            m.add(nums[i]);
            res(li,m,nums,n,i+1);
            m.remove(m.size()-1);
            res(li,m,nums,n,i+1);
        }
    }
}