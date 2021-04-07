import java.util.Scanner;

public class Main extends Game{
    public static void main(String[] argv){
        Game g = new Game();
        String p1_choice, p2_choice, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Rock-Paper-Scissors game ===");

        System.out.println("Enter Player 1 choice (rock, paper or scissors):");
        p1_choice = scanner.nextLine();
        g.inputValidation(p1_choice);

        System.out.println("Enter Player 2 choice (rock, paper or scissors):");
        p2_choice = scanner.nextLine();
        g.inputValidation(p2_choice);

        result = g.judge(p1_choice, p2_choice);
        System.out.println(result);
    }
}
