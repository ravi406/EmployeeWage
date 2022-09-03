package com.dialy.assignments;

public class EmployeeWageUc3 {
    public static void main(String[] Args) {

        // constant variables
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;

        // local variables
        int empWages = 0;
        int empWorkingHours = 0;

        // genearting Random number
        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == IS_FULL_TIME)
            empWorkingHours = 8;
        else if(empCheck == IS_PART_TIME)
            empWorkingHours = 4;
        empWages = empWorkingHours * EMP_RATE_PER_HOUR;
        System.out.println("Employee wages= " +empWages);
    }
}
