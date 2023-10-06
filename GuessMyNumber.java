import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[]args){
    int guess;
    Scanner in = new Scanner(System.in);
    System.out.print("Guess a number between 1 and 100 (including both):\n");
        guess = in.nextInt();
        guessNumber1(guess);

    }



    public static void guessNumber1(int guess) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
        Scanner in = new Scanner(System.in);
        if (number > guess){
            System.out.print("Too low. Try again\n");
            guess = in.nextInt();
            guessNumber2(guess, number);
        } else if (number < guess){
            System.out.print("Too high. Try again\n");
            guess = in.nextInt();
            guessNumber2(guess, number);
        } else {
            System.out.print("Exactly Right! Congratulations!");
        };
    }

    public static void guessNumber2(int guess, int number) {
        Scanner in = new Scanner(System.in);
        if (number > guess){
            System.out.print("Too low. Try again\n");
            guess = in.nextInt();
            guessNumber3(guess, number);
        } else if (number < guess){
            System.out.print("Too high. Try again\n");
            guess = in.nextInt();
            guessNumber3(guess, number);
        } else {
            System.out.print("Exactly Right! Congratulations!");
        };
    
    
    }
    public static void guessNumber3(int guess, int number) {
        Scanner in = new Scanner(System.in);
        if (number == guess){
            System.out.print("Exactly Right! Congratulations!\n");
        } else {
            System.out.print("3 strikes and you're out!");
        };
    }
}
