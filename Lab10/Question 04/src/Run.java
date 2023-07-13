package src;

public class Run {
    public static void run() {
        RegularPlayer regularPlayer = new RegularPlayer();
        JumpingPlayer jumpingPlayer = new JumpingPlayer();

        // Print movements of regular player
        regularPlayer.moveUp();
        regularPlayer.moveDown();
        regularPlayer.moveLeft();
        regularPlayer.moveRight();

        // Print movements of jumping player
        jumpingPlayer.moveUp();
        jumpingPlayer.moveDown();
        jumpingPlayer.moveLeft();
        jumpingPlayer.moveRight();
    }
}
