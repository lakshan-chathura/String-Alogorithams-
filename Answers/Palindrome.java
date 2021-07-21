package virtusa.alogorithams;

public class Palindrome {
    public static boolean isPalindrome(String word){
        if(word==null || word.length()==0){
            return false;
        }
        StringBuffer stringBuffer=new StringBuffer(word);
        String reverse=stringBuffer.reverse().toString();
        if(word.equalsIgnoreCase(reverse)){
            return true;
        }

    return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
}
