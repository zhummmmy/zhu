public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int lo=0,hi=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0) break;
            if(i==0||nums[i]!=nums[i-1]){ 
            lo=i+1;hi=nums.length-1;
            while(lo<hi){
                if(nums[lo]+nums[hi]+nums[i]==0){
                    res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                    while(lo<hi&&nums[lo]==nums[lo+1]) lo++;
                    while(lo<hi&&nums[hi]==nums[hi-1]) hi--;
                    lo++; hi--;
                }
                else if(nums[lo]+nums[hi]+nums[i]<0) lo++;
                else hi--;
            }}
        }
        return res;
    }
}