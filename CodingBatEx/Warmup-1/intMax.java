/*

Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3

 */
public class Code24{
    public int intMax(int a, int b, int c){
        int max=Math.max(a,b);
        max=Math.max(max,c);
        return max;
    }

}

/* Solution #1
public int intMax(int a, int b, int c){
        if (b<a && c<a) return a;
        if (a<b && c<b) return b;
        return c;
    }
 */

/* Solution #2
   public int intMax(int a, int b, int c){
        int max=a;
        if (max<b) max = b;
        if (max<c) max = c;
        return max;
    }
 */

/* Solution #3
public int intMax(int a, int b, int c){
        int max=Math.max(a,b);
        max=Math.max(max,c);
        return max;
    }
    }
 */

