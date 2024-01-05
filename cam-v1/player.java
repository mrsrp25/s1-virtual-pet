
    import java.util.ArrayList;
import java.util.Scanner;

public class player {
    private String name;
    private int score;

    public player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore(int points) {
        this.score += points;
    }
}



    

