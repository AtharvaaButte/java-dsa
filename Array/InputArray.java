import java.util.Scanner;
class InputArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int n = sc.nextInt();
        int arr[]=  new int[n];
        System.out.println("Enter elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // Simple loop
        for(int i =0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }

        // Enchanced loop
        for (int num: arr){
            System.out.print(num+" ");
        }
  }
} 