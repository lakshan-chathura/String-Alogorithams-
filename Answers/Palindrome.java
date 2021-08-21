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
    
    public static boolean isValidPalindrome(String s){
        StringBuilder stringBuilder=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toLowerCase().toCharArray()){
            if(ch>='a' && ch<='z'){
                stringBuilder.append(ch);
                stack.push(ch);
            }
        }
        StringBuilder result=new StringBuilder();
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }
        if(result.toString().equals(stringBuilder.toString())){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
}
