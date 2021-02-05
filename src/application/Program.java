package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Worker;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter department's name: ");
		Department department = new 
				
				sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
				
		System.out.println("Level: ");
		String level = sc.nextLine();
		
		
		System.out.println("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(department, name, level, baseSalary);
		
		System.out.println("How many contracts to this worker? ");
		System.out.println("Enter contract #1 data: ");
		System.out.println("Date (DD/MM/YYYY): ");
		System.out.println("Value per hour:  ");
		System.out.println("Duration (hours): ");
		System.out.println("Enter contract #2 data: ");
		System.out.println("Date (DD/MM/YYYY): ");
		System.out.println("Value per hour: ");
		System.out.println("Duration (hours): ");
		System.out.println("Enter contract #3 data: ");
		System.out.println("Date (DD/MM/YYYY): ");
		System.out.println("Value per hour: ");
		System.out.println("Duration (hours): ");
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		System.out.println(" ");
		

	}

}
