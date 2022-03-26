package com.example.cafesystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CustomerViewController {

    @FXML
    private Label customerViewhelloLabel;

    public void displayName(String fName)
    {
        customerViewhelloLabel.setText("Hello " + fName);
    }

}