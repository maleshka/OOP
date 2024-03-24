package com.example.hellofx.users;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {
    public void start(Stage primaryStage) throws IOException {
        Button registerButton = new Button("Zaregistrovať sa");
        registerButton.setOnAction(event -> {


        });
        registerButton.setPrefWidth(200);

        Button loginButton = new Button("Prihlásiť sa");
        loginButton.setOnAction(event -> {


        });
        loginButton.setPrefWidth(200);

        VBox layout = new VBox(20);
        layout.getChildren().addAll(registerButton, loginButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 1200, 750);

        primaryStage.setTitle("Vitajte v systéme hlasovania");

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
