package virtusa.alogorithams;

import java.util.Locale;

public class StringRotations {
    public static boolean isRotation(String str1,String str2){
        if(str1==null || str2==null){
            return false;
        }
        if((str1+str1).toLowerCase().contains(str2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotation("ABCD","bcda"));
    }
}
