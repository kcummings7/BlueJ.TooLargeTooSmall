
/**
 * Write a description of class Main here.
 *
 * @author (Katherine Cummings)
 * @version (2/5/19)
 */
import java.util.Scanner;
import java.util.Random;
public class Main{
    Random num = new Random();
    int secretNumber = num.nextInt(100)+1;
    int counter = 0;
    int lastGuess;
    Scanner input = new Scanner(System.in);
    public Main(){
        checkGuess();
    }

    public void checkGuess(){
        System.out.println("Guess the secret number!");
        int checking = Integer.parseInt(input.nextLine());
        if(checking<secretNumber){
            System.out.println("Too small!");
            if(checking!=lastGuess){
                counter++;
            }
            lastGuess=checking;
            checkGuess();
        }
        else if(checking>secretNumber){
            System.out.println("Too large!");
            if(checking!=lastGuess){
                counter++;
            }
            lastGuess=checking;
            checkGuess();
        }
        else if(checking==secretNumber){
            counter++;
            System.out.println("Exactly right! It took you "+counter+" guesses!");
        }
        else{
            System.out.println("Error!");
            checkGuess();
        }
        
    }
}
