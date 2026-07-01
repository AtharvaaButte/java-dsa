import java.util.Scanner;
import java.util.Arrays;

class Move_Zeroes_Using_2P{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        
        for(int i = 0; i< n;i++){
            arr[i] = sc.nextInt();
        }
      
        //   J is pointer where the next non zero will be placed
        int j = -1;
        for (int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        } 
        
        if(j == -1)
            return;

        for (int i = j+1;i<arr.length;i++){
                if(arr[i] != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
        }

        System.out.println(Arrays.toString(arr));
    }

}