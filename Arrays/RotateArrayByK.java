// // Using Brute Force to find the two sum problem
// import java.util.*;
// class RotateArrayByK{
//     public static void rotate(int[] nums, int k) {
//         k = k % nums.length;
//         int arr[] = new int[nums.length];

//         for(int i = 0 ; i < nums.length ; i++){
//             arr[(k+i)% nums.length] = nums[i];
//         }
//         for(int i= 0 ; i < arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         int arr[] = new int[n];
//         for(int i = 0 ; i < arr.length ; i++){
//             arr[i] = sc.nextInt();
//         }
        
//         int k = sc.nextInt();
        
//         rotate(arr,k);
//     }
// }

// Using Reverse to find the two sum problem
import java.util.*;
class RotateArrayByK{
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        display(nums);
    }
    private void reverse(int nums[], int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp; 

            start++;
            end--;
        }
    }
    
    private void display(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        RotateArrayByK r = new RotateArrayByK();
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        r.rotate(arr,k);
    }
}