package ex09_Switch;

import com.sun.source.tree.CaseTree;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day 1 to 7");
        int iday = scanner.nextInt();

        switch (iday){

            case 1:
                System.out.println("You have entered number" + iday + "its monday");
                break;
            case 2:
                System.out.println("You have entered number" + iday + "its tuesday");
                break;
            case 3:
                System.out.println("You have entered number" + iday + "its wednesday");
                break;
            case 4:
                System.out.println("You have entered number" + iday + "its thrusday");
                break;
            case 5:
                System.out.println("You have entered number" + iday + "its friday");
                break;
            case 6:
                System.out.println("You have entered number" + iday + "its saturday");
                break;
            case 7:
                System.out.println("You have entered number" + iday + "its sunday");
                break;

            default:
                System.out.println("invalid");
                break;
        }




    }
}
