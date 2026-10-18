package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;


public class Driver8 {

	public static void main(String[] args) {
		List<Integer>input=Arrays.asList(32,543,2,23,86,887,43,2345,67,898,987,98,65,43,32,456,87,87,44);
		
		//Map<Boolean,List<Integer>>output=input.stream().collect(Collectors.partitioningBy(n->n%2==0));
		
	
		
		int highest = input.stream().mapToInt(Integer::intValue) .max().orElseThrow();
              
               	
		System.out.println(highest);
	}

}
