/*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */

public class Code4{
    public boolean doubleX(String str) {
        int i=str.indexOf('x');
        if (i==-1) return false;
        if (str.length()<=i+1) return false;
        return (str.charAt(i+1)=='x');
    }
}
