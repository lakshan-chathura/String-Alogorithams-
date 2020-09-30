package stringapi.ques;

public class ReverseString {
    public static void reverseSring(String word){
        char array[]=word.toCharArray();
        char arrayNew[]=new char[array.length];
        int temp=0;
        for(int i=array.length-1;i>=0;i--){
            arrayNew[temp++]=array[i];
        }
        String arr=new String(arrayNew);
        System.out.println("Reverse String "+arr);
    }
    
    
    public static void main(String args[]){
        reverseSring("lakshan");
    
    
    }      
}
