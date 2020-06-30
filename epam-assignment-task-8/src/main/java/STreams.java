import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class STreams {
	public static void main(String args[])
	{
	 List<String> list=new ArrayList<String>();  
	 list.add("asd");
	 list.add("dfg");
	 list.add("aa");
	 list.add("abc");
	 list.add("aaa");
	
	 
	 System.out.println(list.stream()
			  .filter(s -> s.startsWith("a"))
			  .filter(s -> s.length() == 3)
			  .collect(Collectors.toList()));
	}
	
}
