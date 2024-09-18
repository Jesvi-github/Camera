package com.example.camera;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    @FXML
    private ChoiceBox make ;

    @FXML
    private ChoiceBox os;

    @FXML
    private TextField model;

    @FXML
    private TextField screenSize;

    @FXML
    private TextField frontCamera;

    @FXML
    private TextField rearCamera;

    @FXML
    private TextField price;

    @FXML
    private Slider memory;

    @FXML
    private Button chooseImage;

    public HelloController(String make, String os, String model, String screenSize, String frontCamera, String rearCamera, String price, double memory) {
        setMake(make);
        setOs(os);
        setModel(model);
        setScreenSize(screenSize);
        setFrontCamera(frontCamera);
        setRearCamera(rearCamera);
        setPrice(price);
        setMemory(memory);
    }


    public void setMake(String make) {
        if (make == null || make.isEmpty()) {
            throw new IllegalArgumentException("Make cannot be null or empty.");
        }
        this.make.setValue(make);
    }

    public void setOs(String os) {
        if (os == null || os.isEmpty()) {
            throw new IllegalArgumentException("OS cannot be null or empty.");
        }
        this.os.setValue(os);
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        this.model.setText(model);
    }

    public void setScreenSize(String screenSize) {
        if (screenSize == null || screenSize.isEmpty()) {
            throw new IllegalArgumentException("Screen size cannot be null or empty.");
        }
        this.screenSize.setText(screenSize);
    }

    public void setFrontCamera(String frontCamera) {
        if (frontCamera == null || frontCamera.isEmpty()) {
            throw new IllegalArgumentException("Front camera cannot be null or empty.");
        }
        this.frontCamera.setText(frontCamera);
    }

    public void setRearCamera(String rearCamera) {
        if (rearCamera == null || rearCamera.isEmpty()) {
            throw new IllegalArgumentException("Rear camera cannot be null or empty.");
        }
        this.rearCamera.setText(rearCamera);
    }

    public void setPrice(String price) {
        if (price == null || price.isEmpty()) {
            throw new IllegalArgumentException("Price cannot be null or empty.");
        }
        this.price.setText(price);
    }

    public void setMemory(double memory) {
        if (memory < 0) {
            throw new IllegalArgumentException("Memory cannot be negative.");
        }
        this.memory.setValue(memory);
    }


}