package pitexample;

import java.util.ArrayList;
import java.util.List;

public class LogNTime {

	 public int FindIndex(ArrayList<Integer> list, int target, int left, int right)
     {
		 if(left < 0 || right >= list.size()) {
			 return -1;
		 }
		 
         while (left >=0 && left <= right)
         {
             int middle = left + (right - left) / 2;

             if (list.get(middle) == target)
             {
                 return middle;
             }
             else if (list.get(middle) > target)
             {
                 right = middle - 1;
             }
             else
             {
                 left = middle + 1;
             }
         }

         return left;
     }

}
