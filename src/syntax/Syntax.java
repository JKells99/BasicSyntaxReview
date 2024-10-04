package syntax;

import java.util.Arrays;

public class Syntax {

    public static void main(String[] args) {
        // Primitives

        int myNumber = 8;

        double myDouble = 3.14;

        float myFloat = 3.14f;

        char myChar = 'A';

        boolean myBoolean = true;

        // Non Prims

        String myString = "Hello World";

       int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        String[] myIntArray2 = {"Hello","Hello"};

        //System.out.println(Arrays.toString(myIntArray));
        // Error Printing
//        System.err.println("Hello");

        // Single Line
         //*
        //
        //
        //
        //
        // *//

        int num1 = 1;
        int num2 = 100;
         int num3 = num1 + num2;
        System.out.println(num3);

        // If Statement (Condinal Block)

        if(num1==num2){
            System.out.println("Num1 = Num2");

        } else if(num1>num2){
            System.out.println("Num1 > Num2");
        } else{
            System.out.println("Else");
        }

        int day = 4;

        switch (day){
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
        }


        // While Loop
//        while(num1 < num2){
//            System.out.println("Hello");
//            num1++;
//
//        }

        // Do While Loop

//        int i = 0;
//        do{
//            System.out.println(i);
//            i++;
//        } while(i<=5);

        int sum = 0;

        //  1 + 2 + 3 + 4 + 5 + 6 +7 + 8 +9

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            sum += i;
        }

        System.out.println("Sum" + sum);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for(String car: cars){
            System.out.println("Car Name " + car);

        }









    }


}
