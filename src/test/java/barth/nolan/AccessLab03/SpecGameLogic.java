package barth.nolan.AccessLab03;


import org.junit.Test;
import static org.junit.Assert.*;

public class SpecGameLogic {
    @Test
    public void compareMovesTest(){
        GameLogic g = new GameLogic();
        GameLogic.setCpuMove(0); //rock
        GameLogic.setHumanMove(1); //paper
        g.compareMovesWrapper();
        assertEquals(g.result, 1); //The result is 1, meaning the human wins. The human wins with results  1, and -2
        //paper covers rock. Human should win.
        GameLogic.setHumanMove(2); //switch human move to scissors:
        g.compareMovesWrapper();
        //rock breaks scissors, Human should lose.
        assertEquals(g.result, 2); //The result is 2, meaning the computer wins. The computer wins with results 2 and -1
        GameLogic.setHumanMove(0); //Human move set to rock.
        g.compareMovesWrapper();// Should be a draw.
        assertEquals(g.result, 0); //the result should be 0 when it's a draw.
    }
}
