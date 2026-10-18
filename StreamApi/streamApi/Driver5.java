package streamApi;

import java.util.Arrays;
import java.util.List;

public class Driver5 {

	public static void main(String[] args) {
		List<String>city=Arrays.asList("Ch","Hyd","Dl","Che","Ch","Hyd","Dl","Che");
		city.stream().filter(c->c.startsWith("C")).limit(2).forEach(e->System.out.println(e));
	}

}
