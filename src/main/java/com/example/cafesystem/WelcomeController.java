package com.example.cafesystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {



    private Stage stage;

    private Scene scene;

    private Parent root;



    public void switchToAdminLogin(ActionEvent event) throws IOException {


        root = FXMLLoader.load(getClass().getResource("AdminLogInView.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();





    }

    public void switchToCustomerLogin(ActionEvent event) throws IOException {


        root = FXMLLoader.load(getClass().getResource("CustomerLogInView.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();





    }

    public void switchToRegister(ActionEvent event) throws IOException {


        root = FXMLLoader.load(getClass().getResource("registerView.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();





    }
}
