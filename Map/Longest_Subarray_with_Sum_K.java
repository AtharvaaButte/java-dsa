import java.util.*;

class Longest_Subarray_with_Sum_K{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a size of array: ");
       
        int n = sc.nextInt();
        int arr[]=  new int[n];
       
        System.out.println("Enter elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter a Value of K: ");
       
        int k = sc.nextInt();

        System.out.println("longest Subarray length: "+longestSubarray(arr,k));

    }

     static int longestSubarray(int[] arr, int k) {
        int sum = 0;
        int len  = 0;
        int temp_len= 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0,-1);
        
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
            int rem_sum = sum - k;
            
            if(map.containsKey(rem_sum)){
                temp_len = i - map.get(rem_sum);
            }
           
            len = (len < temp_len) ? temp_len : len;
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }
}