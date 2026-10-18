package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver7 {

	public static void main(String[] args) {
		List<String>cities=Arrays.asList("Chandigarh","Hyderabad","Delhi","Chennai","Chennai","Jaipur","Noida","Gurugram");
		//count() vs collector.counting()
		
		long total=cities.stream().collect(Collectors.counting());
		System.out.println(total);
		
		Map<Object,List<String>>result=cities.stream().collect(Collectors.groupingBy(c ->c.length()));
		
		System.out.println(result);
	}

}
