import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Player player = new Player();

        int botNumber = 0;
        int playerNumber = 0;

        do {
            System.out.println();

            botNumber = random.nextInt(6) +1;

            playerNumber = player.guess();

            System.out.println("Your Number is: " + playerNumber);

            if (playerNumber == botNumber){
                System.out.println("You got that !!!");
            } else{
                System.out.println("You lose :(\nCorrect number is: " + botNumber);
            }
        }while(botNumber != playerNumber);
    }
}