import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int left = m+1, right= arr.size()-1;
        while( left < right){
            swap( arr, left++, right--);
        }
    }
    public static void swap(ArrayList<Integer> arr, int i, int j ){
        int temp=arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
/*
 Reverse The Array
Easy
40/40
Average time to solve is 15m
2101 upvotes
Asked in companies
Problem statement
Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array after that position.

Example:

We have an array ARR = {1, 2, 3, 4, 5, 6} and M = 3 , considering 0 
based indexing so the subarray {5, 6} will be reversed and our 
output array will be {1, 2, 3, 4, 6, 5}.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
0 <= M <= N <= 5*10^4
-10^9 <= ARR[i] <= 10^9

Time Limit: 1 sec
Sample Input 1:
2
6 3
1 2 3 4 5 6
5 2
10 9 8 7 6
Sample Output 1:
1 2 3 4 6 5
10 9 8 6 7
Explanation 1:
For the first test case, 
Considering 0-based indexing we have M = 3 so the 
subarray[M+1 … N-1] has to be reversed.
Therefore the required output will be {1, 2, 3, 4, 6, 5}.

For the second test case, 
Considering 0-based indexing we have M = 2 so the 
subarray[M+1 … N-1] has to be reversed.
Therefore the required output will be {10, 9, 8, 6, 7}.
Sample Input 2:
2
7 3
1 4 5 6 6 7 7 
9 3
10 4 5 2 3 6 1 3 6
Sample Output 2:
 1 4 5 6 7 7 6
 10 4 5 2 6 3 1 6 3 


Hints:
1. Try to think by creating another array
2. Try to think which elements are beign swapped.

*/
