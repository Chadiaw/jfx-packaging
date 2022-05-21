package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");

        String text = String.format("Hello, JavaFX %s, running on Java %s", javafxVersion, javaVersion);
        welcomeText.setText(text);
    }
}