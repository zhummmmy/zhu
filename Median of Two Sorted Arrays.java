public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=nums1.length,y=nums2.length;
        if(x<y) return findMedianSortedArrays(nums2,nums1);
        
        int lo=0,hi=y*2;
        while(lo<=hi){
            int mid1=(lo+hi)/2;
            int mid2=x+y-mid1;
            Double L1=(Double)((mid2==0)?Double.MIN_VALUE:nums1[(mid2-1)/2]);
            Double L2=(Double)((mid1==0)?Double.MIN_VALUE:nums2[(mid1-1)/2]);
            Double R1=(Double)((mid2==x*2)?Double.MAX_VALUE:nums1[mid2/2]);
            Double R2=(Double)((mid1==y*2)?Double.MAX_VALUE:nums2[mid1/2]);
            if(L1>R2) lo=mid1+1;
            else{
                if(L2>R1) hi=mid1-1;
                else return (Math.max(L1,L2)+Math.min(R1,R2))/2;
            }
        }
        return -1;
    }
}