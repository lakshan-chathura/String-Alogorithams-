/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringapi.ques;

import java.util.Arrays;


public class StringRemoveDuplicate {
    public static void removeDuplicateString(char[] array){
        int num_of_length=array.length;
        for(int i=0;i<num_of_length;i++){
            for(int j=i+1;j<num_of_length;j++){
                if(array[j]==array[i]){
                    array[j]=array[num_of_length-1];
                    num_of_length--;
                    j--;
                    
                }
            }
        }
        char[] newArray=Arrays.copyOf(array,num_of_length);
        String s1=new String(newArray);
        System.out.println(s1);
    }
    public static void main(String[] args) {
    String temp="java";
    char[] array=temp.toCharArray();
    StringRemoveDuplicate.removeDuplicateString(array); 
    }
}
