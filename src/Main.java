import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int botNumber = 0;
        int playerNumber = 0;

        do {
            System.out.println();

            botNumber = random.nextInt(6) +1;

            playerNumber = random.nextInt(6) + 1;
            System.out.println("Your Number is: " + playerNumber);

            if (playerNumber == botNumber){
                System.out.println("You got that !!!");
            } else{
                System.out.println("You lose :(\nCorrect number is: " + botNumber);
            }
        }while(botNumber != playerNumber);
    }
}