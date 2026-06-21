import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Unique_Prime_Factors_in_Sorted_Order{
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> ans =  new ArrayList();
    
        for(int i = 2 ; i*i<= n;i++){
            if(n % i == 0){
                ans.add(i);
                n /= i;
                while(n % i == 0){
                    n /= i;
                }
            }
        }
        if( n > 1){
            ans.add(n);
        }
        System.out.print("Prime Factors: ");
        for(Integer p : ans){
        System.out.print( p + " ");
        }
7
    }
}