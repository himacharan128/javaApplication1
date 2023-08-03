package com.techmojo.trainingApp1.services.impl;

import com.techmojo.traningApp1.services.Operations;
import java.util.*;
public class ConsoleInput implements Operations{
	public double a,b;
	public ConsoleInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER:\t");
        this.a = scan.nextDouble();
        System.out.print("ENTER SECOND NUMBER:\t");
        this.b = scan.nextDouble();
        //scan.close();
	}
	public double add() {
		return a+b;
	}
	public double sub() {
		return a-b;
	}
	public double mul() {
		return a*b;
	}
	public double div() {
		return a/b;
	}
}