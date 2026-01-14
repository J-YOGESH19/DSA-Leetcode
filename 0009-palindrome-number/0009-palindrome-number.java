class Solution {
    public boolean isPalindrome(int x) {

        if ( x < 0){
            return false;
        }
String s = Integer.toString(x);
       
        //this will change th );e string to integer

        //one more is there which can change the string to integr
        //String a = String.valueOf() it work for any data type 

        int left = 0 ;
        int right  = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;

        }

        return true ;
        
    }
}