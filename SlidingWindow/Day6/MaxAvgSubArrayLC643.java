import java.util.*;
class MaxAvgSubArrayLC643{
    
    public static double maxAvg(int arr[], int k){
        int windowSum = 0;
        for(int i = 0 ; i < k ; i++){
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        for(int i = k ; i < arr.length ; i++){
            windowSum += arr[i]-arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return (double)(maxSum/k);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        System.out.println(maxAvg(arr,k));
    }
}