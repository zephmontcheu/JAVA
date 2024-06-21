import gdi.game.dominion.BaseGame;
import gdi.game.dominion.DominionInterface;
import gdi.game.dominion.DominionTileManagerInterface;

public class Main {
    public static void main(String[] args) {

        DominionTileManagerInterface manager = new DominionTileManager(5, 7);
        DominionInterface dominion = new Dominion(manager);
        BaseGame game = new BaseGame(args, dominion);

        game.run();


    }
}
