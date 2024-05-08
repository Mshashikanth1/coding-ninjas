public class Solution {
    public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.
        int[] nge= new int[n];
        

        for(int i=0; i<n-1; i++){
          nge[i]=-1;
            for(int j=i+1; j<n; j++) {
              if(nge[i] < arr[j] && arr[i] < arr[j] ){
                     nge[i]=arr[j];
                     break;
              }
            }
         
        }
        nge[n-1]=-1;

        return nge;
    }
}

/*
Problem statement
You are given an array 'a' of size 'n'.



Print the Next Greater Element(NGE) for every element.



The Next Greater Element for an element 'x' is the first element on the right side of 'x' in the array, which is greater than 'x'.



If no greater elements exist to the right of 'x', consider the next greater element as -1.



For example:
Input: 'a' = [7, 12, 1, 20]

Output: NGE = [12, 20, 20, -1]

Explanation: For the given array,

- The next greater element for 7 is 12.

- The next greater element for 12 is 20. 

- The next greater element for 1 is 20. 

- There is no greater element for 20 on the right side. So we consider NGE as -1.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
5
1 5 3 4 2


Sample Output 1:
5 -1 4 -1 -1


Sample Input 2:
5
5 5 5 5 5


Sample Output 2:
-1 -1 -1 -1 -1


Expected time complexity :
The expected time complexity is O(n).


Constraints :
1 <= 'n' <= 10^5
1 <= 'a[i]' <= 10^9

Time Limit: 1 sec

*/
