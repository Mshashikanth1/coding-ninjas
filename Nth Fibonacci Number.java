import java.util.Scanner;

public class Solution {
//Nth Fibonacci Number
//https://www.codingninjas.com/studio/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);

		int i=1,j=1,fibNext=i+j,n=sc.nextInt();

		if(n==1 || n==2) fibNext=1;
		for(int fib=3; fib<=n; fib++){
			fibNext=i+j;
			i=j;
			j=fibNext;
		}
		System.out.println(fibNext);

		
	}

}
