package com.example.mucjava231javafxbasic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ResponsiveApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(getClass().getResource("/com/example/mucjava231javafxbasic/student-from.fxml"));
        Scene scene = new Scene(root.load(), 400, 300);
        stage.setScene(scene);
        stage.setTitle("Responsive Form Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}