package streamApi;

import java.util.stream.Collectors;
import java.util.Map;

public class Driver10{

	public static void main(String[] args) {
		String input="sisinun";
		Character output=input.chars().mapToObj(c ->(char) c).filter(ch ->input.indexOf(ch) == input.lastIndexOf(ch)).findFirst().get();		
		System.out.println(output);
	}

}
