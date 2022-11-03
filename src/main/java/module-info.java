module de.cloch.clswitchscenesexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.cloch.clswitchscenesexample to javafx.fxml;
    exports de.cloch.clswitchscenesexample;
    exports de.cloch.clswitchscenesexample.gui;
    opens de.cloch.clswitchscenesexample.gui to javafx.fxml;
}