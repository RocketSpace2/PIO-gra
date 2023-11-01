import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        gameHuman();
    }

    public static void gameHuman(){
        Player player = new PlayerHuman();

        player.setName("Alex");


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
        System.out.println("Finish of work");
    }

    public static void gameBot(){

        Player player = new PlayerBot();

        player.setName("Alex");


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
        System.out.println("Finish of work");
    }
    public static void gameMain(){
        int botNumber = 0;
        int playerNumber = 0;

        do {
            System.out.println();

            botNumber = random.nextInt(6) +1;

            playerNumber = random.nextInt(6)+1;

            System.out.println("Your Number is: " + playerNumber);

            if (playerNumber == botNumber){
                System.out.println("You got that !!!");
            } else{
                System.out.println("You lose :(\nCorrect number is: " + botNumber);
            }
        }while(botNumber != playerNumber);
        System.out.println("Finish of work");
    }
}