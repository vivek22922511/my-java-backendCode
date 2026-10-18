package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {
public static void main(String args []) {
	
	
	//Storing the data ............
	List<String>cities=Arrays.asList("Banglore","Delhi","Mumbai","Pune","Mysore");
	
	
	//processing..... task(find the  name starting with "M"and convert into upper case...)
	
	
	
//	List<String>output=cities.stream().filter(w->w.startsWith("M")).map(word->word.toUpperCase()).collect(Collectors.toList());
//	
//	System.out.println(output);
	
	
	//concetination
	
//	List<String>output=cities.stream().filter(w->w.startsWith("M")).map(word->word.toUpperCase()).collect(Collectors.toList());
//	System.out.println(output);
	
	long totalElement=cities.stream().filter(w->w.startsWith("M")).map(word->word.concat("Hello")).count();
	System.out.println(totalElement);
}
}
