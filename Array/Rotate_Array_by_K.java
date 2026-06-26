import java.util.Scanner;
import java.util.Arrays;
class Rotate_Array_by_K
 {  
    public static void rotateArrayByK(int arr[], int k) {
        k = k % arr.length ; //To handle the case if k > arr.length-1
        reverse(arr,0,arr.length -1);
        reverse(arr,0,k -1);
        reverse(arr,k,arr.length -1);
    }

    public static void reverse(int arr[],int start, int end){
        while(start<= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
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
        System.out.println("Enter K: ");
        int k = sc.nextInt();
        rotateArrayByK(arr,k);
        System.out.println("Reversed Array: "+Arrays.toString(arr));

        
  }
} 