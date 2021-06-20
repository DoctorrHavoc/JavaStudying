/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"

 */

public class Code21{
    public String delDel(String str){
        if (4<= str.length() && str.substring(1,4).equals("del")){
            return str.substring(0,1) + str.substring(4);
        }
        else return str;

    }

}
