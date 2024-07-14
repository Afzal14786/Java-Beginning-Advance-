package Java_Lang_Package.Project;
import java.util.Scanner;

class Math_Class {
    // return addition //
    int addition(int x, int y) {
        return x + y;
    }

    // return a +ve number or absolute value //
    int pos_integer(int x) {
        return Math.abs(x);
    }

    // variable arguments //
    int var_argument_addition(int... x) {
        int sum = 0;
        for (int num : x) {
            sum += num;
        }
        return sum;
    }

    // multiple multiple numbers //
    long multiple(int... x) {
        long ans = 1;
        for (int mul : x) {
            ans *= mul;
        }
        return ans;
    }

    // find cuberoot of a number //
    double cube_root(int x) {
        return Math.cbrt(x);
    }

    // find square root of a number //
    double square_root(int x) {
        return Math.sqrt(x);
    }

    // find square of a number //
    int square_number(int x) {
        return (int) Math.pow(x, 2);
    }

    int cube_number(int x) {
        return (int) Math.pow(x, 3);
    }

    // divide 2 numbers //
    double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) x / y;
    }

    // find simple interest //
    double simple_interest(double principal_amount, double rate, double time) {
        return principal_amount * rate * time;
    }
}

public class Project_Math_Class {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("\tLet's Calculate Some Basic Things");
        System.out.println("----------------------------------------------");
        Math_Class cal = new Math_Class();
        boolean flag = false;

        while (!flag) {
            System.out.println("1) Add Two Numbers");
            System.out.println("2) Add N Numbers");
            System.out.println("3) Absolute Number");
            System.out.println("4) Multiply N Numbers");
            System.out.println("5) Cube Root Of A Number");
            System.out.println("6) Square Root Of A Number");
            System.out.println("7) Square Of A Number");
            System.out.println("8) Cube Of A Number");
            System.out.println("9) Calculate Simple Interest");
            System.out.println("10) Exit");

            System.out.print("\n\n\t---------------------------------------\n");
            System.out.print("\t\tEnter Your Choice: ");
            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter 1st Number: ");
                    int firstNum = scn.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    int secondNum = scn.nextInt();
                    System.out.println("The Sum Is: " + cal.addition(firstNum, secondNum));
                    break;

                case 2:
                    System.out.print("Enter the number of values to add: ");
                    int n = scn.nextInt();
                    int[] addNumbers = new int[n];
                    System.out.println("Enter the numbers:");
                    for (int i = 0; i < n; i++) {
                        addNumbers[i] = scn.nextInt();
                    }
                    System.out.println("The Total Sum is: " + cal.var_argument_addition(addNumbers));
                    break;

                case 3:
                    System.out.print("Get Absolute Number Of A -ve Number: ");
                    int absNum = scn.nextInt();
                    System.out.println("Absolute Number is: " + cal.pos_integer(absNum));
                    break;

                case 4:
                    System.out.print("Enter the number of values to multiply: ");
                    int m = scn.nextInt();
                    int[] mulNumbers = new int[m];
                    System.out.println("Enter the numbers:");
                    for (int i = 0; i < m; i++) {
                        mulNumbers[i] = scn.nextInt();
                    }
                    System.out.println("The Result Is: " + cal.multiple(mulNumbers));
                    break;

                case 5:
                    System.out.print("Cube Root Of A Number: ");
                    int cubeRootNum = scn.nextInt();
                    System.out.println("Cube Root is: " + cal.cube_root(cubeRootNum));
                    break;

                case 6:
                    System.out.print("Square Root Of A Number: ");
                    int squareRootNum = scn.nextInt();
                    System.out.println("Square Root Is: " + cal.square_root(squareRootNum));
                    break;

                case 7:
                    System.out.print("Enter A Number: ");
                    int squareNum = scn.nextInt();
                    System.out.println("The Square Number is: " + cal.square_number(squareNum));
                    break;

                case 8:
                    System.out.print("Enter A Number: ");
                    int cubeNum = scn.nextInt();
                    System.out.println("The Cube Number Is: " + cal.cube_number(cubeNum));
                    break;

                case 9:
                    System.out.print("Enter The Principal Amount: ");
                    double amount = scn.nextDouble();
                    System.out.print("Enter Interest Rate: ");
                    double rate = scn.nextDouble();
                    System.out.print("Enter Time: ");
                    double time = scn.nextDouble();
                    System.out.println("The Simple Interest Is: " + cal.simple_interest(amount, rate, time));
                    break;

                case 10:
                    flag = true;
                    System.out.println("-----Thank You-----");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scn.close();
    }
}
