package com.studentmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Student>students=new ArrayList<Student>();
		
		int choice;
		do {
			System.out.println("STUDENT MANAGEMENT SYSTEM..");
			System.out.println("          ⇊                ");
			System.out.println("          ⇊                ");
			System.out.println("1. Add Student");
			System.out.println("2. View all  Student");
			System.out.println("3. Search student by id ");
			System.out.println("4. Search Student by Name");
			System.out.println("5. Update Student Marks");
			System.out.println("6. Delete Student");
			System.out.println("7. Exit");
			System.out.println(" Enter your choice");
			
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter the sudent Id ");
				int id=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the student name ");
				String name=sc.nextLine();
				
				System.out.println("Enter the Studdent marks[0-100]");
				int marks=sc.nextInt();
				
				
				//check marks
				if(marks<0||marks>100) {
					System.out.println("Invalid marks !Enter the marks between 0 to 100");
				}else {
					Student s=new Student(id, marks, name);
					students.add(s);
					
					System.out.println("Student added successfully !!");
					
				}
				
				boolean idExists = false;

				for (Student s : students) {
				    if (s.id == id) {
				        idExists = true;
				        break;
				    }
				}

				if (idExists) {
				    System.out.println("Student ID already exists!");
				    break;
				}
				break;
				
	
			case 2:
				if(students.isEmpty()) {
					System.out.println("No student found..!");
				}else {
					for(Student s:students) {
						s.displayDetails();
					}
				}
				break;
				
			case 3:
                System.out.print("Enter Student id to search: ");
                int searchId = sc.nextInt();

                boolean found = false;

                for (Student s : students) {
                    if (s.id == searchId) {
                        s.displayDetails();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }
                break;
                
			case 4:
			    sc.nextLine(); // Consume leftover newline

			    System.out.print("Enter student name: ");
			    String searchName = sc.nextLine();

			    boolean nameFound = false;

			    for (Student s : students) {
			        if (s.name.equalsIgnoreCase(searchName)) {
			            s.displayDetails();
			            nameFound = true;
			        }
			    }

			    if (!nameFound) {
			        System.out.println("Student not found.");
			    }
			    break;
			    
			    

case 5:
    System.out.print("Enter Student ID: ");
    int updateId = sc.nextInt();

    boolean studentFound = false;

    for (Student s : students) {
        if (s.id == updateId) {

            System.out.print("Enter new marks (0-100): ");
            int newMarks = sc.nextInt();

            if (newMarks >= 0 && newMarks <= 100) {
                s.marks = newMarks;

                System.out.println("Marks updated successfully!");
                s.displayDetails();
            } else {
                System.out.println("Invalid marks!");
            }

            studentFound = true;
            break;
        }
    }

    if (!studentFound) {
        System.out.println("Student not found.");
    }
    break;
    

case 6:
    System.out.print("Enter Student ID to delete: ");
    int deleteId = sc.nextInt();

    boolean deleted = false;

    for (int i = 0; i < students.size(); i++) {
        if (students.get(i).id == deleteId) {

            students.remove(i);
            deleted = true;

            System.out.println("Student deleted successfully!");
            break;
        }
    }

    if (!deleted) {
        System.out.println("Student not found.");
    }
    break;



            case 7:
                System.out.println("Thank you for using the system!");
                break;

            default:
                System.out.println("Invalid choice . try again.");
        }

    } while (choice != 7);

    sc.close();
			}

private static int readInt(Scanner sc, String prompt) {

    while (true) {
        System.out.print(prompt);
        String input = sc.nextLine();

        try {
            return Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        }
      }
    }
 }


