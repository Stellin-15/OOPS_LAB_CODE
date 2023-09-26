import java.util.*;

public class Player {
    int num;

    public void guess(int num) {
        this.num = num;
    }

}

class guessGame {
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        int guess[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Player " + (i + 1) + " guess: ");
            guess[i] = sc.nextInt();
        }
        p1.guess(guess[0]);
        p2.guess(guess[1]);
        p3.guess(guess[2]);
    }

    public void check(int winning_number) {
        if (winning_number == p1.num) {
            System.out.println("Player 1 won");
        } else if (winning_number == p2.num) {
            System.out.println("Player 2 won");
        } else if (winning_number == p3.num) {
            System.out.println("Player 3 won");
        } else
            System.out.println("none ");
    }

    public static void main(String args[]) {

        Random rand = new Random();
        int winning_number;
        winning_number = rand.nextInt(10);

        guessGame gg = new guessGame();

        gg.startGame();
        gg.check(winning_number);

    }

}
