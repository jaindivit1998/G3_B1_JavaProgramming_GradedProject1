package com.departments;

import com.Interface.*;
public class SuperDepartment implements IDepartment{

	
	public String departmentName()
	{
	
		return"Super Department";	
	}
	

	public String getTodaysWork() 	
	{ 		
		return "No Work as of now"; 
	} 	
	
	public String getWorkDeadline() 	
	{ 
	
		return "Nil";
	} 	

	public String isTodayAHoliday() 	
	{ 
		return "Today is not a Holiday";
	} 

	
}
