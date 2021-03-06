package gradeCalculator;

import java.util.Scanner;

public class Student {
	
	private int id;
	private String name;
	private static double subject1grade;
	private static double subject2grade;
	private static double subject3grade;

	//Student Constructor
	public Student(int id, double subject1grade, double subject2grade, double subject3grade) {
		this.id = id;
		this.subject1grade = subject1grade;
		this.subject2grade = subject2grade;
		this.subject3grade = subject3grade;
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSubjectGrades() {
		return subject1grade + subject2grade + subject3grade;
	}
	
	public double highestGrade() {
		double[] students = null;
		double high = students[0];
		for(int i = 0; i < 50; i++) {
			if(students [i] > high)
				high = students[i];
		}
		return high;
	}
	
	public double averageGrade() {
		double totalAvg = (subject1grade + subject2grade + subject3grade) / 3;
		return totalAvg;
	}
	

	public static void main(String[] args) {
		int x = 0;
		int choice = -1;
		int id = 0;
		String name = null;
		
		Student[] students = new Student[50];
		Student st = new Student(id, subject1grade, subject2grade, subject3grade);
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Select from the following Chocies");
			System.out.println("Student Record Menu");
			System.out.println("1. Add Student");
			System.out.println("2. Set Grades for a Student");
			System.out.println("3. Get Report");
			System.out.println("4. Update Record");
			System.out.println("5. Delete Record");
			System.out.println("6. Compute the Grades");
			System.out.println("7. Exit");
			
			
			if(choice == 1) {
				if(x < 50) {
					System.out.println("ID");
					id = input.nextInt();
					
					System.out.println("Name");
					name = input.next();
					
					students[x] = st;
					x++;
				}
				else
				{
					System.out.println("Student cannot be added");
				}
			}
			
			else if (choice == 2) {
				System.out.println("Enter Student ID");
				id = input.nextInt();
				System.out.println("Set Student's Grades");
				double grade1 = input.nextDouble();
				double grade2 = input.nextDouble();
				double grade3 = input.nextDouble();
				
				for(int i = 0; i <x; i++) {
					subject1grade = grade1;
					subject2grade = grade2;
					subject3grade = grade3;
				}
			}
			
			else if (choice == 3) {
				for(int i = 0; i < x; i++) {
					st = students[i];
					System.out.println("Student's Name: " + st.getName());
					System.out.println("Student's Details: " + st.getId() + st.getSubjectGrades() + st.averageGrade() + st.highestGrade());
					
				}
			}
			
			else if (choice == 4) {
				System.out.println("Enter student's name to update it's record");
				String n = input.nextLine();
				for(int i = 0; i < x; i++) {
					if(n == st.getName()) {
						System.out.println("Enter the studetn's details");
						double newgrade1 = input.nextDouble();
						subject1grade = newgrade1;
						double newgrade2 = input.nextDouble();
						subject2grade = newgrade2;
						double newgrade3 = input.nextDouble();
						subject3grade = newgrade3;
						
						st = students[i];
					}
					else {
						System.out.println("The record does not exit");
					}
				}
			}
			
			else if (choice == 5) {
				System.out.println("Enter the student name which record you want to delete");
				String y = input.nextLine();
				for(int i = 0; i < x; i ++) {
					if (y == st.getName()) {
						System.out.println("Student's Details" + st.getId() + st.getSubjectGrades());
						st = students[i];
						st = null;
					}
					else {
						System.out.println("The records does not exist");
					}
				}
			}
			
			else if (choice == 6) {
				System.out.println("Enter the student's name to calculate it's grade");
				String z = input.nextLine();
				
				for(int i = 0; i <x; i++) {
					if(z == st.getName() ) {
						
						System.out.println("Student's details: " + st.getSubjectGrades());
						if(subject1grade > 90) 
							System.out.println("The grade is A");
						else if(subject1grade > 80 && subject1grade < 90)
							System.out.println("The grade is B");
						else if(subject1grade > 70 && subject1grade < 80)
							System.out.println("The grade is C");
						else if(subject1grade > 60 && subject1grade < 70)
							System.out.println("The grade is D");
						else if(subject1grade <60)
							System.out.println("The grade is F");
						else
							System.out.println("Enter a valid number");
						
						
						if(subject2grade > 90) 
							System.out.println("The grade is A");
						else if(subject2grade > 80 && subject2grade < 90)
							System.out.println("The grade is B");
						else if(subject2grade > 70 && subject2grade < 80)
							System.out.println("The grade is C");
						else if(subject2grade > 60 && subject2grade < 70)
							System.out.println("The grade is D");
						else if(subject2grade <60)
							System.out.println("The grade is F");
						else
							System.out.println("Enter a valid number");
						
						
						if(subject3grade > 90) 
							System.out.println("The grade is A");
						else if(subject3grade > 80 && subject3grade < 90)
							System.out.println("The grade is B");
						else if(subject3grade > 70 && subject3grade < 80)
							System.out.println("The grade is C");
						else if(subject3grade > 60 && subject3grade < 70)
							System.out.println("The grade is D");
						else if(subject3grade <60)
							System.out.println("The grade is F");
						else
							System.out.println("Enter a valid number");
						
					}
					
					else
						System.out.println("The record does not exist");
					
				}
				
				
			}
			
			else if (choice < 1 || choice > 7) {
				System.out.println("Invalid Choice");
			}
			
			
		}
		
		while (choice == 7);
		input.close();
		

	}

}
