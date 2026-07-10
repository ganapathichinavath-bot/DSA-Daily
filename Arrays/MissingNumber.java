// // Using Sum Formula
// import java.util.*;
// class MissingNumber{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
        
//         int arr[] = new int[n-1];
//         int sum = 0;
//         for(int i = 0 ; i < arr.length ; i++){
//             arr[i] = sc.nextInt();
//             sum += arr[i];
//         }
//         int total = n*(n+1)/2;
        
//         System.out.println(total-sum);
//     }
// }

// Using XOR
import java.util.*;
class MissingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n-1];
        int expected = 0;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            expected ^= arr[i];
        }
        int actual = 0;
        for(int i = 1 ; i <= n ; i++){
            actual ^= i;
        }
        
        System.out.println(actual^expected);
    }
}