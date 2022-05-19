package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Select an application mode.");
        while(true){
            System.out.print("Type 0 for interactive mode; type 1 for file mode:");
            Scanner main_scan = new Scanner(System.in);
            String mode = main_scan.nextLine();
            if(Objects.equals(mode, "0")){
                //Interactive obj1 = new Interactive();
                //obj1.interactive();
                break;
            }
            else if(Objects.equals(mode, "1")){
                //NonInteractive obj2 = new NonInteractive();
                //obj2.nonInteractive();
                break;
            }
            else System.out.println("Error. Expected 0 or 1");
        }
    }
}
