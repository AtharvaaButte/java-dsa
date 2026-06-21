import java.util.Scanner;

class pallidrome_no_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        while(n != 0 ){
            int digit  = n%10;
            rev = rev*10 + digit ;
            n = n/10;
        }
        if(n == rev){
            System.out.println("No. is palindrome");
        }else{
            System.out.println("No. is palindrome");
        }
    }
}