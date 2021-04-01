package pong.game;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class GameScene extends Scene {
    /**
     * The designated width of the display window.
     */
    private static final int WIN_WIDTH = 640;

    /**
     * The designated height of the display window.
     */
    private static final int WIN_HEIGHT = 480;

    /**
     * The determined size of the barrier elements.
     */
    private static final int BARRIER_SZ = 15;

    /**
     * The determined number of dots on the center court line.
     */
    private static final int NUM_COURT_DOTS = 15;

    /**
     * Constructs the pong background elements.
     */
    public GameScene() {
        super(generateRoot(), WIN_WIDTH, WIN_HEIGHT);
        setFill(Color.BLACK);
    }

    /**
     * Instantiates all necessary elements for the {@link Scene}'s group and
     * adds them a new {@link Group} instance.
     * @return The filled group of all background elements.
     */
    private static Group generateRoot() {
        Group root = new Group();

        Rectangle ciel = new Rectangle(0, 0, WIN_WIDTH, BARRIER_SZ);
        Rectangle floor = new Rectangle(0, WIN_HEIGHT - BARRIER_SZ,
                WIN_WIDTH, BARRIER_SZ);

        root.getChildren().add(ciel);
        root.getChildren().add(floor);

        for (int i = 0; i < NUM_COURT_DOTS; i++) {
            Rectangle r = new Rectangle();
            r.setY((i * ((WIN_HEIGHT - (2 * BARRIER_SZ)) / (NUM_COURT_DOTS)))
                    + BARRIER_SZ);
            r.setWidth(BARRIER_SZ);
            r.setX((WIN_WIDTH - r.getWidth()) / 2);
            r.setHeight(BARRIER_SZ);
            root.getChildren().add(r);
        }
        for (Node rect : root.getChildren()) {
            ((Shape) rect).setFill(Color.LIGHTGRAY);
        }

        return root;
    }
}
