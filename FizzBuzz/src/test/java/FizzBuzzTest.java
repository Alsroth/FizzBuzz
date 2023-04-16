

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.example.FizzBuzz.displayFizzBuzz;
import static org.example.FizzBuzz.displayFizzBuzz2;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    @Test
    void Test_displayFizzBuzz() {
        List<Integer> input = List.of(15, 30, 9, 10);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Appel de la fonction à tester
        displayFizzBuzz(input);

        // Récupération de la sortie réelle
        String actualOutput = outputStream.toString().trim().replaceAll("\n", "").replaceAll("\r", "");

        // Réinitialisation de la sortie standard
        System.setOut(System.out);

        // Vérification de la sortie
        assertEquals("FIZZBUZZ" + "FIZZBUZZ" + "FIZZ" + "BUZZ", actualOutput);
    }

    @Test
    void Test_displayFizzBuzz2() {
        List<Integer> input = List.of(15, 30, 9, 10);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Appel de la fonction à tester
        displayFizzBuzz2(input);

        // Récupération de la sortie réelle
        String actualOutput = outputStream.toString().trim().replaceAll("\n", "").replaceAll("\r", "");

        // Réinitialisation de la sortie standard
        System.setOut(System.out);

        // Vérification de la sortie
        assertEquals("FIZZBUZZ" + "FIZZBUZZ" + "FIZZ" + "BUZZ", actualOutput);
    }
}
