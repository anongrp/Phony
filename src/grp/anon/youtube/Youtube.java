package grp.anon.youtube;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Youtube implements Initializable {
    @FXML
    private HBox status_bar;

    @FXML
    private WebView youtube;
    private WebEngine youtubeEngine;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        youtubeEngine = youtube.getEngine();
        youtubeEngine.setJavaScriptEnabled(true);
        youtubeEngine.load("https://youtube.com");
    }
}
