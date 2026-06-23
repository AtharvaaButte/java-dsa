import java.util.Scanner;
class Sum_of_Array
{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        
        int n = sc.nextInt();
        int arr[]=  new int[n];
        
        System.out.println("Enter elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
       int sum = 0;
       for (int num: arr){
           sum += num;
       }
       System.out.println("Sum: "+sum);

    } 
}