package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {
    @FXML
    public Button addbutton;
    @FXML
    public Button subtractbutton;
    @FXML
    public Button multiplybutton;
    @FXML
    public Button dividebutton;
    @FXML
    public TextField number1;
    @FXML
    public TextField number2;
    @FXML
    public TextField result;

    Calculator calculator = new Calculator();
    private boolean number1correct = false;
    private boolean number2correct = false;

    private double getnumber1() {
        return (Double.parseDouble(number1.getText()));
    }

    private double getnumber2() {
        return (Double.parseDouble(number2.getText()));
    }

    @FXML
    public void onaddbuttonclicked() {
        result.setText(String.valueOf(calculator.add(getnumber1(), getnumber2())));
    }

    @FXML
    public void onsubtractbuttonclicked() {
        result.setText(String.valueOf(calculator.subtract(getnumber1(), getnumber2())));
    }

    @FXML
    public void onmultiplybuttonclicked() {
        result.setText(String.valueOf(calculator.multiply(getnumber1(), getnumber2())));
    }

    @FXML
    public void ondividebuttonclicked() {
        result.setText(String.valueOf(calculator.divide(getnumber1(), getnumber2())));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        result.setMouseTransparent(true);
        result.setFocusTraversable(false);
        result.setBackground(new Background(
                new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        number1.setStyle("-fx-focus-color: red; -fx-faint-focus-color: #ff000022;");
        number2.setStyle("-fx-focus-color: red; -fx-faint-focus-color: #ff000022;");
        handleButtonState();
        setChangeListener(number1);
        setChangeListener(number2);
    }


    private void setChangeListener(TextField textField) {
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            try {
                Double.parseDouble(newValue);
                if (textField == number1) {
                    number1correct = true;
                } else number2correct = true;
                textField.setStyle("-fx-focus-color: green; -fx-faint-focus-color: rgba(102,255,0,0.13);");
            } catch (NumberFormatException e) {
                if (textField == number1) {
                    number1correct = false;
                } else number2correct = false;
                textField.setStyle("-fx-focus-color: red; -fx-faint-focus-color: #ff000022;");
            } finally {
                handleButtonState();
            }
        });
    }

    private void handleButtonState() {
        changeAllButtonStates(!number1correct || !number2correct);
    }
    private void changeAllButtonStates(boolean state) {
        addbutton.setDisable(state);
        subtractbutton.setDisable(state);
        multiplybutton.setDisable(state);
        dividebutton.setDisable(state);
    }
}
