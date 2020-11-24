package pitexample;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
	 public List<Integer> items;
	 public int counter;
	 
	 
	 public CustomList() {
		this.items = new ArrayList<Integer>();
	}
	 private void counterIncrement() {
		  counter++; 
		 }
	public void add(Object item) {
	  items.add((Integer) item);
	  counterIncrement();
	 } 
	 
	 public int size() {
	  return items.size();
	 }

}
