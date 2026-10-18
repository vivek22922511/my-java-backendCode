package streamApi;

import java.util.stream.Collectors;
import java.util.List;

public class Driver11{

	public static void main(String[] args) {
		String input="swiss";
		List<Character>output=input.chars().mapToObj(c->(char) c).collect(Collectors.toList());	
		
		System.out.println(output);
		
	}

}
