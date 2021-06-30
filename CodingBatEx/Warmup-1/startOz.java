/*
Given a string, return a string made of the first 2 chars (if present), however include first
char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"

 */
public class Code23{
    String startOz(String str){
        String result = "";
        if (1<=str.length() && str.charAt(0) == 'o')
            result=result+'o';
        if (2<=str.length() && str.charAt(1) == 'z')
            result=result+'z';

        return result;
    }
}
