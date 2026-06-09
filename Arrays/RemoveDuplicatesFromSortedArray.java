import java.util.*;
class RemoveDuplicatesFromSortedArray{
	public static int SizeCount(int arr[]){
		int i = 0;
		for(int j = 1 ; j < arr.length ; j++){
			if(arr[i] != arr[j]){
				arr[i+1] = arr[j];
				i++;
			}
		}
		return i+1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(SizeCount(arr));
	}
}