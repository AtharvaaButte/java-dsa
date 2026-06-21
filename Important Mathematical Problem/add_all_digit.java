class add_all_digit{
    public static void main(String args[]){
        System.out.println(Solution.countDigits(1567));
    }
}

class Solution {
    public static int countDigits(int n) {
        int sum = 0,r;
        while(n!= 0){
            r = (n%10);
            sum = sum +r;
            n = n/10;
        }
        return sum;        
    }
}
