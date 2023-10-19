import java.util.Random;
public class Player {
    private String name;
    private Random rand = new Random();

    public int guess(){

        return rand.nextInt(6) + 1;
    }

    public void setName(String name){
        if(name == null || name.equals("")){
            System.out.println("Wrong name has passed.");
        }else {
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }
}
