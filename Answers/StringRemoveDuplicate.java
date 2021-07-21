/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringapi.ques;

import java.util.Arrays;


public class StringRemoveDuplicate {
    public static String removeDuplicatesFromString(String sentence){
        if(sentence==null){
            return "";
        }
        StringBuffer stringBuffer=new StringBuffer();
        Set<Character> map=new HashSet<>();
        for(char element:sentence.toCharArray()){
            if(!map.contains(element)){
                map.add(element);
                stringBuffer.append(element);
            }
        }
    return stringBuffer.toString();
    }

    public static boolean checkallUniqueCharacters(String sentence){
        if(sentence==null || sentence.length()==0){
            return false;
        }
        Set<Character> map=new HashSet<>();
        for(char element:sentence.toCharArray()){
          if(!map.add(element)){
              return false;
          }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicatesFromString(""));
        System.out.println(checkallUniqueCharacters(""));



    }
}
