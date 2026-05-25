import java.util.*;
class MoveZeroes{
    public static int[] moveZeroesToEnd(int arr[]){
        int left = 0, right = 0;
        
        while(right < arr.length){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
        if(left < arr.length){
            arr[left] = 0;
            left++;
        }
        
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(moveZeroesToEnd(arr)));
    }
}