/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */

public class Code28{
    public boolean stringE(String str){
        int amount=0;
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)=='e') amount++;
        }
        return ((1<=amount)&&(amount<=3));
    }
}

