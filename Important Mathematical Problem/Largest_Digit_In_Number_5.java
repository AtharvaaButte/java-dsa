import java.util.Scanner;

class Largest_Digit_In_Number_5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int max = 0;    
        while(n != 0 ){
            max = Math.max(max , n%10);
            n = n/10;
        }
        System.out.println("Max no.: "+ max);
    }
}