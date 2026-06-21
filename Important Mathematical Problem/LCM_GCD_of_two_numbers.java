
class LCM_GCD_of_two_numbers {
    public static void main(String args[]){
    int[] ans = lcmAndGcd(28,20);
    System.out.print("LCM and GCD of 20 and 28 is "+ ans[0]+"  "+ans[1]);
    }

    public static int[] lcmAndGcd(int a, int b) {
        int[] ans = new int [2];
        ans[1] = gcd(a,b);
        ans[0] = (a*b)/ans[1];
        
        return ans;
    }
    static int gcd (int a , int b ){
        if (b == 0)
            return a;
        return gcd(b,a%b);
    }
 }