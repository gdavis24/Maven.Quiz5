package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
//        for(int i = 0; i <= string.length(); i++)
//            for(int j = i; j < string.length(); j++)
//                if (isPalindrome(string.substring(i , j + 1))) {
//                    System.out.println(string.substring(i, j + 1));
//                    String palin = string.substring(i, j + 1);
//                    String[] result = new String[10];
//                    result[i] = palin;
//                    return result;
//                }
    //Normal arrays are annoying
        Set<String> result = new HashSet<>();
        for(int i = 0; i < string.length(); i++){
            for(int j = i; j < string.length(); j++){
                if (isPalindrome(string.substring(i, j + 1))){
                    result.add(string.substring(i, j + 1));
                }
            }
        }

        return result.toArray(new String[result.size()]);
    }

    public static Boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j){
            if (string.charAt(i) != string.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String reverseString(String string) {
        String output = "";
        for (int i = string.length() - 1; i >= 0; i--){
            output = output + string.charAt(i);
        }
        return output;
    }
}
