package com.frescaMangaement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class FrescaController {

    @FXML
    private Button restaurantButton;
    @FXML
    private Button takeAwayButton;

    @FXML
    private Button receiptButton;

    @FXML
    private Button officeButton;

    @FXML
    private Button hostButton;

    @FXML
    private void openNewOrder(){
        try {
            // Load the new FXML file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("newOrder.fxml"));
            Parent root = fxmlLoader.load();

            // Get the current stage
            Stage stage = (Stage) restaurantButton.getScene().getWindow();

            // Set the new scene
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("New Scene");
            // Show the new scene
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void viewTakeAwayOrders(){


    }
}