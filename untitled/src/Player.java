import java.util.Random;
public class Player {
    private String name = "Someone";
    private Random rand = new Random();

    Player(){
    }

    Player(String name) {
        setName(name);
    }

    public int guess(){

        return rand.nextInt(6) + 1;
    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            System.err.println("Wrong name has passed.");
        }else {
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }
}
