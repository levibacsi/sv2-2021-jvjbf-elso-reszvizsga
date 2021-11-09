package stringmanipulation;

public class StringManipulation {
    String everyEvenCharacter(String s){
        String newString = "";
        for (int i = 0; i < s.length(); i+=2) {
            newString = newString + s.substring(i, i+1);
        }
        return newString;
    }
}
