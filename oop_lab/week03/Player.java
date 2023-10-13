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
        Scanner stellin = new Scanner(System.in);
        int guess[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Player " + (i + 1) + " guess: ");
            guess[i] = stellin.nextInt();
        }
        p1.guess(guess[0]);
        p2.guess(guess[1]);
        p3.guess(guess[2]);
    }

    public void check(int winningNumber) {
        if (winningNumber == p1.num) {
            System.out.println("Player 1 won");
        } else if (winningNumber == p2.num) {
            System.out.println("Player 2 won");
        } else if (winningNumber == p3.num) {
            System.out.println("Player 3 won");
        } else
            System.out.println("none ");
    }

    public static void main(String args[]) {

        Random rand = new Random();
        int winningNumber;
        winningNumber = rand.nextInt(10);

        guessGame gg = new guessGame();

        gg.startGame();
        gg.check(winningNumber);

    }

}
