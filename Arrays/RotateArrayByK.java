import java.util.*;
class RotateArrayByK{
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int arr[] = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            arr[(k+i)% nums.length] = nums[i];
        }
        for(int i= 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        rotate(arr,k);
    }
}