package com.example.cafesystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AdminViewController {

    @FXML
    Label AdminViewHelloLabel;


    public void displayName(String username) {
        AdminViewHelloLabel.setText("Hello " + username);
    }

}
