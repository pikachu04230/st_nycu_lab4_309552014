import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game g = new Game();

    @Test
    void judge() {
        assertEquals("Player 1 win!", g.judge("rock"    , "scissors"));
        assertEquals("Player 1 win!", g.judge("paper"   , "rock"));
        assertEquals("Player 1 win!", g.judge("scissors", "paper"));
        assertEquals("Player 2 win!", g.judge("rock"    , "paper"));
        assertEquals("Player 2 win!", g.judge("paper"   , "scissors"));
        assertEquals("Player 2 win!", g.judge("scissors", "rock"));
        assertEquals("Draw!", g.judge("rock"    , "rock"));
        assertEquals("Draw!", g.judge("paper"   , "paper"));
        assertEquals("Draw!", g.judge("scissors", "scissors"));
    }

    @Test
    void inputValidation() {
        assertEquals(true, g.inputValidation("rock"));
        assertEquals(true, g.inputValidation("paper"));
        assertEquals(true, g.inputValidation("scissors"));

        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            g.inputValidation("peko");
        });
        assertEquals("Bad Choice!", exception.getMessage());
    }
}