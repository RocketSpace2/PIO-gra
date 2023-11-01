import java.util.Random;

public class PlayerBot extends Player{
    private Random rnd = new Random();

    public PlayerBot(){}

    public PlayerBot(String name){
        super (name);
    }

    @Override
    public int guess() {
        return rnd.nextInt(6) + 1;
    }
}
