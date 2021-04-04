package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowStatements {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int operation;
        do {
            System.out.println("\n---------------------------------------------");
            System.out.println("1. if statement");
            System.out.println("2. if-else statement");
            System.out.println("3. if-else-if statement");
            System.out.println("4. if-else statement with range specification");
            System.out.println("5. Print class grades");
            System.out.println("6. switch statement");
            System.out.println("7. Exit");
            System.out.println("Please select one of the operation to perform : ");
            operation = input.nextInt();
            switch (operation) {
                case 1:
                    ifStatementExample();
                    break;
                case 2:
                    ifElseStatementExample();
                    break;
                case 3:
                    ifElseIfStatementExample();
                    break;
                case 4:
                    ifElseWithSpecificRange();
                    break;
                case 5:
                    printClassGrades();
                    break;
                case 6:
                    switchStatementExample();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("ERROR : Please select valid operation");
            }
        } while (operation != 7);
    }

    /*Write a program that declares 1 integer variable x, and then assigns 7 to it.
    Write an if statement to print out “Less than 10” if x is less than 10.
    Change x to equal 15 and notice the result (console should not display anything).*/
    private static void ifStatementExample() {

        int x = 7;
        System.out.println("value of x is 7");
        if (x < 10)
            System.out.println("Less than 10");
        x = 15;
        System.out.println("Value of x changed to 15.");
        if (x < 10)
            System.out.println("Less than 10");
    }

    /*Write a program that declares 1 integer variable x, and then assigns 7 to it.
    Write an if-else statement that prints out “Less than 10” if x is less than 10
    and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.*/
    private static void ifElseStatementExample() {

        int x = 7;
        System.out.println("\nValue of x is 7");
        if (x < 10)
            System.out.println("Less than 10");
        else
            System.out.println("Greater than 10");
        x = 15;
        System.out.println("Value of x is changed to 15");
        if (x < 10)
            System.out.println("Less than 10");
        else
            System.out.println("Greater than 10");

    }

    /*Write a program that declares 1 integer variable x, and then assigns 15 to it.
    Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10,
    “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or
    equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.*/
    private static void ifElseIfStatementExample() {

        int x = 15;
        System.out.println("Value of x is " + x);
        if (x < 10)
            System.out.println("Less than 10");
        else if (x > 10 && x < 20)
            System.out.println("Between 10 and 20");
        else
            System.out.println("Greater than or equal to 20");
        x = 50;
        System.out.println("Value of x is changed to " + x);
        if (x < 10)
            System.out.println("Less than 10");
        else if (x > 10 && x < 20)
            System.out.println("Between 10 and 20");
        else
            System.out.println("Greater than or equal to 20");
    }

    /*Write a program that declares 1 integer variable x, and then assigns 15 to it.
    Write an if-else statement that prints “Out of range” if the number is less than 1
    or greater than 20 and prints “In range” if between 10 and 20 (including equal to 10 or 20).
    Change x to 5 and notice the result.*/
    private static void ifElseWithSpecificRange() {

        int x = 15;
        System.out.println("Value of x is " + x);
        if (x < 10 || x > 20)
            System.out.println("Out of range");
        else
            System.out.println("In range");
        x = 5;
        System.out.println("Value of x is changed to " + x);
        if (x < 10 || x > 20)
            System.out.println("Out of range");
        else
            System.out.println("In range");
    }

    /*Write a program that uses if-else-if statements to print out grades A, B, C, D, F according
    to the following criteria:
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: <60
    Use the Scanner class to accept a number score from the user to determine the letter grade.
    Print out “Score out of range.” if the score is less than 0 or greater than 100.*/
    private static void printClassGrades() {

        Scanner input = new Scanner(System.in);
        String more = "Y";
        while (more.equalsIgnoreCase("Y")) {
            System.out.print("Please enter your score(number in range of 0 to 100) : ");
            int score = input.nextInt();
            if (score > 100 || score < 0)
                System.out.println("Score out of range.");
            else if (score <= 100 && score >= 90)
                System.out.println("Grade : A");
            else if (score <= 89 && score >= 80)
                System.out.println("Grade : B");
            else if (score <= 79 && score >= 70)
                System.out.println("Grade : C");
            else if (score <= 69 && score >= 60)
                System.out.println("Grade : D");
            else
                System.out.println("Grade : F");
            System.out.println("\nDo you want to check another score(Y/N) : ");
            more = input.next();
        }
    }

    /*Write a program that accepts an integer between 1 and 7 from the user.
    Use a switch statement to print out the corresponding weekday.
    Print “Out of range” if the number is less than 1 or greater than 7.
    Don’t forget to include “break” statements in each of your cases.*/
    private static void switchStatementExample() {

        Scanner input = new Scanner(System.in);
        String more = "Y";
        while (more.equalsIgnoreCase("Y")) {
            System.out.println("Please enter a number between 1 and 7 : ");
            int weekDay = input.nextInt();
            switch (weekDay) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Out Of Range");
            }
            System.out.println("\nDo you want to try again(Y/N) : ");
            more = input.next();
        }
    }
}
