package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ApplicationMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, DataBase Client!");
        StackPane root = new StackPane(label);

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Basic Window App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}