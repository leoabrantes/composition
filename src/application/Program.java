package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;


import entities.Department;
import entities.Worker;
import entities.WorkerLevel.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");

		
		
		
		
// -----------------------------------------------------------------------		
		
//	Dados do Trabalhador
		
		System.out.print("Enter department's name: ");
		
		Department department = new Department(sc.nextLine());
		
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
		
		
		
// -----------------------------------------------------------------------		
		
//	Contratos
		
		
		System.out.print("How many contracts to this worker? ");
		int num = sc.nextInt();
		System.out.println("");
		sc.nextLine();
		
		for(int i=0; i<num; i++) {
			
			System.out.printf("Enter contract #%d data: %n", (i+1));
			System.out.print("Date (DD/MM/YYYY): ");
			String d0 = sc.nextLine();
			Date d1 = sdf1.parse(d0);
			
			System.out.print("Value per hour:  ");
			double valor = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			System.out.println("");
			sc.nextLine();
			
			newworker.addContract(d1, valor, hours);
			
		}
		
		
// -----------------------------------------------------------------------		
		
//	Calculo de Valor
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String s = sc.nextLine();
		
		Date d = sdf2.parse(s);
		
		newworker.income(d);
		
		newworker.date = d;
		
		System.out.println(" ");
		System.out.println(newworker);
		

	}

}
