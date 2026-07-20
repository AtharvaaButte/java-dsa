import java.util.*;

class Two_Sum_With_Map{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a size of array: ");
       
        int n = sc.nextInt();
        int arr[]=  new int[n];
       
        System.out.println("Enter elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a target: ");
        int target = sc.nextInt();

        System.out.println("Answer: "+ Arrays.toString(twoSum(arr,target)));

    }

    static int[] twoSum(int[] nums, int target) {
        // Two Sum Solution with Map
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]), i};
            }
            map.put(target - nums[i],i);
        }
        return null;
    }
}