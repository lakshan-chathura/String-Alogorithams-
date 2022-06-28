package virtusa.alogorithams;

public class ReversedSentence {
    public static String getReversedSentence(String word){
        if(word.length()==0 || word==null ){
            return "";
        }
        String array[]=word.split(" ");
        StringBuffer concatanated=new StringBuffer();

        for(int i=array.length-1;i>=0;i--){
            concatanated.append(array[i]+" ");
        }
        return concatanated.toString().trim();

    }
    
    public static String reverseWords(String word){
        if(word.length()==0 || word==null ){
            return "";
        }
        String array[]=word.trim().split(" ");
        Collections.reverse(Arrays.asList(array));
        return String.join(" ",array);
    }

    public static void main(String[] args) {
        String word="Trees are beautifull";
        System.out.println("Reversed Sentence "+getReversedSentence(word));
    }
}
