class count_odd_digit_2{
    public static void main(String args[]){
        System.out.println("No. of Odd digits is " + Solution.countDigits(1562));
    }
}

class Solution {
    public static int countDigits(int n) {
        int c = 0;
        while(n!= 0){
           if((n%10)%2 == 0 ){
            c++;
           }
            n = n/10;
        }
        return c;        
    }
}

