class Solution {
    public int firstMissingPositive(int[] nums) {
        List<Integer> li=new ArrayList<>();
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
           st.add(i);
        }
        int j=1;
        while(st.contains(j)){
            j++;
        }
        return j;
    }
}