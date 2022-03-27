package com.example.cafesystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminViewMenuController implements Initializable {



    @FXML

    private Stage stage;

    private Scene scene;

    private Parent root;



    public void switchToAdminView(ActionEvent event) throws IOException {


        root = FXMLLoader.load(getClass().getResource("AdminView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }





    @FXML
    private Label AdminViewMenuLabel;

    @FXML
    private ListView<String> AdminViewMenuList;

    String []  menu = {"Big Mac","Chicken Burger","Fillet","Apple"};

    String currentMenu;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        AdminViewMenuList.getItems().addAll(menu);


    }



}
