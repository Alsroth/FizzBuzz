package org.example;

import java.util.List;

public class FizzBuzz {

    public static void displayFizzBuzz(List<Integer> n) {
        for (int number : n) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(FizzBuzzValues.FIZZBUZZ);
            } else if (number % 3 == 0) {
                System.out.println(FizzBuzzValues.FIZZ);
            } else if (number % 5 == 0) {
                System.out.println(FizzBuzzValues.BUZZ);
            } else {
                System.out.println(n);
            }
        }
    }

    public static void displayFizzBuzz2(List<Integer> n) {
        // Cas divisible par 3 et 5
        n.stream().filter((number) -> number % 3 == 0 && number % 5 == 0).forEach(number -> System.out.println(FizzBuzzValues.FIZZBUZZ));
        // Cas divisible par 3 et pas par 5
        n.stream().filter((number) -> number % 3 == 0 && number % 5 != 0).forEach(number -> System.out.println(FizzBuzzValues.FIZZ));
        // Cas divisible par 5 et pas par 3
        n.stream().filter((number) -> number % 5 == 0 && number % 3 != 0).forEach(number -> System.out.println(FizzBuzzValues.BUZZ));

    }
}
