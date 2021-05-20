/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
 */

public class Code18{
    public boolean in1020(int a, int b){
        return ((10<=a && a<=20) ||(10<=b && b<=20));

    }
}
