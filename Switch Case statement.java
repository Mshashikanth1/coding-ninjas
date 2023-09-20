public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        //Switch Case statement
        //https://www.codingninjas.com/studio/problems/switch-case-statement_8357244?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
        // Write your code here
        Double area=0D;
      
        switch(ch){
            case 1 : area= Math.PI*a[0]*a[0]; break;
            case 2: area=a[0]*a[1]; break;
            default: area=0D;
        }
        return area;
    }
}
