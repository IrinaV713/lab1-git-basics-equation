package com.company;
import java.util.Scanner;

public class Interactive {
    public void interactive() {
        double a, b, c;

        // getting and checking values for coefficients a, b, c
        while (true) {
            System.out.print("a = ");
            Scanner scan = new Scanner(System.in);
            try {
                a = scan.nextDouble();
                if (a == 0) System.out.println("For a quadratic, a must not be zero");
                else break;
            } catch (Exception e) {
                System.out.println("Error. Expected a valid real number, got something else instead");
            }
        }
        while (true) {
            System.out.print("b = ");
            Scanner scan = new Scanner(System.in);
            try {
                b = scan.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Error. Expected a valid real number, got something else instead");
            }
        }
        while (true) {
            System.out.print("c = ");
            Scanner scan = new Scanner(System.in);
            try {
                c = scan.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Error. Expected a valid real number, got something else instead");
            }
        }

        // output the whole equation
        System.out.print("Equation is: ");
        System.out.println("(" + a + ") " + "x^2 " + "+ " + "(" + b + ") " + "x " + "+ " + "(" + c + ") " + "= " + "0");

        //calculating roots
        getRoots(a, b, c);
    }

    public static void getRoots(double a, double b, double c){
        double D = Math.sqrt(b*b - 4*a*c);
        if(Double.isNaN(D)) System.out.println("There are 0 roots");
        else if(D == 0){
            System.out.println("There are 1 root");
            double x1 = -b/(2*a);
            System.out.println("x1 = " + x1);
        }
        else{
            System.out.println("There are 2 roots");
            double x1 = (-b + D)/(2*a);
            double x2 = (-b - D)/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
