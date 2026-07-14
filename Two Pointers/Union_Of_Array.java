import java.util.Scanner;
import java.util.ArrayList;

class Union_Of_Array
 {  
    
    public static ArrayList<Integer> union (int a[], int b[]){
     ArrayList<Integer> arr = new ArrayList();
     int i = 0, j = 0, ele;
     
     while(i < a.length && j < b.length){
         if(a[i] < b[j]){
             ele = a[i];
             i++;
         }
         else if(b[j] < a[i]){
             ele = b[j];
             j++;
         }
         else{
             ele = a[i];
             i++;
             j++;
         }
         if(arr.size() == 0 || ele != arr.get(arr.size()-1)){
             arr.add(ele);
         }
     }
     
     while(i < a.length){
         if(arr.size() == 0 || a[i] != arr.get(arr.size()-1)){
             arr.add(a[i]);
         }
         i++;
     }
     
      while(j < b.length){
         if(arr.size() == 0 || b[j] != arr.get(arr.size()-1)){
             arr.add(b[j]);
         }
         j++;
     }
     return arr;
    }

    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a size of 1st array: ");
       
        int n = sc.nextInt();
        int a[]=  new int[n];
       
        System.out.println("Enter elements: ");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter a size of 2nd array: ");
       
        n = sc.nextInt();
        int b[]=  new int[n];
       
        System.out.println("Enter elements: ");
        for(int i =0;i<n;i++){
            b[i] = sc.nextInt();
        }
        System.out.print("Union: ");
        System.out.print(union(a,b));

        
  }
} 