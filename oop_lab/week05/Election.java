import java.util.Scanner;

public class Election {

    public static void vote_counter(int temp[], int num) {
        int Candidate1 = 0;
        int Candidate2 = 0;
        int Candidate3 = 0;
        int Candidate4 = 0;
        int Candidate5 = 0;
        int voidVotes = 0;

        for (int i = 0; i < num; i++) {
            if (temp[i] == 1) {
                Candidate1 += 1;
            } else if (temp[i] == 2) {
                Candidate2 += 1;
            } else if (temp[i] == 3) {
                Candidate3 += 1;
            } else if (temp[i] == 4) {
                Candidate4 += 1;
            } else if (temp[i] == 5) {
                Candidate5 += 1;
            } else {
                voidVotes += 1;
            }
        }

        System.out.println("Candidate 1: " + Candidate1);
        System.out.println("Candidate 2: " + Candidate2);
        System.out.println("Candidate 3: " + Candidate3);
        System.out.println("Candidate 4: " + Candidate4);
        System.out.println("Candidate 5: " + Candidate5);
        System.out.println("None of the above: " + voidVotes);

    }

    public static void main(String args[]) {

        Scanner stellin = new Scanner(System.in);

        System.out.println("Enter the number of votes for the candidates: ");
        int num = stellin.nextInt();
        int temp[] = new int[num];
        System.out.println(
                "  Candidate 1 - 1\n  Candidate 2 - 2\n  Candidate 3 - 3\n  Candidate 4 - 4\n  Candidate 5 - 5");
        for (int i = 0; i < num; i++) {
            temp[i] = stellin.nextInt();
        }

        vote_counter(temp, num);

    }
}
