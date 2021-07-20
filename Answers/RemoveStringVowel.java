
package virtusa.alogorithams;


import java.util.ArrayList;
import java.util.List;

public class FindVowels {
    //count vowels given a string
    public static int countVowels(String word){
        if(word.length()==0){
            return 0;
        }
        int count=0;
        String vowels="aeiou";
        for(char ch:word.toLowerCase().toCharArray()){
            if(vowels.indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }

    //remove vowels given a string
    public static String removeVowels(String word){
        if(word.length()==0){
            throw new IllegalArgumentException();
        }
        StringBuilder stringBuilder=new StringBuilder();
        List<Character> arrList=new ArrayList<>();
        arrList.add('a');
        arrList.add('e');
        arrList.add('i');
        arrList.add('o');
        arrList.add('u');

        for(char ch:word.toLowerCase().toCharArray()){
            if(!arrList.contains(ch)){
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        String word="Trees are beautifull";
        System.out.println(countVowels(word));
        System.out.println(removeVowels(word));

    }
}
