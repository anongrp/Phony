package grp.anon.launcher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("../phone/phone.fxml")));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Phony - The Android Simulator");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
