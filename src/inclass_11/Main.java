package inclass_11;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num_array = new int[2];
        int i = 0, result;

        while (i < num_array.length){
            try {
                System.out.printf("Please enter number %d%n", i + 1);
                num_array[i] = in.nextInt();
                i++;
            } catch (InputMismatchException e){
                System.out.println("Invalid integer entered, please try again");
                in.nextLine();
            }
        }

        try {
            result = num_array[0] / num_array[1];
            System.out.printf("%d goes into %d: %d times", num_array[0], num_array[1], result);
        } catch (ArithmeticException a){
            System.out.println("Second number is zero, cannot do division.");
            a.printStackTrace(System.out);
        }

        System.out.println(Arrays.toString(num_array));
    }
}
