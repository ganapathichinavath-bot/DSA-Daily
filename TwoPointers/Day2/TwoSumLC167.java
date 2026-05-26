import java.util.*;
class TwoSumLC167{
    
    public static int[] TwoSum(int arr[], int target){
        int left = 0,right = arr.length-1;
        
        while(left < right){
            int sum = arr[left]+arr[right];
            
            if(sum == target){
                return new int[]{left+1,right+1};
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        
        System.out.println(Arrays.toString(TwoSum(arr,target)));
    }
}