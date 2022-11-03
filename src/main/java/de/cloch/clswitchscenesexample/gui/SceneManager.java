package de.cloch.clswitchscenesexample.gui;

import de.cloch.clswitchscenesexample.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Singleton, welcher für das Wechseln
 * der Szenen zuständig ist. Er stellt öffentliche
 * Methoden zur Verfügung um zu bestimmten Szenen zu wechseln.
 * Dafür hat er eine Referenz auf das Hauptfenster der Applikation
 * um über dieses Fenster den Inhalt (die Szene) auszutauschen.
 */
public class SceneManager {

    private static SceneManager instance;

    private Stage mainStage;

    private SceneManager() {}

    public static synchronized SceneManager getInstance() {
        if (instance == null) instance = new SceneManager();
        return instance;
    }

    public void setMainStage(Stage stage) {

        mainStage = stage;
        mainStage.setTitle("Switch Scenes Example");
        switchToMasterScene();

//        Image icon = new Image("icon.png");
//        mainStage.getIcons().add(icon);
//        mainStage.setFullScreen(true);
//        mainStage.setFullScreenExitHint("YOU CANT'T EXCAPE unless you press q");
//        mainStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

    }

    /**
     * Lädt die Detail-Szene und wechselt zu ihr
     */
    public void switchToDetailScene() {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("detail-layout.fxml"));
        try {
            Scene detailScene = new Scene(fxmlLoader.load(), 320, 240);
            switchScene(detailScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Lädt die Master-Szene und wechselt zu ihr
     */
    public void switchToMasterScene() {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("master-layout.fxml"));
        try {
            Scene masterScene = new Scene(fxmlLoader.load(), 320, 240);
            switchScene(masterScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Wechselt zu einer übergebenen geladenen Szene
     *
     * @param scene : {@link Scene} : Szene zu der gewechselt werden soll
     */
    private void switchScene(Scene scene) {
        mainStage.setScene(scene);
        mainStage.show();
    }
}
