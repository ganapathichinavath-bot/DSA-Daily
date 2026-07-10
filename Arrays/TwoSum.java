// // Using brute force approach to find the two sum problem
// import java.util.*;
// class TwoSum{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         int arr[] = new int[n];
        
//         for(int i = 0 ; i < arr.length ; i++){
//             arr[i] = sc.nextInt();
//         } 
        
//         int target = sc.nextInt();
//         boolean found = false;
//         for(int i = 0 ; i < arr.length ; i++){
//             for(int j = i+1 ; j < arr.length ; j++){
//                 if(arr[i]+arr[j] == target){
//                     System.out.println("Indices are :"+i+" , "+j);
//                     found = true;
//                     break;
//                 }
//             }
//             if(found){
//                 break;
//             }
//         }
//         if(!found){
//             System.out.println("No pair found");
//         }
//     }
// }

// Using HashMap to find the two sum problem
import java.util.*;
class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        } 
        
        int target = sc.nextInt();
        for(int i = 0 ; i < arr.length ; i++){
            int complement = target - arr[i];
            
            if(map.containsKey(complement)){
                System.out.println(map.get(complement)+" , "+i);
                sc.close();
                return;
            }
            map.put(arr[i],i);
        }
        
        System.out.println("No pair found");
        
        sc.close();
    }
}