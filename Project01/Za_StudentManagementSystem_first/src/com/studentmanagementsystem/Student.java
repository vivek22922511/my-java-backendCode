package com.studentmanagementsystem;

class Student {
	int id;
	int marks;
	String name;

	/**
	 * @param id
	 * @param marks
	 * @param name
	 */
	public Student(int id, int marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}

	String calculateGrade() {

		if (marks >= 90) {
			return "A";
		} else if (marks >= 75) {
			return "B";
		} else if (marks >= 50) {
			return "c";
		} else {
			return "Fail";
		}
	}

// Display student details
	void displayDetails() {
		System.out.println("---Student Details ---");
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("Grade: " + calculateGrade());
	}
}