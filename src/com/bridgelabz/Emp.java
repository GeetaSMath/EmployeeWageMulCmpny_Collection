package com.bridgelabz;

import java.util.Scanner;

class Emp {
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    public int numOfCmpny=0;
    public EmployeeWageRefactorCollection[] compnyWageArray;

    public Emp(int a){
        compnyWageArray = new EmployeeWageRefactorCollection[a];
    }


    public void addCompanyEmpWage(String company, int wagePerHr, int maxMonthHr, int workingDays, int fullTimeHr, int partTimeHr) {
        compnyWageArray[numOfCmpny] = new EmployeeWageRefactorCollection(company,wagePerHr,maxMonthHr,workingDays,fullTimeHr,partTimeHr);
        numOfCmpny++;
    }

    public void computeEmpWage(){
        for (int i=0; i<numOfCmpny; i++){
            compnyWageArray[i].setTotalEmpWage(computeEmpWage(compnyWageArray[i].company,compnyWageArray[i].wagePerHr,compnyWageArray[i].maxMonthHr,compnyWageArray[i].workingDays,compnyWageArray[i].fullTimeHr,compnyWageArray[i].partTimeHr));
            System.out.println(compnyWageArray[i]);
        }
    }

    public static int computeEmpWage(String company, int wagePerHr, int maxMonthHr, int workingDays, int fullTimeHr, int partTimeHr){
        int empHr = 0;
        int totalEmpHr = 0;
        int days = 0;

        while (empHr <= maxMonthHr && days <= workingDays) {

            double empCheck = Math.floor(Math.random() * 10) % 3;
            int empCheck1 = (int) empCheck;

            switch (empCheck1) {
                case IS_FULL_TIME:
                    empHr = fullTimeHr;
                    break;
                case IS_PART_TIME:
                    empHr = partTimeHr;
                    break;
                default:
                    empHr = 0;
            }
            totalEmpHr = totalEmpHr + empHr;
            days++;
        }
        int totalWage = totalEmpHr * wagePerHr;
        return totalWage;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Company U Want");
        int cmpnysCount = sc.nextInt();
        Emp obj = new Emp(cmpnysCount);
        for (int i = 0; i < cmpnysCount; i++) {
            System.out.println("Enter Details for Company: "+ (i+1));
            System.out.println("===================================");
            System.out.println("Cmpny Name: " );
            String cmpnyName = sc.next();
            System.out.println("Cmpny Wage Per Hour");
            int wagePerHr = sc.nextInt();
            System.out.println("Cmpny Max Month Hour");
            int maxMonthHr = sc.nextInt();
            System.out.println("Cmpny Month Work Days");
            int workDays = sc.nextInt();
            System.out.println("Cmpny Full Time Hour");
            int fullTimeHr = sc.nextInt();
            System.out.println("Cmpny Part Time Hour ");
            int partTimeHr = sc.nextInt();

            obj.addCompanyEmpWage(cmpnyName,wagePerHr,maxMonthHr,workDays,fullTimeHr,partTimeHr);
        }
        for (int i=0; i<cmpnysCount; i++){
            System.out.println(obj.compnyWageArray[i]);
        }
    }

}