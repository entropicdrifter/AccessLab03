package barth.nolan.AccessLab03;


public class GameLogic {
    private static int humanMove;
    private static int cpuMove;
    public int result;
    public void run(){
        HumanPlayer.play();
        ComputerPlayer.playDecide();
        System.out.println("The computer plays: ");
        switch (cpuMove){
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissors");
                break;
        }
        compareMoves();

    }
    public static void setHumanMove(int mv){
        humanMove = mv;
    }

    //Used only for testing:
    public static int getHumanMove(){ return humanMove;}
    public static int getCpuMove(){return cpuMove;}
    //End test methods.
    public static void setCpuMove(int mv) {
        cpuMove = mv;
    }
    private void compareMoves(){
        //Rock = 0, Paper = 1, Scissors = 2
        result = (humanMove - cpuMove);
        if (result == 0){
            System.out.println("It's a draw");
        } else if ((result < 0 && result > -2) || result ==2){
            System.out.println("The Computer wins!");
        } else {
            System.out.println("You win! But will you win again?");
        }
        ComputerPlayer.setHumanLastMove(humanMove);
    }

    public static void main(String[] args) {
        GameLogic rps = new GameLogic();
        //rps.run();
        while (HumanPlayer.playPrompt()){
            rps.run();
        }
    }
    //For Testing only!
    public void compareMovesWrapper(){
        compareMoves();
    }
}
