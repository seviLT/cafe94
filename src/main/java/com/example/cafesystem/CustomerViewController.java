package com.example.cafesystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CustomerViewController {

    @FXML
    Label CustomerViewHelloLabel;


    public void displayName(String username) {
        CustomerViewHelloLabel.setText("Hello " + username);
    }



}
