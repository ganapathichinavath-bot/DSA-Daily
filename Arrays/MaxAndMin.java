import java.util.*;
class MaxAndMin{
    public static void MaxAndMin(int arr[]){
        int maxi = arr[0];
        int mini = arr[0];
        
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
            else if(arr[i] < mini){
                mini = arr[i];
            }
        }
        System.out.println("Max = "+maxi+"   Min = "+mini);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        
        MaxAndMin(arr);
    }
}