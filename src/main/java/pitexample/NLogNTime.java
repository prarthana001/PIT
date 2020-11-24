package pitexample;
import java.util.ArrayList;
import java.util.Arrays; 

public class NLogNTime {

	public int MaxOverlap(int[] arrival, int[] exit)
    {
		if(arrival.length == 0 || exit.length == 0) {
			return -1;
		}
        Arrays.sort(arrival);
        Arrays.sort(exit);

        int max_guest_so_far = 1;
        int max_guest = 1;

        int i = 0;
        int j = 0;

        int n = arrival.length;
        int time = arrival[0];

        while (i < n && j < n)
        {
            if (arrival[i] <= exit[j])
            {
                max_guest_so_far++;
                if (max_guest_so_far > max_guest)
                {
                    max_guest = max_guest_so_far;
                    time = arrival[i];
                }
                i++;
            }
            else
            {
                j++;
                max_guest_so_far--;
            }
        }
        return max_guest;
    }
    
}
