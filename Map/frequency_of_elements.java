import java.util.*;

class frequency_of_elements{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a size of array: ");
       
        int n = sc.nextInt();
        int arr[]=  new int[n];
       
        System.out.println("Enter elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Frequecny: "+countFreq(arr));

    }

    static ArrayList<ArrayList<Integer>> countFreq(int[] arr) {

        Map<Integer, Integer> ans = new HashMap<>();
        
        ArrayList<ArrayList<Integer>> ans_arr = 
        new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0;i<arr.length;i++ ){
            ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
        }
        
        ans.forEach((k,v) -> ans_arr.add( new ArrayList(List.of(k,v))));
        
        return ans_arr;
    }
}