package com.dialy.assignments;

public class EmployeeWageUc2 {
    public static void main(String[] Args) {
        //Constants variables
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;

        // Local variables
        int empWage = 0;
        int empWorkingHours = 0;

        // Generating random numbers.
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME) {
            empWorkingHours= 8;
        }
        else{
            empWorkingHours = 0;
        }
        empWage = empWorkingHours * EMP_RATE_PER_HOUR;
        System.out.println("Employee wages= " +empWage);
    }

}
