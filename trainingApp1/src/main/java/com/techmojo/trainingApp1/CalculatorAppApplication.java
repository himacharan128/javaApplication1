package com.techmojo.trainingApp1;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techmojo.trainingApp1.services.impl.ConsoleInput;
import com.techmojo.trainingApp1.services.impl.ProperityFile;
import com.techmojo.traningApp1.services.Operations;

import java.io.IOException;
import java.util.*;
@SpringBootApplication
public class CalculatorAppApplication {
	/*public static void printRes(oper, obj1) {
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
	}*/

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
				System.out.print("\n1\tADDITION\n2\tSUBSTRACTION\n3\tMULTIPLICATION\n4\tDIVISION\nSELECT OPERATION :\t");
				int oper = scan.nextInt();
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
				break;
			case 2://FILE
				Operations obj2= new ProperityFile();
				System.out.print("\n1\tADDITION\n2\tSUBSTRACTION\n3\tMULTIPLICATION\n4\tDIVISION\nSELECT OPERATION :\t");
				int oper1 = scan.nextInt();
				switch(oper1) {
					case 1://ADDITION
						System.out.println("RESULT = "+obj2.add());
						break;
					case 2://SUBSTRACTION
						System.out.println("RESULT = "+obj2.sub());
						break;
					case 3://MULTIPLICATION
						System.out.println("RESULT = "+obj2.mul());
						break;
					case 4://DIVISION
						System.out.println("RESULT = "+obj2.div());
						break;
				}
				break;
			case 3://API CALL
				break;
			default:
				System.out.println("INVALID INPUT\nPLEASE TRY AGAIN");
			}
		scan.close();
	}
}