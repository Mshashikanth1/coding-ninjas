public class Solution {
    public static int countDigits(int n){
        //Count Digits.java
        //https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
        // Write your code here.
        int m=n,countDigits=0;
        while(n>0){
            int dig=n%10;
            if(dig!=0 && m%dig==0) countDigits++;
            n=n/10;
        }
        return countDigits;
    }
}
