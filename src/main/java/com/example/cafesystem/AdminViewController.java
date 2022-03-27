package com.example.cafesystem;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class AdminViewController implements Initializable {

    @FXML
    Label AdminViewHelloLabel;


    private Stage stage;

    private Scene scene;

    private Parent root;


    @FXML
    private Label chooseReportLabel;

    @FXML
    private Label chosenReport;

    @FXML
    private ListView<String> reportsListView;

    @FXML
    private TextArea AdminViewTextArea;

    @FXML
    private ChoiceBox<String> StaffChoiceBox;
    @FXML
    private Label staffManagementLabel;

    String[] reports = {"Most Popular Item", "Most active customer", "Number of active staff"};
    String currentReport;

    private String[] staffOptions = {"View Staff", "Add", "Remove"};

    private String[] dummy = {"dog", "dog", "cat", "lion"};


    public void displayName(String username) {
        AdminViewHelloLabel.setText("Hello " + username);
    }


    public void switchToWelcome(ActionEvent event) throws IOException {


        root = FXMLLoader.load(getClass().getResource("welcomeView.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        StaffChoiceBox.getItems().addAll(staffOptions);
        reportsListView.getItems().addAll(reports);

        reportsListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {

                //based on selection display report
                currentReport = reportsListView.getSelectionModel().getSelectedItem();

                switch (currentReport) {
                    case "Most Popular Item":
                        AdminViewTextArea.setText(dummy[0]);
                        break;
                    case "Most active customer":
                        AdminViewTextArea.setText(dummy[2]);


                }


                chosenReport.setText(currentReport);
            }
        });


    }


}
