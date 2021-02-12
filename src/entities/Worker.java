package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.WorkerLevel.WorkerLevel;

public class Worker {
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("MM/yyyy");
	
	private Department department;
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	private double income = 0;
	public Date date;
	
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}

	public Worker(Department department, String name, WorkerLevel level, double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public WorkerLevel getLevel() {
		return level;
	}


	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public void addContract() {
				
	}
	
	
	public void removeContract() {
		
	}
	
	

	public void addContract(Date d0, double value, Integer hours) {

		contracts.add(new HourContract(d0, value, hours ));
		
	}
	
	
	Calendar cal = Calendar.getInstance();
	
	public void income(Date date) {
		double t =0;
		
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		
		for(int i=0; i<contracts.size() ; i++) {
			
			cal.setTime(contracts.get(i).getDate());
			
			int y = cal.get(Calendar.YEAR);
			int m = cal.get(Calendar.MONTH);
			
			if(y==year&&m==month) {
				
				t += contracts.get(i).totalValue();
			}
			
		}
		
	this.income += t;
		
	}
	
	@Override
	public String toString() {
		return "Name = " 
				+ name + "\n"
				+ "Department = " 
				+ department + "\n"
				+ "Income for " 
				+ sdf1.format(date) 
				+ ": " 
				+ (income+baseSalary);
	}
	
	
	
}
