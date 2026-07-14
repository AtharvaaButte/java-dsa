import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Array_Leaders
 {  
     public static ArrayList<Integer> getArrayLeaders(int[] arr) {
        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = arr.length-1;i>= 0;i--){
            if(max <= arr[i]){
                max = arr[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
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
        System.out.println("Is sorted: "+isSorted(arr));

        
  }
} 