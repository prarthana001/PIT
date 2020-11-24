package pitexample;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ExponentialTime {
	
	public void WordBreak(List<String> dict, String input, List<String> res)
    {
        for (int i = 1; i <= input.length(); i++)
        {
            String prefix = input.substring(0, i);
            boolean present = dict.contains(prefix);
            if (present)
            {
                res.add(prefix);
                WordBreak(dict, input.substring(i), res);
            }
        }

    }
	

}
