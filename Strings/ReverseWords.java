import java.util.*;
class ReverseWords{
    
    public static String reverse(String s){
        String arr[] = s.trim().split("\\s+");
        String temp = "";
        for(int i = arr.length-1 ; i >= 0 ; i--){
            temp += arr[i]+" ";
        }
        return temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));
        sc.close();
    }
}