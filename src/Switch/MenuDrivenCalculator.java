package Switch;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String args[]){

        System.out.println("1. Add");
        System.out.println("2. SUB");
        System.out.println("3. MUL");
        System.out.println("4. DIV");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the choice AS number :");
        int choice = sc.nextInt();

        System.out.println("Enter 1st number :");
        int Number1 = sc.nextInt();

        System.out.println("Enter 2nd Number");
        int Number2 = sc. nextInt();

        switch(choice){
            case 1:
                System.out.println("Add :" + (Number1 + Number2));
                break;
            case 2:
                System.out.println("Add :" + (Number1 - Number2));
                break;
            case 3:
                System.out.println("Add :" + (Number1 * Number2));
                break;
            case 4:
                System.out.println("Add :" + (Number1 * Number2));
                break;
            default:
                System.out.println("invalid one");
        }


    }
}
