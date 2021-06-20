/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */

public class Code22{
    public boolean mixStart(String str){
        if(3<=str.length() && str.substring(1,3).equals("ix") )
            return true;
        else
            return false;

    }

}
