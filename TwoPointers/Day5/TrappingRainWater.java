import java.util.*;
class TrappingRainWater{
    
    public static int trap(int arr[]){
        int left = 0, right = arr.length-1;
        int leftMax = arr[left],rightMax = arr[right];
        int totalWater = 0;
        
        while(left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax,arr[left]);
                totalWater += leftMax-arr[left];
            }
            else{
                right--;
                rightMax = Math.max(rightMax,arr[right]);
                totalWater += rightMax-arr[right];
            }
        }
        
        return totalWater;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(trap(arr));
    }
}