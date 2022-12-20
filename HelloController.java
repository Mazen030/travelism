package com.example.tryui2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class HelloController {
    @FXML
    private Button hotel;

@FXML
private Button flight;
@FXML
private Button tourguide;
@FXML
private Button activities;
@FXML
private Image image;
@FXML
private Button login;
@FXML
private TextField username;
@FXML
private PasswordField password;
@FXML
private Button Homepage;
    @FXML
    private Button Homepage2;
    @FXML
    private Button Homepage3;
    @FXML
    private Button Homepage4;
    @FXML
    void gonext0(MouseEvent event) throws Exception {
        Stage stage=(Stage) login.getScene().getWindow();
        if(username.getText().toString().equals("mazen") && password.getText().toString().equals("123") ){
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }}

    @FXML
    void gonext(MouseEvent event) throws Exception {
        Stage stage=(Stage) hotel.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hotelview.fxml"));

        stage.setScene(new Scene(root));
stage.show();
    }
    @FXML
    void gonext2(MouseEvent event) throws Exception {
        Stage stage=(Stage) flight.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("flightview.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    void gonext3(MouseEvent event) throws Exception {
        Stage stage=(Stage) tourguide.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("tourguideview.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    void gonext4(MouseEvent event) throws Exception {
        Stage stage=(Stage) activities.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("activitiesview.fxml"));

        stage.setScene(new Scene(root));
        stage.show();

    }
@FXML
    void gohome(MouseEvent event)throws Exception{
    Stage stage=(Stage) Homepage.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

    stage.setScene(new Scene(root));
    stage.show();


}
@FXML
    void gohome2(MouseEvent event)throws Exception{
    Stage stage=(Stage) Homepage2.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

    stage.setScene(new Scene(root));
    stage.show();


}
@FXML
void gohome3(MouseEvent event)throws Exception {
        Stage stage = (Stage) Homepage3.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void gohome4(MouseEvent event)throws Exception {
        Stage stage = (Stage) Homepage4.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }

}


