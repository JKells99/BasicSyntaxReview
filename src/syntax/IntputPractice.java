package syntax;

import java.util.Scanner;

public class IntputPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter Your Name?: ");
//
//        String name =  scanner.next();
//
//        System.out.println("Hello " + name + " Welcome! ");

        System.out.println("Enter Number 1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter Number 2: ");
        int num2 = scanner.nextInt();
        double sum = num1 + num2;
        System.out.println("They Equal " + sum);




}

}
