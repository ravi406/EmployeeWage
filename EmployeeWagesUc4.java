package com.dialy.assignments;

public class EmployeeWagesUc4 {
    // constant variables
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        // local variables
        int empWages = 0;
        int empWorkingHours = 0;

        // genearting Random number
        double empCheck = Math.floor(Math.random() * 10) % 3;

        switch ((int)empCheck) {
            case IS_FULL_TIME:
                empWorkingHours = 8;
                break;

            case IS_PART_TIME:
                empWorkingHours = 4;
                break;

            default:
                empWorkingHours = 0;
        }
        empWages = empWorkingHours * EMP_RATE_PER_HOUR;
        System.out.println("Employee wages= " +empWages);
    }
}
