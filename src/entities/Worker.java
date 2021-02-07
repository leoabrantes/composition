package entities;

import java.util.ArrayList;
import java.util.List;

import entities.WorkerLevel.WorkerLevel;

public class Worker {

	private Department department;
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
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
	
	public double income() {
		
		return baseSalary;
	}
	
}
