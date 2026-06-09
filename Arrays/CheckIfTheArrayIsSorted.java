import java.util.*;
class CheckIfTheArrayIsSorted{
	public static boolean checkSortedArray(ArrayList<Integer> nums){
		for(int i = 1 ; i < nums.size(); i++){
			if(nums.get(i) < nums.get(i-1)) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();

		for(int i = 0 ; i < n ; i++){
			arr.add(sc.nextInt());
		}
		System.out.println(checkSortedArray(arr));
		sc.close();
	}
}