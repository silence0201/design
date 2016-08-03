package Template;

/**
 * Description: TemplatePatternDemo
 * Author: silence
 * Update: silence(2016-08-02 22:05)
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
