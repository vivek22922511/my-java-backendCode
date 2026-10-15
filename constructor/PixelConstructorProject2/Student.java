package com.PixelConstructorProject2;

public class Student extends Person {

    private int id;

    Student(int _id, String _name, int _age) {
        super(_name, _age);
        this.id = _id;
    }
	
	
	
	
	
	//1............................
//	private String studentName;
//	private int age;
//	private String studentId;
//
//	public Student(String _studentName, int _age, String _studentId) {
//		this.studentName = _studentName;
//		this.age = _age;
//		this.studentId = _studentId;
//	}
//	
//	
//	Student(){
//		this("",0,"");
//	}
//	
//	Student(int _age){
//		
//		this("",02,"");
//	}
//	
//	Student(String _studentName,String _studentId){
//		this(_studentName,0,_studentId);
//	}
//	
	void displayStudent() {
		
		System.out.println("student name:->"+name);
		System.out.println("student age:->"+age);
		System.out.println("student Id:->"+id);
		
		
		
	
//		System.out.println("student name:->"+studentName);
//		System.out.println("student age:->"+age);
//		System.out.println("student Id:->"+studentId);
	}
	
	
}
