public class Game {
    Game(){}
    String judge(String p1_choice, String p2_choice) {
        if (p1_choice.equals("rock")) {
            if (p2_choice.equals("rock")) {
                return "Draw!";
            }
            else if (p2_choice.equals("paper")) {
                return "Player 2 win!";
            }
            else {  // p2 choose scissors
                return "Player 1 win!";
            }
        }
        else if (p1_choice.equals("paper")) {
            if (p2_choice.equals("rock")) {
                return "Player 1 win!";
            }
            else if (p2_choice.equals("paper")) {
                return "Draw!";
            }
            else{   // p2 choose scissors
                return "Player 2 win!";
            }
        }
        else {  // p1 choose scissors
            if (p2_choice.equals("rock")) {
                return "Player 2 win!";
            }
            else if (p2_choice.equals("paper")) {
                return "Player 1 win!";
            }
            else{   // p2 choose scissors
                return "Draw!";
            }
        }
    }
    boolean inputValidation (String input){
        if (!(input.equals("rock") || input.equals("paper") || input.equals("scissors"))) {
            throw new IllegalArgumentException("Bad Choice!");
        }
        else {
            return true;
        }
    }
}
