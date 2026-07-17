import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class PascalTriangle
 {  
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int  i = 1; i<= numRows; i++){
            ArrayList <Integer> temp = new ArrayList(i);
            temp.add(0,1);
            if(i != 1)
                temp.add(1);
            for(int j = 1;j<i-1;j++){
               
                int sum = ans.get(i-2).get(j-1) + 
                          ans.get(i-2).get(j);

                temp.add(j,sum);
            }
            ans.add(temp);
        }

        return ans;
    }
        
    
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. Of Rows: ");
        int n = sc.nextInt();
       
        System.out.println(generate(n));

  }
} 