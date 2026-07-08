import java.util.Scanner;
import java.util.Arrays;

class Missing_Number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        
        for(int i = 0; i< n;i++){
            arr[i] = sc.nextInt();
        }
         

        System.out.println( "Missing number: "+ missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int c_sum  = 0,r_sum = 0;
        for(int i = 0;i< nums.length;i++){
            c_sum += i;
            r_sum += nums[i];
        }
        c_sum += nums.length;
        return c_sum - r_sum;
    }

}