class Solution {
    public int distributeCandies(int[] candyType) 
    {
        HashSet<Integer>a=new HashSet<>();
        for(int candy:candyType)
        {
            a.add(candy);
            
        }
        int unique=a.size();
            int maxEat=candyType.length / 2;
            return Math.min(unique,maxEat);
    }
}