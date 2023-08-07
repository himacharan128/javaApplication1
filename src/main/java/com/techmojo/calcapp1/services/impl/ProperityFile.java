package com.techmojo.calcapp1.services.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.stereotype.Component;

import com.techmojo.calcapp1.services.Operations;
@Component
public class ProperityFile implements Operations {
	public double a,b;
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
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double sub() {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mul() {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div() {
		// TODO Auto-generated method stub
		return a/b;
	}

}
