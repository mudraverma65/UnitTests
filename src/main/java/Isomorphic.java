import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public boolean checkIsomorphic(String firstString, String secondString) {

        if (firstString == null || secondString == null) {
            return false;
        }

        if (firstString.isEmpty() == true && secondString.isEmpty() == true) {
            return true;
        }

        if (firstString.length() != secondString.length()) {
            return false;
        }
        else{

        }

        if (firstString.equals(secondString)) {
            return true;
        }

        if (firstString.length() == 1 && secondString.length() == 1) {
            return true;
        }

        if(firstString.length() == secondString.length()){
            Map<Character, Character> firstMap = new HashMap<>();
            Map<Character, Character> secondMap = new HashMap<>();

            for (int i = 0; i < firstString.length(); i++) {
                char sChar = firstString.charAt(i);
                char tChar = secondString.charAt(i);
                if (!firstMap.containsKey(sChar) && !secondMap.containsKey(tChar)) {
                    firstMap.put(sChar, tChar);
                    secondMap.put(tChar, sChar);
                } else if (!firstMap.containsKey(sChar)|| !secondMap.containsKey(tChar)||firstMap.get(sChar)!=tChar || secondMap.get(tChar) != sChar) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
