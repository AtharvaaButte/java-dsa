class Perfect_Number{
    public static void main(String args[]){
        int n = 24,sum = 0;
        
        for(int i =1;i*i <=n; i++){
            if(n%i == 0){
                sum += i;
                if(n/i != i){
                    sum += n/i;
                }
            }
        }
        System.out.print(""+(n == (sum-n)));
    }  
}