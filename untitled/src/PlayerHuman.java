import java.util.Scanner;

public class PlayerHuman extends Player{
    private Scanner sc= new Scanner(System.in);

    public PlayerHuman(){}

    public PlayerHuman(String name){
        super(name);
    }

    @Override
    public int guess(){
        int number;
        boolean error = false;

        System.out.println("Write number in range from 1 to 6: ");

        do{

            if(error)
                System.out.println("Wrong data has passed. Try again: ");

            number =sc.nextInt();

            error = true;
        }while(!(number >= 1 && number <= 6));

        return number;
    }
}
