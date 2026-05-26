package Day4;
import java.util.*;

class ContainerWithMostWater{
    
    public static int mostWater(int arr[]){
        int maxArea = 0;
        
        int left = 0,right = arr.length-1;
        
        while(left < right){
            int h = Math.min(arr[left],arr[right]);
            int w = right-left;
            
            int area = h*w;
            
            maxArea = Math.max(maxArea,area);
            
            if(arr[left] <= arr[right]) left++;
            else right--;
        }
        return maxArea;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(mostWater(arr));
    }
}