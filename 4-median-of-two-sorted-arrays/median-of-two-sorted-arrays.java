class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           double median;
        int[] mer= new int [nums1.length + nums2.length];
        for(int i = 0 ; i < nums1.length ; i++){
            mer[i]=nums1[i];
        }
       for(int i = 0 ; i < nums2.length; i++){
            mer[nums1.length+i]=nums2[i];
        }

  Arrays.sort(mer);
        
          int n = mer.length;
          if(n % 2 != 0){
           median = mer[n/2];
          }
          else{
           median = (mer[n/2] + mer[(n/2)-1]) /2.0;
          }
        
        return median;
    }
}