package de.cloch.clswitchscenesexample;

import de.cloch.clswitchscenesexample.gui.SceneManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SceneManager.getInstance().setMainStage(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}