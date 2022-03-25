package com.example.cafesystem;

import com.example.cafesystem.Services.IUserService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    private IUserService _userService;
    public HelloController(IUserService userService){
        _userService = userService;
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        boolean result = _userService.create("Adebayomi", "Farinde", "checkschool@example.com");

        welcomeText.setText("Welcome to JavaFX Application!");
    }
}