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
		double[] student = null;
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
			
			else if (choice == 3)
			
		}
		

	}

}
