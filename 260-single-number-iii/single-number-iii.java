class Solution {
    public int[] singleNumber(int[] nums)
     {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int arr[]=new int[2];
        int i=0;
        for(int num:nums)
        {
            if(map.get(num)==1)
            {
                arr[i++]=num;
            }
        }
        return arr;
    }
}