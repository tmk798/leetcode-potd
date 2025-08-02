class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

HashSet<Integer> inter = new HashSet<> ();
for(int i =0; i<nums1.length ; i++){
    for(int j=0; j<nums2.length; j++){
        if (nums1[i] == nums2[j]){
            inter.add(nums1[i]);
        }
    }
}

ArrayList<Integer> ans = new ArrayList<>(inter);
Collections.sort(ans);

int[]  result = new int [ans.size()];
for(int i =0 ; i<ans.size();i++){
    result[i]=ans.get(i);
}
return result;
    }
    
}