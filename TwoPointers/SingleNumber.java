import java.util.*;
class SingleNumber{
    
    public static int SingleNo(int arr[]){
        int result = 0;
        
        for(int i : arr){
            result ^= i;
        }
        
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(SingleNo(arr));
    }
}