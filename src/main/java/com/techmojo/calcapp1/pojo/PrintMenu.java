package com.techmojo.calcapp1.pojo;

import org.springframework.stereotype.Component;

@Component
public class PrintMenu {
	public void Print() {
		System.out.print("\n1\tADDITION"
				+ "\n2\tSUBTRACTION"
				+ "\n3\tMULTIPLICATION"
				+ "\n4\tDIVISION\n"
				+ "\nSELECT OPERATION :\t");
	}
}
