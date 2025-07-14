class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)return false;
        int duplicate = x;
        int revnum = 0;
        while(x != 0){
        int lastnum = x % 10;
        revnum = (revnum)*10 + lastnum;
        x = x/10;

        }

        if(revnum == duplicate) return true;
        else return false;
    }
}