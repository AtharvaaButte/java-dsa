import java.util.Scanner;
import java.util.Arrays;
class Reverse_an_Array
 {  
    public static void reverseArray(int arr[]) {
        int i = 0,j = arr.length-1;
        while(i<=j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
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