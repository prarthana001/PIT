package pitexample;

import java.util.ArrayList;
import java.util.List;

public class SquareTime {
	 public boolean FindWord(List<String> dict, String input, int[] lookup)
     {
         // O(n^2)
         //space O(input length)
         List<String> r = new ArrayList<String>();

         if (input.length() == 0)
         {
             return true;
         }

         if (lookup[input.length()] == -1)
         {
             lookup[input.length()] = 0;

             for (int i = 1; i <= input.length(); i++)
             {
                 String prefix = input.substring(0, i);

                 if (dict.contains(prefix) && FindWord(dict, input.substring(i), lookup))
                 {
                     lookup[input.length()] = 1;
                     return true; // this is for normal word break
                 }
             }
         }

         return lookup[input.length()] == 1;
     }
}
