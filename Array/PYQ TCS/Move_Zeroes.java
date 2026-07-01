import java.util.Scanner;
import java.util.Arrays;

class Move_Zeroes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        
        for(int i = 0; i< n;i++){
            arr[i] = sc.nextInt();
        }
      
        int count_zeros = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == 0){
                count_zeros++;
            }else{
                arr[i-count_zeros] = arr[i];
            }
        }
        for(int i = arr.length - count_zeros;i<arr.length;i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

}