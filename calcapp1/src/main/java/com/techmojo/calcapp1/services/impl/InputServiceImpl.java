package com.techmojo.calcapp1.services.impl;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.techmojo.calcapp1.pojo.PrintMainMenu;
import com.techmojo.calcapp1.pojo.PrintMenu;
import com.techmojo.calcapp1.pojo.PrintRes;
import com.techmojo.calcapp1.services.Operations;
@Component
public class InputServiceImpl {
	@Autowired
	PrintMainMenu obj1;
	@Autowired
	PrintMenu obj2;
	Options1 enum_obj;
	@Autowired
	PrintRes obj4;
	@Autowired
	ConsoleInput consoleInput_obj;
	@Autowired
	ProperityFile ProperityFile_obj;
	@EventListener(ApplicationReadyEvent.class)
	public void InputLogic() {
		Scanner scan = new Scanner(System.in);
		System.out.print("\tCALCULATOR");
		obj1.Print();
		int mainOption = scan.nextInt();
		Operations operation = null;
		switch (mainOption) {
		case 1: // CONSOLE INPUT
			operation = consoleInput_obj;
			break;
		case 2: // FILE
			operation = ProperityFile_obj;
		case 3: // API CALL
			break;
		default:
			System.out.println("INVALID INPUT\nPLEASE TRY AGAIN");
		}
		obj2.Print();
		int i=scan.nextInt()-1;
		enum_obj = Options1.values()[i];
		obj4.Print(enum_obj, operation);
		scan.close();
	}
}
