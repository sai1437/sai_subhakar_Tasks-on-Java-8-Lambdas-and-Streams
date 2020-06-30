import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Palindrome {
	public static void main(String[] args) {
	     String [] strArray = {"amma","hello", "madam", "apple", "mango", "radar", "world", "rotor"};
	     List<String> strList = Arrays.asList(strArray);


		List<String> result = isPalindrome(strList, (String str) -> str.equals(new StringBuffer().append(str).reverse().toString()));
	
		System.out.print(result);
	  }


	public static List<String> isPalindrome(List<String> list, Predicate<String> predicate) {
	     List<String> finalList = new ArrayList<>();
	     
		 for (String str : list) {
	       if(predicate.test(str)) {
	         finalList.add(str);
	       }
	    }
	  return finalList;

	  }


}
