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

    public static void main(String[] args) {
        String word="beautifull";
        System.out.println(getReverseString(word));
    }     
}
