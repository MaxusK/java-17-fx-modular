package com.example.graphics;

import com.example.calculator.Calculator;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GraphicsApp extends Application {

    public TextField widthEntered;
    public TextField heightEntered;
    public Button computeButton;
    public TextField circumferenceGiven;
    public TextField areaGiven;
    Calculator calc = new Calculator();

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("GraphicsApp.fxml"));
            Scene scene = new Scene(loader.load(),592,393);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Graphics App");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }

    public void onComputeButtonClicked(ActionEvent actionEvent) {
    }

    public void onComputeButtonClicked(){

    }
}
