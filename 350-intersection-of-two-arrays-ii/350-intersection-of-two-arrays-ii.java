import java.util.ArrayList;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0; i < nums1.length; i++) {
			for(int j = 0; j < nums2.length; j++) {
				if(nums1[i] == nums2[j]) {
					al.add(nums1[i]);
                    	nums2[j]=-1;
					break;
				}
			}
		}
      int [] inter = new int[al.size()];
    
        for(int i = 0; i < inter.length; i++){
            inter[i] = al.get(i);
        }
        return inter;
    }
}