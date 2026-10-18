package streamApiPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.*;

public class Driver {

	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		//System.out.println(list);
		
		//1................ for print the list..
		//list.stream().forEach(System.out::println);
		
		
		//2..............for filter the list...
		
		//list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		//3............this is the second way to print the list...
		
		//list.stream().forEach(System.out::println);
		
		//4...............this is for filter the list...
		// list.stream().filter(n-> n >11 && n<15).forEach(System.out::println);

	
		
		
		
		
		//***
		//..................it will map the list value..
		//list.stream().map(n->n*10).forEach(System.out::println);
		
		//list.stream().map(n->n*n).forEach(System.out::println);
		
		
		//>>>>>>>>for sorting the list in ascending order...
		//list.stream().sorted().forEach(n->System.out.println(n));
		
		//>>>>>>>>>>for descending order
		
		//list.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
		
		//>>>>>>>>>>>>for removing the duplicate element from list..
		
		//list.stream().distinct().forEach(n->System.out.println(n));
		
		//>>>>>>>>>>>>it will print only limit 3
		//list.stream().limit(3).forEach(n->System.out.println(n));
		
		
		
		
		
		
		
	//flatMap() —>>>> flatten nested data
		
		//map()->>> can produce a stream of lists.
       //flatMap()->>> combines the nested streams into one stream.
	
		
/*	
 * 
 * 	
			List<List<Integer>>list= Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));

			list.stream().forEach(n->System.out.println(n));
			output:-  [1, 2]
          			[3, 4]
          
          
           
			list.stream().flatMap(List::stream).forEach(n->System.out.println(n));
			//output:-1 2 3 4

*/
		
		
		


       //...........skip(3)three result skip..


	//list.stream().sorted().skip(2).forEach(n->System.out.println(n));
		
	
		
		//peek() not a proper terminal operation..
		//it perform the action pass the element through pipeline..
		
	//	list.stream().filter(n->n>10).peek(System.out::println).count();
		
		
		//.....takeWhile()...........
		
		//like list=10,12,14,11,13,14
		
		  //list.stream().takeWhile(n->n%2==0).forEach(n->System.out.println(n));
		
		//output:->>>10 12 14
		
		
		
		//.....dropWhile()...........
		
		//input:-10 11 12 13 14 15
		
		//list.stream().dropWhile(n->n<13).forEach(System.out::println);
		
		//output:-13 14 15
		
		
		//input:->>10 1112 13 14 15
		
		
		//.........count....
		
//		long count=list.stream().filter(n->n>10).count();
//		System.out.println(count);//output:->>5
		
//		..................min.....
//		int min=list.stream().min(Integer::compareTo).orElseThrow();
//		System.out.println(min);
		
		
		//................max....
		
//		int max=list.stream().max(Integer::compareTo).orElseThrow();
//		
//		System.out.println(max);
		
		
		
		
		  //...........collect into a list.....

		
		//		List<Integer>result=list.stream().filter(n->n>10).collect(Collectors.toList());
       //		System.out.println(result);
		

		
//		List<Integer>result=list.stream().filter(n->n>10).toList();
//		System.out.println(result);
		
		
		
		//collect into a set.....
		
//		Set<Integer>result=list.stream().collect(Collectors.toSet());
//		
//		System.out.println(result);
		
		
		
		//joining........
		//groupingBy.......
		
		
		
		
		
		
		//reduce().......combine element into one result......
		
//		int sum=list.stream().reduce(0,(a,b)->a+b);
//		
//		System.out.println(sum);
		
		
		
	}
	
}


