class Solution {
    public int[] getConcatenation(int[] nums) {
        int length=nums.length;
        int k[]=new int[(2*length)];
        for(int i=0;i<length;i++){
           k[i]=nums[i];
           k[i+length]=nums[i];
        }
        return k;
    }
}