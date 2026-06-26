import java.util.Scanner;
import java.util.Arrays;
class Second_Largest_in_Array
 {  
    public static int getSecondLargest(int[] arr) {
        int max, second_max=-1 ;
        max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > max){
            second_max = max;
            max = arr[i];
            }
            if(arr[i] < max && arr[i] > second_max){
                second_max = arr[i];
            }
        }
        return second_max;
    }
        
    
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a size of array: ");
       
        int n = sc.nextInt();
        int arr[]=  new int[n];
       
        System.out.println("Enter elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Largest Element : "+ getSecondLargest(arr));

  }
} 