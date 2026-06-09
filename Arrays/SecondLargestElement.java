// BruteForce Approach
/*
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
*/

/*
// Better Approach
import java.util.*;
class SecondLargestElement{
	public static int secondLargestEle(int arr[]){
		int largest = arr[0],secondLargest = Integer.MIN_VALUE;
		
		for(int i : arr){
			if(i > largest) largest = i;
		}
		for(int i : arr){
			if(i > secondLargest && i != largest) secondLargest = i;
		}
		return secondLargest;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];

		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(secondLargestEle(arr));
	}
}
*/

// Optimal Solution
import java.util.*;
class SecondLargestElement{
	public static int secondLargestEle(int arr[]){
		int largest = arr[0],secondLargest = Integer.MIN_VALUE;
		
		for(int i : arr){
			if(i > largest) largest = i;
			if(i > secondLargest && i != largest) secondLargest = i;
		}
		return secondLargest;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];

		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(secondLargestEle(arr));
	}
}