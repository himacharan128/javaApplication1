package com.techmojo.trainingApp1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techmojo.trainingApp1.services.impl.ConsoleInput;
import com.techmojo.trainingApp1.services.impl.ProperityFile;
import com.techmojo.traningApp1.services.Operations;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class CalculatorAppApplication {
	public static void printRes(Options operation, Operations obj) {
		switch (operation) {
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

	public static void printMenu() {
		System.out.print("\n1\tADDITION"
				+ "\n2\tSUBTRACTION"
				+ "\n3\tMULTIPLICATION"
				+ "\n4\tDIVISION\n"
				+ "\nSELECT OPERATION :\t");
	}

	public static void main(String[] args) throws IOException {
		System.out.print("\tCALCULATOR");
		Scanner scan = new Scanner(System.in);
		System.out.print("\n1\tCONSOLE INPUT"
				+ "\n2\tPROPERTIES FILE"
				+ "\n3\tAPI CALL\n"
				+ "\nSELECT OPERATION :\t");
		int mainOption = scan.nextInt();

		Options operation = null;

		switch (mainOption) {
			case 1: // CONSOLE INPUT
				operation = Options.values()[getOperationChoice(scan)];
				Operations obj1 = new ConsoleInput();
				printRes(operation, obj1);
				break;
			case 2: // FILE
				operation = Options.values()[getOperationChoice(scan)];
				Operations obj2 = new ProperityFile();
				printRes(operation, obj2);
				break;
			case 3: // API CALL
				break;
			default:
				System.out.println("INVALID INPUT\nPLEASE TRY AGAIN");
		}
		scan.close();
	}

	public static int getOperationChoice(Scanner scan) {
		printMenu();
		return scan.nextInt() - 1;
	}
}

/*
 * package com.techmojo.trainingApp1;
 * import org.springframework.boot.autoconfigure.SpringBootApplication;
 * 
 * import com.techmojo.trainingApp1.services.impl.ConsoleInput;
 * import com.techmojo.trainingApp1.services.impl.ProperityFile;
 * import com.techmojo.traningApp1.services.Operations;
 * 
 * import java.io.IOException;
 * import java.util.*;
 * 
 * @SpringBootApplication
 * public class CalculatorAppApplication {
 * public static void printRes(int option, Operations obj) {
 * switch(option) {
 * case 1://ADDITION
 * System.out.println("RESULT = "+obj.add());
 * break;
 * case 2://SUBSTRACTION
 * System.out.println("RESULT = "+obj.sub());
 * break;
 * case 3://MULTIPLICATION
 * System.out.println("RESULT = "+obj.mul());
 * break;
 * case 4://DIVISION
 * System.out.println("RESULT = "+obj.div());
 * break;
 * }
 * }
 * public static void printMenu() {
 * System.out.print("\n1\tADDITION"
 * + "\n2\tSUBSTRACTION"
 * + "\n3\tMULTIPLICATION"
 * + "\n4\tDIVISION"
 * + "\nSELECT OPERATION :\t");
 * }
 * public static void main(String[] args)throws IOException {
 * System.out.print("\tCALCULATOR");
 * Scanner scan = new Scanner(System.in);
 * System.out.print( "\n1\tCONSOLE INPUT"
 * + "\n2\tPROPERITY FILE"
 * + "\n3\tAPI CALL"
 * + "\nSELECT OPERATION :\t");
 * int MainOption = scan.nextInt();
 * switch(MainOption) {
 * case 1://CONSOLE INPUT
 * Operations obj1= new ConsoleInput();
 * printMenu();
 * int oper = scan.nextInt();
 * printRes(oper,obj1);
 * break;
 * case 2://FILE
 * Operations obj2= new ProperityFile();
 * printMenu();
 * int oper1 = scan.nextInt();
 * printRes(oper1,obj2);
 * break;
 * case 3://API CALL
 * break;
 * default:
 * System.out.println("INVALID INPUT\nPLEASE TRY AGAIN");
 * }
 * scan.close();
 * }
 * }
 */