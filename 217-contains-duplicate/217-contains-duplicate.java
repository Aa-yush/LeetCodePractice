class Solution {
    public boolean containsDuplicate(int[] nums) {
    boolean flag = true;
    HashSet hs = new HashSet();
    for(int n : nums)
    {
        
    flag = hs.add(n);
    
    if(flag == false)
    return true;   
    }
    return false;
    }
}