class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        for(int num:nums1){
            min=Math.min(min,num);
        }

        //minimum is odd->always possible
        if(min%2==1){
            return true;
        }
        //minimum is even -> all elements must be even 
        for(int num:nums1){
            if(num%2==1){
                return false;
            }
        }
        return true;
    }
}