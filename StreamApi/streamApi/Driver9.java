package streamApi;

import java.util.stream.Collectors;
import java.util.Map;

public class Driver9 {

	public static void main(String[] args) {
		String input="swiss";
		Map<Character,Long>output=input.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c-> c,Collectors.counting()));	
		System.out.print(output);
	}

}
