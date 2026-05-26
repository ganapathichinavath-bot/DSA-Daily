import java.util.*;
class SortColors {
    public static int[] sortColor(int[] nums) {
        int low = 0, mid = 0 , high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                nums[mid] = nums[low];
                nums[low] = 0;
                mid++;
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }
        }
        return nums;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(sortColor(arr)));
    }
}