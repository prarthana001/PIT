package pitexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NTime {
	// int[] inp = { 10, 20, 30, 40, 50};
   // int k = 40;

	public int[] FindElementsWithSpecificSum(int[] inp, int k)
    {
        int[] result = new int[2];
        Map<Integer, Integer> dictionary = new HashMap<Integer, Integer>();
        for (int i = 0; i < inp.length; i++)
        {
            if (dictionary.containsKey(inp[i]))
            {
                result[0] = dictionary.get(inp[i]);
                result[1] = inp[i];
                break;
            }
            else
            {
                dictionary.put(k - inp[i], inp[i]);
            }
        }
        
        return result;
    }
}
