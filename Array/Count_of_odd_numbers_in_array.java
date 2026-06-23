import java.util.Scanner;

class Count_of_odd_numbers_in_array
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
        
       int count = 0;
       for (int num: arr){
        if(num % 2 != 0)
           count++;
       }
       System.out.println("count: "+count);

    } 
}