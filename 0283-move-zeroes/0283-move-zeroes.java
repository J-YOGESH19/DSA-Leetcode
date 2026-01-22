class Solution {
    public void moveZeroes(int[] nums) {

        //in this  problem we will consider two pointer one which travers to  the whole for loop and keep the pos as  0 if we find the element rather then 0 we will move it to front .

        int pos = 0 ;

        for(int i = 0 ; i < nums.length ; i++ ){
            if(nums[i] != 0 ){
                nums[pos] = nums[i];
                pos ++ ;
            }
        }

        while(pos < nums.length){
            nums[pos] = 0 ;
            pos ++ ;
        }


        // and the time complexity for it is o(n)



        
    }
}