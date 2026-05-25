import java.util.*;
class ReverseString{
    
    public static void Reverse(char s[]){
        int left = 0,right = s.length-1;
        
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
        
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        char ch[] = new char[s.length()];
        
        for(int i = 0 ; i < s.length() ; i++){
            ch[i] = s.charAt(i);
        }
        
        Reverse(ch);
    }
}