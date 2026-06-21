
class GCD_of_two_numbers {
    public static void main(String args[]){
    System.out.print("GCD of 20 and 28 is "+ gcd(20,28));
    }

    static int gcd(int a  , int b ) {
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
 }