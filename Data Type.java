import java.util.Map;

//https://www.codingninjas.com/studio/problems/data-type_8357232?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static int dataTypes(String type) {
        // Write your code here
        if("Integer".equals(type)) return 4;
        else if("Long".equals(type)) return 8;
        else if("Float".equals(type)) return 4;
        else if("Character".equals(type)) return 1;
       return -1;
    }
}
