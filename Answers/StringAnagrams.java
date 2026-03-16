package virtusa.alogorithams;

import java.util.Arrays;
import java.util.Locale;

public class StringAnagrams {

    public static boolean isAnagram(String word1,String word2){
        if(word1==null || word2==null || word1.length()!=word2.length()){
          return false;
        }
        var array1=word1.toLowerCase().toCharArray();
        var array2=word2.toLowerCase().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1,array2);    
    }
}
