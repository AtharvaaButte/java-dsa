import java.util.Scanner;
import java.util.Arrays;

class Rearrange_Array_Elements_by_Sign
 {  
    public static int[] rearrangeArray(int[] arr) {
        int newArr[] = new int[arr.length];
        int p_ptr = 0, n_ptr = 1;

        for(int i = 0;i < arr.length;i++){
            if(arr[i] > 0 ){ //Postive
                newArr[p_ptr] = arr[i];
                p_ptr += 2;
            }
            else{           //Negative
                newArr[n_ptr] = arr[i];
                n_ptr += 2;
            }
        }
        return newArr;
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
        System.out.println("Rearange: "+Arrays.toString(rearrangeArray(arr)));

        
  }
} 