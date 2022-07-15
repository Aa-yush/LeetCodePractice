
import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer stoken = new StringTokenizer(s);
        String str_rev = stoken.nextToken();
        for(int i = 1; stoken.hasMoreTokens(); i++)
        {
            str_rev = stoken.nextToken() + " " + str_rev;
        }
        
     return str_rev;
        
    }
}