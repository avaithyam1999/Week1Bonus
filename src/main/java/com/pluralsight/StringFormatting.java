package com.pluralsight;

public class StringFormatting {
    public static void main(String[] args) {
        String firstName = "Sarah";
        String lastName = "Johnson";
        int age = 28;
        double annualSalary = 67543.789;


        String formalIntro = String.format("Formal Introduction: Ms. %s %s, age %d",firstName,lastName,age);
        String briefSummary = String.format("%s %s is %d years old and works in our company.", firstName, lastName, age);
        String finOverview = String.format("Annual Salary of $%.2f (rounded: $%.2f)", annualSalary, (double)Math.round(annualSalary));
        String customMessage = String.format("Hello! My name is %s %s.\nI am %d years old and my current salary is %d", firstName, lastName, age, Math.round(annualSalary));


        System.out.printf("""
                %s\n
                %s\n
                %s\n
                %s\n
                === Salary Formatting Examples ===
                Original: %f
                Rounded to dollar: %d
                Rounded to thousand: %d
                Two decimal places: %.2f
                """,formalIntro,briefSummary,finOverview,customMessage,annualSalary, Math.round(annualSalary),Math.round(annualSalary/1000)*1000,annualSalary);
    }
}
