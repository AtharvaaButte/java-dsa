import java.util.Arrays;
// 11
class Count_Of_Prime_Number{
    public static void main(String args[]){
       int n = 7;
       
       boolean[] prime = new boolean[n+1];
       Arrays.fill(prime,true);
       
       for(int i = 2;i<n;i++){
        if(prime[i]){

        for(int j = i*2;j<n;j += i){
                prime[j] = false;
        }
        }
       }
       for(int i = 0;i<=n;i++){
        if(prime[i])
        System.out.println(""+i);
       }
    }
}