package pong.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * Starts the stage.
     * @param primaryStage Designates the stage.
     * @throws Exception Catches exceptions.
     */
    @Override
    public void start(final Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader()
                .getResource("sample.fxml"));
        primaryStage.setTitle("Networked Pong");
        primaryStage.setResizable(false);
        primaryStage.setScene(new GameScene()); //root, WIN_WIDTH, WIN_HEIGHT
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
