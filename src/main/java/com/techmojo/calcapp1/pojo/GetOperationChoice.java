package com.techmojo.calcapp1.pojo;

import java.util.Scanner;

import org.springframework.stereotype.Component;
@Component
public class GetOperationChoice {
	Scanner scan = new Scanner(System.in);
	public int  getchoice() {
		return scan.nextInt()-1;
	}
}