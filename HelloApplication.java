package com.example.tryui2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


//Loading image from URL
//Image image = new Image(new FileInputStream("url for the image));

        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

        Scene scene = new Scene(root, 320, 240);

        stage.setTitle("Travellism");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        Tourist mazen=new Tourist("mazen","123");
         Program program=new Program();
        program.addPerson(mazen);
        Employee ahmed=new Employee("ahmed","123");
        program.addPerson(ahmed);



    }





}