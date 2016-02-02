package barth.nolan.AccessLab03;


import org.junit.Test;
import static org.junit.Assert.*;

public class SpecComputerPlayer {
    @Test
    public void playDecideTest(){
        ComputerPlayer.playDecide();
        //Computer picked a valid move. Let's confirm:
        assertTrue(GameLogic.getCpuMove() == 0 || GameLogic.getCpuMove() == 1 || GameLogic.getCpuMove() == 2);
    }
    //Uncomment corresponding methods in ComputerPlayer to test.
    /*@Test public void useHumanLastMoveTest(){
        ComputerPlayer.setHumanLastMove(2);
        ComputerPlayer.setHumanLastMove(2);
        System.out.println(ComputerPlayer.getHumanLastMove());
        //First we tell the computer that the last two human moves were scissors and print to confirm the setter works...
        ComputerPlayer.useHumanLastGetter();
        //Then we ask it to use its logic to decide the next move...
        assertEquals(GameLogic.getCpuMove(), 0);
        //And it should have picked rock (0).
    }*/
}
