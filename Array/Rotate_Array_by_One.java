import java.util.Scanner;
import java.util.Arrays;
class Rotate_Array_by_One
 {  
    public static void rotateArray(int arr[]) {
         int temp = arr[arr.length-1];
        for(int i = arr.length-1;i>0 ;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
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
        reverseArray(arr);
        System.out.println("Reversed Array: "+Arrays.toString(arr));

        
  }
} 