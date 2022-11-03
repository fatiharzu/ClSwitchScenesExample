package de.cloch.clswitchscenesexample.gui;

import javafx.fxml.FXML;

/**
 * Controller für die Detail-Szene
 */
public class DetailController {

    /**
     * Wechselt über den SceneManager zur Master-Szene
     */
    @FXML
    private void switchToMasterScene() {
        SceneManager.getInstance().switchToMasterScene();
    }
}
