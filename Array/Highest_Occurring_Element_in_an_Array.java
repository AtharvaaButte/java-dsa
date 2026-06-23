import java.util.Scanner;
class Highest_Occurring_Element_in_an_Array
 {  
     public static int highestOccures(int[] arr) {
        
      
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