package pitexample;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;


public class MyClassTest {

	  @Test
	  public void WordBreakTest()
	  {
		  ExponentialTime ext = new ExponentialTime();
		  List<String> expectedResponse = new ArrayList<String>();
		  expectedResponse.add("cat");
		  expectedResponse.add("sand");
		  expectedResponse.add("dog");
		  expectedResponse.add("cats");
		  expectedResponse.add( "and"); 
		  expectedResponse.add("dog");
		  
		  List<String> dictionary = new ArrayList<String>();
		  dictionary.add("cat");
		  dictionary.add("cats");
		  dictionary.add( "and");
		  dictionary.add("sand");
		  dictionary.add("dog");
		  
		  List<String> response = new ArrayList<String>();
		  String input = "catsanddog";
	      
		  ext.WordBreak(dictionary, input, response);
		  assertEquals(expectedResponse.size(), response.size());
		  
	  }
	
	   @Test
	   public void ConstantTimeTest() {
	     ConstantTime sut = new ConstantTime();
	     assertTrue(sut.myMethod(1, true));
	     assertTrue(sut.myMethod(2, true));
	     assertTrue(sut.myMethod(1, false));
	     assertTrue(sut.myMethod(2, false));
	     assertFalse(sut.myMethod(0, false));
	     assertFalse(sut.myMethod(-1, false));
	     assertTrue(sut.myMethod(-1, true));
	     assertTrue(sut.myMethod(0, true));
	     
	   }
	       
	       @Test
	       public void FindElementsWithSumEqualToK()
	       {
	     	  NTime nTime = new NTime();
	     	  int[] inp = { 10, 20, 30, 40, 50};
	     	  int k = 40;
	     	  int[] expectedResult = new int[] {10, 30};
	     	  int[] result = nTime.FindElementsWithSpecificSum(inp, k);
	     	  assertEquals(expectedResult.length, result.length);
	       }
	       
	       @Test
	       public void testAdd() {
	        CustomList l = new CustomList();
	        
	        l.add(1);
	        assertEquals(l.size(), 1);
	       }
	       
	  
	  @Test
	  public void MaxOverlapTest() {
		  NLogNTime nLgTime = new NLogNTime();
		  int[] arrival = {1, 2, 10, 5, 5};
          int[] exit = {4, 5, 12, 9, 12};
		  
		  int result = nLgTime.MaxOverlap(arrival, exit);
		  assertEquals(4, result);
		  
		  arrival = new int[] {};
		  
		  result = nLgTime.MaxOverlap(arrival, exit);
		  assertEquals(-1, result);
	  }
  
      
   @Test
 public void BinarySearchTest()
  {
	  LogNTime lTime = new LogNTime();
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  list.add(10);
	  list.add(20);
	  list.add(30);
	  list.add(40);
	  list.add(50);
	  int target = 35;
	  int left = 0;
	  int right = 4;
	  int result = lTime.FindIndex(list, target, left, right);
	  assertEquals(3, result);
	  
	  result = lTime.FindIndex(list, 75, left, right);
	  assertEquals(5, result);
	  
	  result = lTime.FindIndex(list, target, 0, 0);
	  assertEquals(1, result);
	  
	  result = lTime.FindIndex(list, target, -1, right);
	  assertEquals(-1, result);
	  
	  result = lTime.FindIndex(list, target, -1, 5);
	  assertEquals(-1, result);
	  
	  result = lTime.FindIndex(list, target, 0, 5);
	  assertEquals(-1, result);
	  
	  result = lTime.FindIndex(list, 30, 0, right);
	  assertEquals(2, result);
	  
  }
   
   public void FindWordTest() {
	   String input = "Wordbrk";
       int[] lookup = new int[input.length() + 1];
       SquareTime sTime = new SquareTime();
       
	   List<String> dict = new ArrayList<String>();
	   
	   boolean result = sTime.FindWord(dict, input, lookup);
       assertTrue(result);
	   
	   dict.add("this");
	   dict.add("th");
	   dict.add("is");
	   dict.add("famous");
	   dict.add("Word");
	   dict.add("break");
	   dict.add("b");
	   dict.add("r");
	   dict.add("e");
	   dict.add("a");
	   dict.add("k");
	   dict.add("br");
	   dict.add("bre");
	   dict.add("brea");
	   dict.add("ak");
	 
          
          result = sTime.FindWord(dict, input, lookup);
          assertTrue(result);
           
          input = "Wordbrktesting";
          result = sTime.FindWord(dict, input, lookup);
          assertFalse(result);
          
        }
  

  @Test
  public void BinarySearchTest2()
  {
	  LogNTime lTime = new LogNTime();
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  list.add(10);
	  list.add(20);
	  list.add(30);
	  list.add(40);
	  list.add(50);
	  int target = 10;
	  int left = 0;
	  int right = 4;
	  int result = lTime.FindIndex(list, target, left, right);
	  assertEquals(1, result);
  }
  
  
}