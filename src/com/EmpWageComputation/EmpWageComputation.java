package com.EmpWageComputation;

public class EmpWageComputation {
	public static final int EMP_RATE_PER_HOUR = 20;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HRS = 100;
    
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation ");
		EmpWageComputation  company1 =new EmpWageComputation( );
        EmployeeWageComp("Dmart",20,20,100);
        EmpWageComputation  company2 =new EmpWageComputation( );
        EmployeeWageComp("Kmart",22,20,70);
        EmpWageComputation  company3=new EmpWageComputation( );
        EmployeeWageComp("Bridgelabz",15,2,20);
    }

    public static int EmployeeWageComp(String company, int empRatePerHr, int numWorkingDays, int maxHrs) {
        int empHrs = 0, totalEmpHrs = 8, totalWorkingDays = 0;
        while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS) {
            totalWorkingDays++;
            int empcheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empcheck) {
                case 2:
                    System.out.println("Employee is Part time ");
                    empHrs = 4;
                    break;
                case 1:
                    System.out.println("Employee is Full time ");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
        }
            int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
            System.out.println(company + " company Total Daily Wage for days " + totalWorkingDays + " and hours " + totalEmpHrs + " is: " + totalEmpWage);

            return totalEmpWage;
        
    }
}