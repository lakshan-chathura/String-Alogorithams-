/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringapi.ques;

import java.util.ArrayList;

/**
 *
 * @author Lakshan
 */
public class RemoveStringVowel {
    public static Object[] getString(String word){
        char[] array=word.toCharArray();
        ArrayList<Character> arrays=new ArrayList<>();
        for(Character ch:array){
            arrays.add(ch);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                arrays.remove(ch);
            }   
        }
        Object newarray[]=arrays.toArray();
        return newarray;
        
       
    }
    public static void main(String[] args) {
        Object arr[]=RemoveStringVowel.getString("lakshan");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
