package com.oops.encapsulationPractice;

//Getters and setters are a common way to implement encapsulation,
		// but encapsulation is really about controlled
		//access to an object's internal state.
		

//For example, this class is also encapsulated:
public class Importent {

		private int count;
		
		
//It provides no setter. 
//Instead, users can increase the count only through increment().		
		
		public void increment() {
			count++;
		}
		public int getCount() {
			return count;
		}
		
		
		
}


