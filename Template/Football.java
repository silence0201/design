package Template;

/**
 * Description: Football
 * Author: silence
 * Update: silence(2016-08-02 22:05)
 */
public class Football extends Game {
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
