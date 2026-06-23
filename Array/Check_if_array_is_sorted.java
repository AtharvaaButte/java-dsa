import java.util.Scanner;
class Check_if_array_is_sorted
 {  
     public static boolean isSorted(int[] arr) {
        
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
            return false;
        }
        return true;
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