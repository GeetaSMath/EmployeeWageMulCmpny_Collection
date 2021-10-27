package com.bridgelabz;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
class EmployeeWageRefactorCollection {

         public String company;
         public int wagePerHr;
         public int maxMonthHr;
         public int workingDays;
         public int fullTimeHr;
         public int partTimeHr;
         public int totalEmpWage;

         public EmployeeWageRefactorCollection(String company, int wagePerHr, int maxMonthHr, int workingDays, int fullTimeHr, int partTimeHr) {
             this.company = company;
             this.wagePerHr = wagePerHr;
             this.maxMonthHr = maxMonthHr;
             this.workingDays = workingDays;
             this.fullTimeHr = fullTimeHr;
             this.partTimeHr = partTimeHr;
         }

         public void setTotalEmpWage(int totalEmpWage) {
             this.totalEmpWage = totalEmpWage;

         }


    @Override
    public String toString() {
        return "EmployeeWageRefactorCollection{" +
                "company='" + company + '\'' +
                ", wagePerHr=" + wagePerHr +
                ", maxMonthHr=" + maxMonthHr +
                ", workingDays=" + workingDays +
                ", fullTimeHr=" + fullTimeHr +
                ", partTimeHr=" + partTimeHr +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }
}

