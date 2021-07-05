/*

Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */

public class Code5{
    public String stringBits(String str){
        String result="";
        for (int i=0;i<str.length();i=i+2){
            result=result+str.charAt(i);
        }
        return result;

    }
}
