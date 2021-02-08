package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.WorkerLevel.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String dpt = sc.nextLine();
				
		Department department = new Department(dpt);
		
		
		System.out.println("Enter worker data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
				
		System.out.print("Level: ");
		String teste = sc.nextLine();
		WorkerLevel level = WorkerLevel.valueOf(teste);
		
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		System.out.println("");
		
		Worker newworker = new Worker(department, name, level, baseSalary);
		
		System.out.print("How many contracts to this worker? ");
		int num = sc.nextInt();
		System.out.println("");
		sc.nextLine();
		
		for(int i=0; i<num; i++) {
			
			System.out.printf("Enter contract #%d data: %n", (i+1));
			System.out.print("Date (DD/MM/YYYY): ");
			String d0 = sc.nextLine();
			Date d1= new Date(d0);
			
			System.out.print("Value per hour:  ");
			double v = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int dr = sc.nextInt();
			System.out.println("");
			sc.nextLine();
			
			
		}
		
		
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		System.out.println(" ");
		

	}

}
