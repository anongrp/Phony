package grp.anon.playstore;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Playstore implements Initializable {
    @FXML
    private HBox status_bar;

    @FXML
    private WebView playstore;
    private WebEngine playstoreEngine;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        playstoreEngine = playstore.getEngine();
        playstoreEngine.setJavaScriptEnabled(true);
        playstoreEngine.load("https://play.google.com");
    }
}
