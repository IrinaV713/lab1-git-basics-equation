package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonInteractive {
    public void nonInteractive(){
        String data = "";
        System.out.println("Enter the name and path of your file: ");
        Scanner scan = new Scanner(System.in);
        String fpath = scan.nextLine();

        //checking file existence and content; reading data from file
        try {
            FileReader file = new FileReader(fpath);
            BufferedReader buffer = new BufferedReader(file);
            String line = buffer.readLine();
            Pattern pattern = Pattern.compile("^(-)?\\d+(\\.\\d+)? (-)?\\d+(\\.\\d+)? (-)?\\d+(\\.\\d+)?$");
            Matcher matcher = pattern.matcher(line);
            if(matcher.find()){
                data += line;
            }
            else{
                System.out.println("Error. Invalid file content");
                System.exit(1);
            }
        }
        catch (IOException e) {
            System.out.println("Error. IO exception occurred. File may not exist or path/name is invalid");
            System.exit(1);
        }

        //output the whole equation
        String[] strc = data.split(" ");
        double a = Double.parseDouble(strc[0]);
        double b = Double.parseDouble(strc[1]);
        double c = Double.parseDouble(strc[2]);
        System.out.print("Equation is: ");
        System.out.println("(" + a + ") " + "x^2 " + "+ " + "(" + b + ") " + "x " + "+ " + "(" + c + ") " + "= " + "0");

        //calculating roots
        Interactive.getRoots(a, b, c);
    }
}
