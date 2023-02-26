public class Isomorphic {
    public boolean checkIsomorphic(String firstString, String secondString){

        if(firstString==null || secondString==null){
            return false;
        }

        if(firstString.isEmpty()==true && secondString.isEmpty()==true){
            return true;
        }

        if(firstString.length() != secondString.length()){
            return false;
        }

        if(firstString.equals(secondString)){
            return true;
        }

        if(firstString.length() == 1 && secondString.length()==1){
            return true;
        }

        return false;
    }
}
