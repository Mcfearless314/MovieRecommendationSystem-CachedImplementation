package dk.easv.presentation.Controller;

import dk.easv.logic.LogicManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class IndexController implements Initializable {
    @FXML BorderPane borderPane;
    @FXML private Button btnMenu;
    private LogicManager logicManager;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        logicManager = new LogicManager();

        try {
            loadLogIn();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadLogIn() throws IOException {
        //"src/dk/easv/presentation/Controller/View/LogIn.fxml"
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/dk/easv/presentation/View/LogIn.fxml"));
        BorderPane newScene = loader.load();

        borderPane.setCenter(newScene);


        /*logicManager.openNewView("LogIn.fxml", "Movie recommendation system");
        if (false) System.exit(0); //TODO if login is not given, close program */
    }

    public void handleMenu(ActionEvent event) {

    }

}
