package com.techmojo.calcapp1.pojo;

import org.springframework.stereotype.Component;

@Component
public class PrintMainMenu {
	public void Print() {
		System.out.print("\n1\tCONSOLE INPUT"
				+ "\n2\tPROPERTIES FILE"
				+ "\n3\tAPI CALL\n"
				+ "\nSELECT OPERATION :\t");
	}
}