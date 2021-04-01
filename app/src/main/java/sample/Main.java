package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    /**
     * The designated width of the display window.
     */
    private static final int WIN_WIDTH = 300;

    /**
     * The designated height of the display window.
     */
    private static final int WIN_HEIGHT = 275;

    /**
     * Starts the stage.
     * @param primaryStage Designates the stage.
     * @throws Exception Catches exceptions.
     */
    @Override
    public void start(final Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader()
                .getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, WIN_WIDTH, WIN_HEIGHT));
        primaryStage.show();
    }

    /**
     * It's the main.
     * @param args Takes in command line arguments.
     */
    public static void main(final String[] args) {
        launch(args);
    }
}
