package com.shallowCloningPractice;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
		Lectures lectures=new Lectures("Core java", "Spring framwork","kafka");
		
		Teacher teacher=new Teacher("Suresh Bishnoi", "8954907864", lectures);
		
		Teacher clonedteacher=(Teacher) teacher.clone();
		
		teacher.lectures.sub01="Python";
		
		System.out.println(teacher.lectures.sub01);
		
		System.out.println(clonedteacher.lectures.sub01);
		

		
	}

}
