class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int y = x;
        int z = 0;
        while(x != 0) {
        int last = x % 10;
        x /= 10;
        z = (z * 10) + last;
        }
        return (z == y)  ? true : false;
        
            }
}
