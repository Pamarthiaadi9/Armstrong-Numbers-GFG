class Solution {
    static String armstrongNumber(int n) 
    {
        // code here
        int val = 0;
        int y = n;
        while (y > 0) 
        {
            val += Math.pow(y % 10, 3);
            y /= 10;
        }
        if (val == n) 
        {
            return "true";
        } else 
        {
            return "false";
        }
    }
}
