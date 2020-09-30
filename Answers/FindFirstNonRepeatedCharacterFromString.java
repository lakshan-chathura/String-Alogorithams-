/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringapi.Answers;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Lakshan
 */
public class FindFirstNonRepeatedCharacterFromString {
        public static void firstNonRepeatedCharacterFromString(String word){
        char array[]=word.toCharArray();
        Map<Character,Integer> hashMap=new LinkedHashMap<>();
        for(Character ch:array){
            if(hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)+1);
            }else
            hashMap.put(ch,1);
        }
        for(Map.Entry<Character,Integer> hash:hashMap.entrySet()){
            if(hash.getValue()==1){
                System.out.println("Key "+hash.getKey()+" Value "+hash.getValue());
            }
            break;
        }

    }
        public static void main(String[] args) {
            String as="lakshan";
            firstNonRepeatedCharacterFromString(as);
    }
}
