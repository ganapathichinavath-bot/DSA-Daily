// BruteForce Approach
import java.util.*;
class SecondLargestElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];

		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int largest = arr[n-1];
		int secondLargest = largest;
		for(int i = n-2 ; i >= 0 ; i--){
			if(arr[i] != largest){
				secondLargest = arr[i];
				break;
			}
		}
		System.out.println(secondLargest);
	}
}