import java.util.Scanner;

public class ArraysLoopsMethods{
    /*
        access [static] returnType name([parameter[s]])
        public | private | protected
        int | double | any Java primitive | String | any class | "nothing" -> void
        names should follow variable nameing conventions
        parameters can be any data type. as many or as few as you want. arrays, classes, single variables

        the name and parameters create a method signature
    */
    public static void main(String[] args){
        double studentA = 79.5;
        double studentB = 12.3;
        double studentC = 99.9;
        double studentD = 50;

        System.out.println("Student grades are:");
        System.out.println(" studentA: " + studentA + "%, " +
                " studentB: " + studentB + "%, " +
                " studentC: " + studentC + "%" +
                " studentD: " + studentD + "%");

        double total = studentA + studentB + studentC + studentD;
        double avg = total / 4;
        System.out.println("Class average: " + avg);
        // this won't work for large numbers of students. 4 was bad enough

        String studentNames[] = {"Student A", "Student B", "Student C", "Student D"};
        double studentGrades[] = new double[5];
        // array indexes start at 0!!
        studentGrades[0] = 79.5; // we need to re-learn how to count
        studentGrades[1] = 12.3;
        studentGrades[2] = 99.9;
        studentGrades[3] = 50;
        studentGrades[4] = 80;

        System.out.println("Student grades are:");
        System.out.println(" studentA: " + studentGrades[0] + "%, " +
                " studentB: " + studentGrades[1] + "%, " +
                " studentC: " + studentGrades[2] + "%" +
                " studentD: " + studentGrades[3] + "%");

        System.out.println("Student names are:");
        System.out.println(" studentA: " + studentNames[0] + "%, " +
                " studentB: " + studentNames[1] + "%, " +
                " studentC: " + studentNames[2] + "%" +
                " studentD: " + studentNames[3] + "%");

        System.out.println(studentNames[0] + " has " + studentGrades[0] + " in JAV1001");

        /*
            for-loop
            for( startVariable; stopVariable; stepVariable){
                //some code
            }
        */
        for(int i = 1; i <= 5; ++i){
            System.out.println(i);
        }
        for(int i = 10; i > 0; i -= 2){
            System.out.println(i);
        }

        String output = "";
        if(studentGrades[0] < 50){
            output = "The student is not doing well";
        }
        System.out.println(output);
        System.out.println("Number of students: " + studentGrades.length);
        System.out.println("Running a loop with < length");
        for(int i = 0; i < studentGrades.length; ++i){
            System.out.println("Student"+i + " grade: " + studentGrades[i]);
        } //green
        // for(int i = 0; i <= 4; ++i) {
        //     System.out.println("Student"+i + " grade: " + studentGrades[i]);
        // }//red
        System.out.println("Running a loop with <= length -1");
        for(int i = 0; i <= studentGrades.length - 1; ++i) {
            System.out.println("Student"+i + " grade: " + studentGrades[i]);
        }

        /*
            *
            **
            ***
            ****
            *****

            *****
            ****
            ***
            **
            *

                *
               **
              ***
             ****
            *****
        */

        System.out.println("*");
        for(int i = 0; i < 2; ++i){
            System.out.print("*");
        }
        System.out.println("\n\n");
        for(int i = 1; i < 6; ++i){
            for(int j = 0; j < i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
        // for-loops are great for when you know how many times or can calculate how many times it needs to run

        /*
            while-loop
            while( condition ){
                //some code
            }
        */
        // this runs
        System.out.println("while loops");
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count++;
        }
        // this one doesn't run
        count = 15;
        while(count < 10){
            System.out.println("This statement does't print");
            count++;
        }
        // pre-condition loop
        // we check the condtion BEFORE running any sort of code
        // no minumum to the number of times it will run, but there's not maximum. Could be 0, could be infinite

        // without setting proper variables we can end up with a loop that never ends. It's infinite
        // while(true){
        //     System.out.println("This is the program that never ends");
        // }

        /*
            do-while loop
            do{
                //some code
            }while (condition); //notice this semi-colon
        }
        */
        System.out.println("do-while loops");
        count = 0;
        do{
            System.out.println(count);
            count++;
        }while(count < 10);
        // this one doesn't run
        count = 15;
        do{
            System.out.println("This statement does't print");
            count++;
        }while(false);
        //post-condition loop. we check the condition AFTER running
        // has to run at least once, but still no maximum for how many times it will run. Could be 1, could be inifinity

        /*
            for loops: calculate how many times it runs
            while loops: no guarantee
            do-while loop: always run at least once
        */

        //green for while loop
        //red for a do while
        Scanner keyb = new Scanner(System.in);
        for(int i = 0; i < studentGrades.length; ++i){
            // System.out.print("Enter a grade for studnet " + i + ": ");
            // double grade = keyb.nextDouble();
            //and &&
            //or ||
            // if(grade > 0 && grade < 100){
            //     studentGrades[1] = grade;
            // }
            // while(grade < 0 || grade > 100){
            //     System.out.print("Enter a VALID grade for studnet " + i + ": ");
            //     grade = keyb.nextDouble();
            // }

            double grade = -1;
            // do{
            //     System.out.println("Enter a grade for student " + i + ": ");
            //     grade = keyb.nextDouble();
            // }while(grade < 0 || grade > 100);
            //this while or do-while loop is a sentinal loop
            // it's aware of when to start and stop on it's own
        } //something else (in this case a for loop)


        myCustomPrint("Hello world!");

        int sumInMain = mySum(5, 100);
        System.out.println(sumInMain);
        System.out.println(mySum(100, 500.));
        System.out.println(mySum(100., 500));

        System.out.println("Adding student grades (doubles)");
        System.out.println(mySum(studentGrades[0], studentGrades[1]));
        System.out.println("5 is even: " + isEven(5));

        int initValue = 10;
        System.out.println("initValue before: " + initValue);
        changeX(initValue, 5);
        System.out.println("initValue after: " + initValue);

        System.out.println("Printing student grades");
        System.out.println("Before pizza");
        printArray(studentGrades);
        changeStudentGrades(studentGrades, 15);
        System.out.println("After pizza");
        printArray(studentGrades);

        System.out.println(studentGrades);

        int[] myInts = { 1, 2, 3};
        System.out.println("Min value: " + findMin(myInts));

        int[] newInt = { 6 };
        System.out.println("New min value: " + findMin(newInt));

    } //main



    public static void myCustomPrint(String message){
        System.out.println("Yes, I printed " + message);
    }

    public static int mySum(int a, int b){
        System.out.println("int version");
        int mySum = a + b;
        // DON'T do this. Methods should only do one thing
        //System.out.println("The sum of " + a + " and b " + " is " + mySum);
        return mySum;
    }

    public static double mySum(int a, double b){
        System.out.println("double with int and double");
        return a + b;
    }

    public static double mySum(double a, double b){
        System.out.println("double version");
        return a + b;
    }

    public static boolean isEven(int check){
        return check % 2 == 0;
    }

    public static void changeX(int initValue, int changeBy){
        System.out.println("iniValue inside before: " + initValue);
        initValue += changeBy;
        System.out.println("iniValue inside after: " + initValue);
    }

    public static void changeStudentGrades(double[] array,
                                                int changeBy){
        double arrayCopy[] = new double[array.length];
        for(int i = 0; i < arrayCopy.length; ++i){
            arrayCopy[i] = array[i];
        }
        for(int i = 0; i < arrayCopy.length; ++i){
            arrayCopy[i] += changeBy;
        }
    }

    public static void printArray(double[] array){
        for(int i = 0; i < array.length; ++i){
            System.out.println("Value at " + i + ": " + array[i]);
        }
    }

    public static int findMin(int[] array){
        int min = array[0];
        //green check if I can check the second Value
        //red x if it will break
        //  1         <       length is 1
        // indexes [ 0 ]
        for(int i = 1; i < array.length; ++i){
            if(array[i] <= min){
                System.out.println("Found a small value");
                min = array[i];
            }
        }
        return min;
    }

}// Class
