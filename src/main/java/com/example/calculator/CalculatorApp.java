package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    Calculator calc = new Calculator();

    @Override
    public void start(Stage primaryStage) {
        try {

            // create a root and load fxml code
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Calculator.fxml"));

            Scene scene = new Scene(loader.load(),600,384);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Calculator App");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
