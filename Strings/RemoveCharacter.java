import java.util.*;
class RemoveCharacter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        
        StringBuilder res = new StringBuilder();
        
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != ch){
                res.append(s.charAt(i));
            }
        }
        
        System.out.println(res);
        sc.close();
    }
}
