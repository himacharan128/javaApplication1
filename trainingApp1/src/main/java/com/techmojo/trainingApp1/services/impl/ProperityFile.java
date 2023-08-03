package com.techmojo.trainingApp1.services.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.techmojo.traningApp1.services.Operations;

public class ProperityFile implements Operations {
    private double a, b;
    public ProperityFile() throws IOException {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/input.properties")) {
            properties.load(fileInputStream);
            a = Double.parseDouble(properties.getProperty("operand1"));
            b = Double.parseDouble(properties.getProperty("operand2"));
        }
    }
    @Override
    public double add() {
        return a + b;
    }
    @Override
    public double sub() {
        return a - b;
    }
    @Override
    public double mul() {
        return a * b;
    }
    @Override
    public double div() {
        return a / b;
    }
    public void writeResult() throws IOException {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/input.properties")) {
            properties.load(fileInputStream);
        }
        properties.setProperty("result", String.valueOf(add()));
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/input.properties")) {
            properties.store(fileOutputStream, null);
        }
    }
}
