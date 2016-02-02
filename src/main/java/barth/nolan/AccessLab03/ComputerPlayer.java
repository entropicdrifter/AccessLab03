package barth.nolan.AccessLab03;

import java.util.Random;


public class ComputerPlayer {
    private static int humanLastMove = -1;
    private static int humanOldMove = -1;
    private static Random rand = new Random();

    public static void playDecide(){
        int ulm = rand.nextInt(10)+1;
        //int ulm = rand.nextInt(2); //These two lines used to test using logic exactly 50% of the time.
        //if (ulm == 0 & !(humanLastMove == -1)){
        //if (humanLastMove != -1){ //Used to test pure logic after first round as a throwaway. Decent, but formulaic to thwart.
        if (ulm < (int)Math.ceil((Math.abs(rand.nextGaussian())+.5)*4) && !(humanLastMove == -1)) { //Predict that!
            useHumanLastMoves();
        }
        else {
            GameLogic.setCpuMove(rand.nextInt(3));
        }
    }

    private static void useHumanLastMoves(){
        if ((!((humanLastMove-1 > humanOldMove) || (humanLastMove == 0 && humanOldMove == 1)) && (humanLastMove > humanOldMove)) || humanOldMove == -1) {
            if (humanLastMove == 0) {
                GameLogic.setCpuMove(2);
            } else {
                GameLogic.setCpuMove((humanLastMove - 1));
            }
        }
        else if (humanLastMove-1 > humanOldMove || (humanLastMove == 0 && humanOldMove ==1)){
            GameLogic.setCpuMove(humanLastMove);
        }
        else {
            if (humanLastMove == 2) {
                GameLogic.setCpuMove(0);
            } else {
                GameLogic.setCpuMove((humanLastMove + 1));
            }
        }
    }
    public static void setHumanLastMove(int hlm){
        humanOldMove = Integer.valueOf(humanLastMove);
        humanLastMove = hlm;
    }
    /* Uncomment for testing usage.
    //The following are used only for testing purposes.
    public static int getHumanLastMove(){return humanLastMove;}
    public static void useHumanLastGetter(){useHumanLastMoves();} */
}
