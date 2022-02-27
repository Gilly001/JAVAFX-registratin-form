package com.devmate.employeeregistration;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Name
        Label nameLabel= new Label( "Name:");
        TextField nameText=new TextField();

        //date of birth
        Label dobLabel=new Label("Date of birth:");
        DatePicker datePicker= new DatePicker();

        //ID number
        Label idLabel=new Label("ID number:");
        TextField idText=new TextField();

        //gender
        Label genderLabel=new Label("Gender:");
        ToggleGroup groupGender=new ToggleGroup();
        RadioButton maleRadio=new RadioButton("Male");
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio=new RadioButton("Female");
        femaleRadio.setToggleGroup(groupGender);

        //professionalism
        Label profLabel=new Label("Profession:");
        TextField profText=new TextField();

        //email address
        Label emailLabel=new Label("Email address:");
        TextField emailText=new TextField();

        //phone number
        Label telLabel=new Label("Tel No:");
        TextField telText= new TextField();

        //register
        Button buttonRegister=new Button("Submit");

        //grid pane
        GridPane gridPane=new GridPane();
        gridPane.setMinSize(500,400);
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(4);
        gridPane.setHgap(4);
        gridPane.setAlignment(Pos.CENTER);

        //arranging elements

        //name
        gridPane.add(nameLabel,0,0);
        gridPane.add(nameText,1,0);

        //date of birth
        gridPane.add(dobLabel,0,1);
        gridPane.add(datePicker,1,1);

        //ID  number
        gridPane.add(idLabel,0,2);
        gridPane.add(idText,1,2);

        //gender
        gridPane.add(genderLabel,0,3);
        gridPane.add(maleRadio,1,3);
        gridPane.add(femaleRadio,2,3);

        //profession
        gridPane.add(profLabel,0,4);
        gridPane.add(profText,1,4);

        //email
        gridPane.add(emailLabel,0,5);
        gridPane.add(emailText,1,5);

        //telephone number
        gridPane.add(telLabel,0,6);
        gridPane.add(telText,1,6);

        //register
        gridPane.add(buttonRegister,1,7);
        //color of grid pane
        gridPane.setStyle("-fx-background-color: AQUA");

        //creating scene object
        Scene scene=new Scene(gridPane);

        //setting title stage
        stage.setTitle("Registration form");
        //add scene to stage
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}