package com.techmojo.trainingApp1;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techmojo.trainingApp1.services.impl.ConsoleInput;
import com.techmojo.trainingApp1.services.impl.ProperityFile;
import com.techmojo.traningApp1.services.Operations;

import java.io.IOException;
import java.util.*;
@SpringBootApplication
public class CalculatorAppApplication {
	
	
	public static void printRes(int oper, Operations obj1) {
		switch(oper) {
			case 1://ADDITION
				System.out.println("RESULT = "+obj1.add());
				break;
			case 2://SUBSTRACTION
				System.out.println("RESULT = "+obj1.sub());
				break;
			case 3://MULTIPLICATION
				System.out.println("RESULT = "+obj1.mul());
				break;
			case 4://DIVISION
				System.out.println("RESULT = "+obj1.div());
				break;
		}
	}
	
	
	public static void printMenu() {
		System.out.print("\n1\tADDITION"
						+ "\n2\tSUBSTRACTION"
						+ "\n3\tMULTIPLICATION"
						+ "\n4\tDIVISION"
						+ "\nSELECT OPERATION :\t");
	}
	
	
	public static void main(String[] args)throws IOException {
		System.out.print("\tCALCULATOR");
		Scanner scan = new Scanner(System.in);
		System.out.print( "\n1\tCONSOLE INPUT"
						+ "\n2\tPROPERITY FILE"
						+ "\n3\tAPI CALL"
						+ "\nSELECT OPERATION :\t");
		int MainOption = scan.nextInt();
		switch(MainOption) {
			case 1://CONSOLE INPUT
				Operations obj1= new ConsoleInput();
				printMenu();
				int oper = scan.nextInt();
				printRes(oper,obj1);
				break;
			case 2://FILE
				Operations obj2= new ProperityFile();
				printMenu();
				int oper1 = scan.nextInt();
				printRes(oper1,obj2);
				break;
			case 3://API CALL
				break;
			default:
				System.out.println("INVALID INPUT\nPLEASE TRY AGAIN");
			}
		scan.close();
	}
}