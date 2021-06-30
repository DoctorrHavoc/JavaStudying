/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */

public class Code27{
    public int max1020(int a, int b){
        if (10<=Math.max(a,b) && Math.max(a,b) <=20) return Math.max(a,b);
        if ((10<=Math.min(a,b) && Math.min(a,b) <=20)) return Math.min(a,b);
        return 0;
    }
}
