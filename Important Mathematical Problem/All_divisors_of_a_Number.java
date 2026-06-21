import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class All_divisors_of_a_Number{
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> ans = new ArrayList();
        for (int i =1; i*i <= n;i++){
            if(n %i == 0){
                ans.add(i);
                
                if(i != n/i){
                    ans.add(n/i);
                }
            }
        }
        Collections.sort(ans);
        System.out.print("Divisors: ");
        for(Integer d : ans){
        System.out.print( d + " ");
        }

    }
}