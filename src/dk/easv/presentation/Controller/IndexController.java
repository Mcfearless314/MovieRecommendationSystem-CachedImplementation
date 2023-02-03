package dk.easv.presentation.Controller;

import dk.easv.logic.LogicManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class IndexController implements Initializable {
    @FXML private Button btnMenu;
    private LogicManager logicManager;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        logicManager = new LogicManager();
        logicManager.openNewView("LogIn.fxml", "Movie recommendation system");
    }

    public void handleMenu(ActionEvent event) {

    }

}
