import java.util.*;
class CharacterFrequency{
    public static void CharacterFreq(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int l = s.length();
        
        for(int i = 0 ; i < l ; i++){
            char ch = s.charAt(i);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        System.out.println(map);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        CharacterFreq(s);
        sc.close();
    }
}