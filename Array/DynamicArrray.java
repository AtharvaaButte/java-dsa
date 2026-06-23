import java.util.ArrayList;
class DynamicArrray
 {  
     public static void main(String args[]){
       
        // ArrayList 
        int normalArr[] = new int[5];
        // ArrayList<Integer> arr = new ArrayList<Integer> ();
        
        // This also correct 
        ArrayList<Integer> arr = new ArrayList< > ();
        arr.add(10);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        arr.add(1,20);
        
        System.out.println(arr.contains(2));
        
        System.out.println(arr.remove(1));
        System.out.println(arr.remove(Integer.valueOf(30)));
        System.out.println("get(1) "+arr.get(1));
        arr.set(2,40);

        System.out.println("indexOf(40) "+arr.indexOf(40));
        System.out.println("lastIndexOf(40) "+arr.lastIndexOf(40));
        
        System.out.println("Size: "+arr.size());

        for(int i =0;i< arr.size();i++){
            System.out.print(arr.get(i)+"i ");
        }
        System.out.println();

        for(int a: arr){
            System.out.print(a+"a ");
        }
        for(Integer a: arr){
            System.out.print(a+"a ");
        }
        System.out.println(arr);
        arr.clear();
        
        System.out.println(arr);
        System.out.println(arr.isEmpty());
      }
 }