import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MaximumOccurringCharacter {
    public static char findMaximumCharacter(String word) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:word.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else
                map.put(ch,1);
        }
        int max=0;
        char res='c';
        for(Map.Entry<Character,Integer> maps:map.entrySet()){
            if(max<maps.getValue()){
                max=maps.getValue();
                res=maps.getKey();
            }
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(findMaximumCharacter("raceessaaaa"));
    }
}
