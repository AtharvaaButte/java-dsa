import java.util.Scanner;

class armstring_no{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =  sc.nextInt();
        int x = n;
        int sum = 0;
        while(n != 0 ){
            sum += Math.pow(n%10,3);
            n = n/10;
        }
        System.out.println(""+ (sum == x));
    }
}