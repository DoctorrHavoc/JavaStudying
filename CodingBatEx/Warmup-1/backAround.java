public class Code13{
    public String backAround(String str){
        return str.substring(str.length()-1,str.length()) + str +str.substring(str.length()-1,str.length());
    }
}
