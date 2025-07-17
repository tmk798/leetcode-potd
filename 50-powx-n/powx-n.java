class Solution {
    public double myPow(double x, int n) {
        long d = n;
        double ans = 1.0;
        if (d<0) d= d*-1;
        while(d>0){
            if (d%2==1){
              ans = ans *x;
                d=d-1;
            }
            else{
                 x=x*x;
                d=d/2;
            }
        }
        if (n<0) ans =(double) 1.0/ (double)ans;
        return ans;
    }
}