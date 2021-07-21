package virtusa.alogorithams;

public class SentenceWordsCapaitalized {

    public static String capitalize(String sentence){
        if(sentence==null || sentence.trim().length()==0){
            return "";
        }
        String array[]=sentence.trim().replaceAll(" +"," ").split(" ");

        for(int i=0;i<array.length;i++){
            array[i]=array[i].substring(0,1).toUpperCase()+array[i].substring(1).toLowerCase();
        }
      return String.join(" ",array);
    }
    public static void main(String[] args) {
        System.out.println("Capitalized Sentence "+capitalize("trees are beautiful"));
    }
}
