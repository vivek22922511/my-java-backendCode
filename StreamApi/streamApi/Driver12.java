package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver12 {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("Chandigarh","Hyderabad","Delhi","Chennai","Chennai","Jaipur","Noida","Gurugram");
		//count() vs collector.counting()
		
		List<String>out=list.stream().filter(l ->l.startsWith("D")).collect(Collectors.toList());
		
		System.out.println(out);
		List<String>out1=list.parallelStream().filter(l ->l.startsWith("D")).collect(Collectors.toList());
		System.out.println(out1);
	}

}
