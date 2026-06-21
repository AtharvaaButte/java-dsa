class count_all_digit_1{
    public static void main(String args[]){
        System.out.println(Solution.countDigits(1567));
    }
}

class Solution {
    public static int countDigits(int n) {
        int c = 0;
        while(n!= 0){
            c++;
            n = n/10;
        }
        return c;        
    }
}

