package com.example.demo1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Label nameLabel = new Label("Username:");
        Label nameLabel1 = new Label("Password:");
        Label nameLabel2 = new Label("Full Name:");
        Label nameLabel3 = new Label("E-mail:");
        Label nameLabel4 = new Label("Phone #:");
        Label nameLabel5 = new Label("Date of Birth #:");
        Button buttonRegister = new Button("Register");

        //Text Fields
        TextField nameText = new TextField();
        PasswordField nameText1 = new PasswordField();
        TextField nameText2 = new TextField();
        TextField nameText3 = new TextField();
        TextField nameText4 = new TextField();
        DatePicker datePicker = new DatePicker();
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                System.out.println(nameLabel.getText() + " " + nameText.getText() + '\n' +
                        nameLabel1.getText() + " " + nameText1.getText() + '\n' +
                        nameLabel2.getText() + " " + nameText2.getText() + '\n' +
                        nameLabel3.getText() + " " + nameText3.getText() + '\n' +
                        nameLabel4.getText() + " " + nameText4.getText() + '\n' +
                        nameLabel5.getText() + " " + datePicker.getValue());
            }
        };


        GridPane gridPane = new GridPane();

        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.setMinSize(500, 300);

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);

        gridPane.add(nameLabel1, 0, 1);
        gridPane.add(nameText1, 1, 1);

        gridPane.add(nameLabel2, 0, 2);
        gridPane.add(nameText2, 1, 2);

        gridPane.add(nameLabel3, 0, 3);
        gridPane.add(nameText3, 1, 3);

        gridPane.add(nameLabel4, 0, 4);
        gridPane.add(nameText4, 1, 4);

        gridPane.add(nameLabel5, 0, 5);
        gridPane.add(datePicker, 1, 5);

        gridPane.add(buttonRegister, 1, 6);

        buttonRegister.setOnAction(event);


        Scene scene = new Scene(gridPane);
        stage.setTitle("Lab04 Solution");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
