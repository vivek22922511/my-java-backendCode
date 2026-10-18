package streamApi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Driver1 {

	public static void main(String[] args) {
	//Storing the data............	
	
		List<String> cities=Arrays.asList("Bangalore","Delhi","Mysore","Utter pradesh","Pune","Mumbai");
	
		//processing the data...... ( find.the name starting with 'M')
	
	//1. convert collection to stream object..
	
     Stream<String>inputStream=cities.stream();

     //2.find the name  starting with 'M'--->use filter
     
     Stream<String>filteredStream=inputStream.filter(city->city.startsWith("M"));
	
     //3.collect or print the city
     List<String>cityStartWithM=filteredStream.collect(Collectors.toList());
     
     System.out.println(cityStartWithM);
     
     
     
     //we can reduce the line of our source code....with stream
//			     List<String>cityStartWithM1=cities.stream().filter(w->w.startsWith("M")).collect(Collectors.toList());
//			     System.out.println(cityStartWithM1);
	}

}
