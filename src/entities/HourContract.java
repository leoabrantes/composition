package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private double valuePerHour;
	private Integer hours;
	
	public double totalValue() {
		
		return valuePerHour*hours;
		
		
	}
	
	
	
}
