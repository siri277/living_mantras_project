package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dao.StressRelief;

public class Select_Stress {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StressRelief sr = new StressRelief();
	
	public void choice_of_stress() throws IOException {
		byte tips;
		do {	
		System.out.println("#------------------------------------------------------#");
		System.out.println("<<<   Select Your Choice For Stress Relief   >>>");
		System.out.println("#------------------------------------------------------#");
		System.out.println("\t\t 1. Meditation ");
		System.out.println("\t\t 2. Art Of Living ");
		System.out.println("\t\t 3. Health Services");
		System.out.println("\t\t 4. Tips ");
		System.out.println("\t\t 5. Exit");
		System.out.print("\t\t Enter Your Choice :");
		tips = Byte.parseByte(br.readLine());
		System.out.println("\n");
		switch(tips) {
		case 1:
			meditation();break;
		case 2:
			art_of_living();break;
		case 3:
			healthservices();break;
		case 4:
			sr.tips();
			break;
		case 5:
			System.out.println("#============================================#");
			System.out.println("\t\t  THANK YOU ");
			return;
		default:System.out.println("\t  Please select a valid option ");
		}
		} while(true);

	}
	
	public void meditation() throws IOException {
		byte select;
		do {
		System.out.println("#-------------------------------------------------------------#");
		System.out.println("<<<   Select The Meditation Which Is Right For You   >>>");
		System.out.println("#-------------------------------------------------------------#");
		System.out.println("\t\t 1. Mindfulness Meditation ");
		System.out.println("\t\t 2. Spiritual Meditation ");
		System.out.println("\t\t 3. Focused Meditation ");
		System.out.println("\t\t 4. Movement Meditation ");
		System.out.println("\t\t 5. Mantra Meditation ");
		System.out.println("\t\t 6. Exit ");
		System.out.print("\t\t Enter Your Choice :");
		select = Byte.parseByte(br.readLine());
		System.out.println("\n");
		switch(select) {
		case 1:
			sr.mindfulness();
			break;
		case 2:
			sr.spiritual();
			break;
		case 3:
			sr.focused();
			break;
		case 4:
			sr.movement();
			break;
		case 5:
			sr.mantra();
			break;
		case 6:
			System.out.println("#============================================#");
			System.out.println("\t\t  THANK YOU ");
			return;
		default:
			System.out.println("\t  Please select a valid option ");
		}
		}while(true);
	}

	public void art_of_living() throws IOException {
		byte select;
		do {
		System.out.println("#----------------------------------------------------#");
		System.out.println("<<<   Select The Option To Know The Details  >>>");
		System.out.println("#----------------------------------------------------#");
		System.out.println("\t\t 1. What Is ART_OF_LIVING ?");
		System.out.println("\t\t 2. To Do List ");
		System.out.println("\t\t 3. Exit ");
		System.out.print("\t\t Enter Your Choice :");
		select = Byte.parseByte(br.readLine());
		System.out.println("\n");
		switch(select) {
		case 1:
			sr.def_art_of_living();
			break;
	
		case 2:
			sr.todolist();
			break;
		case 3:
			System.out.println("#============================================#");
			System.out.println("\t\t  THANK YOU ");
			return;
		default:
			System.out.println("\t  Please select a valid option ");
		}
		}while(true);
	}

	public void healthservices() throws IOException {
		byte select;
		do {
		System.out.println("#---------------------------------------------------#");
		System.out.println("<<<   Select The Option To Know The Details  >>>");
		System.out.println("#---------------------------------------------------#");
		System.out.println("\t\t 1. Getting help for Stress ");
		System.out.println("\t\t 2. Where to get help ?");
		System.out.println("\t\t 3. Common Supplements ");
		System.out.println("\t\t 4. Exit ");
		System.out.print("\t\t Enter Your Choice :");
		select = Byte.parseByte(br.readLine());
		System.out.println("\n");
		switch(select) {
		case 1:
			sr.getting_help();
			break;
		case 2:
			sr.helplines();
			break;
		case 3:
			sr.suppliments();
			break;
		case 4:
			System.out.println("#============================================#");
			System.out.println("\t\t  THANK YOU ");
			return;
		default:
			System.out.println("\t  Please select a valid option ");
		}
		}while(true);
	}
}
