package com.example.cafesystem;

import com.example.cafesystem.CustomerViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginCustomerController {



    @FXML
    TextField LogInCustomerEmailText;


    private Stage stage;
    private Scene scene;
    private Parent root;

    public void loginCustomer(ActionEvent event) throws IOException
    {
        String username = LogInCustomerEmailText.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("customerView.fxml"));
        root = loader.load();

        CustomerViewController customerViewController =  loader.getController();
        customerViewController.displayName(username);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }







}
