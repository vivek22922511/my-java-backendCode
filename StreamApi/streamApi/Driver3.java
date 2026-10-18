package streamApi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Driver3 {
	public static void main(String args[]) {
		
		List<String>places=Arrays.asList("Ch","Hyd","Dl","Che","Ch","Hyd","Dl","Che");
		//List<String>output=places.stream().filter(p->p.startsWith("C")).map(m->m.toUpperCase()).distinct().collect(Collectors.toList());
		
		//List<String>output=places.stream().distinct().collect(Collectors.toList());
//		System.out.println(output);
		
		
		
		//if we want to print only....
		places.stream().distinct().forEach(e->System.out.println(e));	}

}
