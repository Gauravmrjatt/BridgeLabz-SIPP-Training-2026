class Solution {
    public int reverse(int x) {
        long val = 0;
        while(x != 0) {
        val = (long)val * 10 + x % 10;
        if(Integer.MAX_VALUE <= val || Integer.MIN_VALUE >= val) 
        return 0;
            x /= 10;
        }
        return (int)val;
    }
}