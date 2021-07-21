package stringapi.ques;

public class ReverseString {
    public static String getReverseString(String word){
        if(word.length()==0){
            return "";
        }
        StringBuffer concatanated=new StringBuffer();
        for(int i=word.length()-1;i>=0;i--){
            concatanated.append(word.charAt(i));

        }
        return concatanated.toString();
    }

    //reverse a String without using String inbuilt methods
    public static String getReverseStringWithoutUsingStringMethods(String word){
        if(word.length()==0){
            return "";
        }
        int count=0;
        char array[]=new char[word.length()];
        for(int i=word.length()-1;i>=0;i--){
            array[count++]=word.charAt(i);
        }
        String reverse=new String(array);
        return reverse;
    }

    public static void main(String[] args) {
        String word="beautifull";
        System.out.println(getReverseString(word));
        System.out.println(getReverseStringWithoutUsingStringMethods(word));
    }    
}
