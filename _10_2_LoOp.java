import java.util.Scanner;

public class _10_2_LoOp {
    //   ! NOT reverses boolean value of a condition
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if (!response.equals("q") && !response.equals("Q")) { //if your response is not a q and Q
            System.out.println("You are still playing the game");
        }
        else {
            System.out.println("You quit the game");
        }
    }
}
