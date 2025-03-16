import java.util.*;
import java.util.Random;


public class SkillRack {
    public static void main(String[] args) {
        // Step 1: Create a Random Number Generator (1-100)
        Random random = new Random();
        int target = random.nextInt(100) + 1;  // Generates a number between 1 and 100

        // Step 2: Initialize Scanner for User Input
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        // Step 3: Loop until the user guesses correctly
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            // Step 4: Give hints to the user
            if (guess > target) {
                System.out.println("Too high! Try a smaller number. 🔽");
            } else if (guess < target) {
                System.out.println("Too low! Try a bigger number. 🔼");
            } else {
                System.out.println("🎉 Congratulations! You guessed the number " + target + " in " + attempts + " attempts.");
            }

        } while (guess != target); // Repeat until the user guesses correctly

        // Step 5: Close the scanner
        scanner.close();
    }
}

