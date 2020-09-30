/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringapi.ques;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lakshan
 */
public class StringDuplicateCharacters {

  public static void printDuplicateCharacters(String word){
    char[] array=word.toCharArray();
    //array=word.toCharArray();
    HashMap<Character,Integer> hashmap=new HashMap<>();
    for(Character ch:array){
      if(hashmap.containsKey(ch)){
        hashmap.put(ch, hashmap.get(ch)+1);
      }else{
      hashmap.put(ch,1);
      }
    
    }
    for(Map.Entry<Character,Integer> pu:hashmap.entrySet()){
        if(pu.getValue()>1){
            System.out.println(pu.getKey()+"\t"+pu.getValue());
        }
        
    }
  }
    public static void main(String[] args) {
        printDuplicateCharacters("Java");
    }
    
}
