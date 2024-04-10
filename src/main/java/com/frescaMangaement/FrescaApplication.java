package com.frescaMangaement;

//import com.frescaMangaement.DatabaseConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class FrescaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {
        Connection connection = DatabaseConnector.getConnection();
//        try (Connection connection = DatabaseConnector.getConnection()) {
//            // Perform database operations
//            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");
//            ResultSet resultSet = statement.executeQuery();
//
//            // Process query results
//            while (resultSet.next()) {
//                // Process each row
//                int id = resultSet.getInt("id");
//                String username = resultSet.getString("username");
//                String email = resultSet.getString("email");
//
//                System.out.println("User ID: " + id + ", Username: " + username + ", Email: " + email);
            System.out.println("User ID: ");
//        }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        FXMLLoader fxmlLoader = new FXMLLoader(FrescaApplication.class.getResource("fresca-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setMaximized(true);

        stage.setTitle("Fresca Application");
        stage.getIcons().add(new Image(Objects.requireNonNull(FrescaApplication.class.getResourceAsStream("Fresca.png"))));
        scene.getStylesheets().add(FrescaApplication.class.getResource("styles.css").toExternalForm());

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}