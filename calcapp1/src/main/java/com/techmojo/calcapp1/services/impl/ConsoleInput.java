package com.techmojo.calcapp1.services.impl;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.techmojo.calcapp1.services.Operations;
@Component
public class ConsoleInput implements Operations {
	public double a,b;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER:\t");
        this.a = scan.nextDouble();
        System.out.print("ENTER SECOND NUMBER:\t");
        this.b = scan.nextDouble();
        scan.close();
	}
	@Override
	public double add() {
		return a+b;
	}
	@Override
	public double sub() {
		return a-b;
	}
	@Override
	public double mul() {
		return a*b;
	}
	@Override
	public double div() {
		return a/b;
	}
}