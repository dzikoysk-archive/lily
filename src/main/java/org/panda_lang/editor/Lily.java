package org.panda_lang.editor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Lily extends Application {

    public static Lily instance;
    private Stage stage;
    private Interface anInterface;

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        instance = this;

        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/interface.fxml"));
        Scene scene = new Scene(root, bounds.getWidth() - 20, bounds.getHeight() * 0.5);
        root.getStylesheets().add("/css/material.css");

        stage.setWidth(bounds.getWidth() - 20);
        stage.setHeight(bounds.getHeight() * 0.8);
        stage.setX((bounds.getWidth() - stage.getWidth()) / 2);
        stage.setY((bounds.getHeight() - stage.getHeight()) / 2);

        stage.setTitle("Lily");
        stage.setScene(scene);

        stage.show();
    }

    protected void initAnInterface(Interface anInterface) {
        this.anInterface = anInterface;
    }

    public Interface getInterface() {
        return this.anInterface;
    }

    public Stage getStage() {
        return this.stage;
    }


    public static void main(String[] args) throws Exception {
        launch(args);
    }

}