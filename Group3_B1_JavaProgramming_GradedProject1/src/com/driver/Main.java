package com.driver;
import com.departments.*;

public class Main

{
	public static void main(String[] args) 
	{ 		
		AdminDepartment admin=new AdminDepartment();			
		
		System.out.println("Welcome to "+admin.departmentName());					
		System.out.println(admin.getTodaysWork()); 		
		System.out.println(admin.getWorkDeadline()); 		
		System.out.println(admin.isTodayAHoliday()); 		 		
		System.out.println();
		System.out.println();
		
		
		HrDepartment HumanResource=new HrDepartment();	
		
		System.out.println("Welcome to "+HumanResource.departmentName());	
		System.out.println(HumanResource.doActivity()); 		
		System.out.println(HumanResource.getTodaysWork()); 
		System.out.println(HumanResource.getWorkDeadline()); 		
		System.out.println(HumanResource.isTodayAHoliday()); 
		System.out.println();
		System.out.println();
		
		TechDepartment Technical=new TechDepartment();		
		
		System.out.println("Welcome to "+Technical.departmentName());		
		System.out.println(Technical.getTodaysWork()); 		
		System.out.println(Technical.getWorkDeadline()); 		
		System.out.println(Technical.getTechStackInformation()); 		
		System.out.println(Technical.isTodayAHoliday()); 	
	
	}

}
