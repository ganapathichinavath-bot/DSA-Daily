import java.util.*;
class MaxFrequencyCharacter{
    public static void CharacterFreq(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int l = s.length();
        
        for(int i = 0 ; i < l ; i++){
            char ch = s.charAt(i);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxFrq = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFrq){
                maxFrq = entry.getValue();
            }
        }
        
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(maxFrq == entry.getValue()){
                System.out.println(entry.getKey() + "->" + entry.getValue());
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        CharacterFreq(s);
        sc.close();
    }
}