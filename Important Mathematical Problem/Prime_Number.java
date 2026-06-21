class Prime_Number{
    public static void main(String args[]){
        int n = 24;
        boolean flag = true;
        if (n == 1)
        flag = false;
        for(int i =2;i*i <=n; i++){
            if(n%i == 0){
                flag =  false;
                break;
            }
        }
        System.out.print(""+flag);
    }  
}