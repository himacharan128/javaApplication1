package com.techmojo.calcapp1.pojo;

import org.springframework.stereotype.Component;

import com.techmojo.calcapp1.services.Operations;
import com.techmojo.calcapp1.services.impl.Options1;
@Component
public class PrintRes {
	public void Print(Options1 option, Operations obj) {
		switch (option) {
			case ADDITION:
				System.out.println("RESULT = " + obj.add());
				break;
			case SUBTRACTION:
				System.out.println("RESULT = " + obj.sub());
				break;
			case MULTIPLICATION:
				System.out.println("RESULT = " + obj.mul());
				break;
			case DIVISION:
				System.out.println("RESULT = " + obj.div());
				break;
				}
		}
}