import java.util.Scanner;

//problem :https://www.codingninjas.com/studio/problems/find-character-case_58513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc =new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((int)'a' <= (int)ch && (int)'z' >= (int)ch){
            System.out.println("0");
        }
        else if((int)'A' <= (int)ch && (int)'Z' >= (int)ch){
            System.out.println("1");
        }else {
            System.out.println("-1");
            }



    }
}
