package de.cloch.clswitchscenesexample.gui;

import de.cloch.clswitchscenesexample.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller für die Master-Szene
 */
public class MasterController {

    /**
     * Wechselt über den SceneManager zur Detail-Szene
     */
    @FXML
    private void switchToDetailScene() {
        SceneManager.getInstance().switchToDetailScene();
    }
}