/*
Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false

 */

public class Code16{
    public boolean startHi(String str){
     if (str.length()<2)
         return false;

     String FirstChars = str.substring(0,3);
     if (FirstChars.equals("hi"))
         return true;
     return false;
    }
}
