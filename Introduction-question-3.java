class Solution {
    public int[] sortedSquares(int[] nums) {
        int i,j,temp[],new1=0,temp2=0;
        for(i=0;i<nums.length;i++){
            temp2=nums[i]*nums[i];
           nums[i]=temp2;
         
        }
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    new1=nums[i];
                    nums[i]=nums[j];
                    nums[j]=new1;
                   
                }
            }
        }
        for(i=0;i<nums.length;i++)
          System.out.print(nums[i]+"  ");
        return nums;
    }
    
}
