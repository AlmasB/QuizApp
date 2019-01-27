package com.almasb.quiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class QuizApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }

    public static class Launcher {
        public static void main(String[] args) {
            Application.launch(QuizApp.class, args);
        }
    }
}
