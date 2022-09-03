package com.dialy.assignments;

public class EmployeeWageUc5 {
    //Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;


    public static void main(String[] args) {


        //Variables
        int empWorkingHours = 0;
        int empWages = 0;
        int totalEmpWage = 0;

        //Computation
        for (int day = 0; day < NUMBER_OF_WORKING_DAYS; day++) {

            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    empWorkingHours = 8;
                    break;

                case IS_PART_TIME:
                    empWorkingHours = 4;
                    break;

                default:
                    empWorkingHours = 0;
            }
        }
        empWages = empWorkingHours * EMP_RATE_PER_HOUR;
        totalEmpWage += empWages;
        System.out.println("EmpWage " + empWages);
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}
