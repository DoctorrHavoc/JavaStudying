/*
Count the number of "xx" in the given string.
We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */

public class Code3{
    public int countXX(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.substring(i,i+2).equals("xx"))
                    count++;
        }
        return count;
    }
}

