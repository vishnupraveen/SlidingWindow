package dynamicvariant;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinctChar {


    static int longestDistinctSubString(String str, int k)
    {
        int distinctSize=0;
        int windowStart=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int windowEnd=0;windowEnd<str.length();windowEnd++)
        {
           char rightChar= str.charAt(windowEnd);
           map.put(rightChar,map.getOrDefault(rightChar,0)+1);

           while(map.size()>k)
           {
               char leftChar=str.charAt(windowStart);
               map.put(leftChar, map.put(leftChar,map.get(leftChar))-1);
               if(map.get(leftChar)==0)
               {
                   map.remove(leftChar);
               }
               windowStart++;
           }
           distinctSize=Math.max(distinctSize,windowEnd-windowStart+1);

        }

    return distinctSize;
    }

    public static void main(String[] args) {

        System.out.println(longestDistinctSubString("AAAHHIBC", 3));

    }
}
