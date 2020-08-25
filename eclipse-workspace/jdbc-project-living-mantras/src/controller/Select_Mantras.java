package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.MantrasDAO;

public class Select_Mantras {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	MantrasDAO mantrasdao = new MantrasDAO();
	byte choice;
	
//method to select choice for stress relief
	public void choice_of_stress() throws IOException, ClassNotFoundException, SQLException {
		do {	
		System.out.println("#------------------------------------------------------#");
		System.out.println("   <<<   Select Your Choice For Stress Relief   >>>");
		System.out.println("#------------------------------------------------------#");
		System.out.println("\t\t 1. Meditation\n\t\t 2. Art Of Living\n\t\t 3. Health Services\n\t\t 4. Tips\n\t\t 5. Exit");
		System.out.print("\t\t Enter Your Choice :");
		choice = Byte.parseByte(br.readLine());
		System.out.println("\n");
		switch(choice) {
		case 1:
			meditation();break;
		case 2:
			art_of_living();break;
		case 3:
			healthservices();break;
		case 4:
			mantrasdao.tips();break;
		case 5:
			return;
		default:System.out.println("\t  Please select a valid option ");
		}
		} while(true);
	}
	
//method for meditation
	public void meditation() throws IOException, ClassNotFoundException, SQLException {
		do {
		System.out.println("#-------------------------------------------------------------#");
		System.out.println("  <<<   Select The Meditation Which Is Helpfull For You   >>>");
		System.out.println("#-------------------------------------------------------------#");
		System.out.println("\t\t 1. Mindfulness Meditation ");
		System.out.println("\t\t 2. Spiritual Meditation ");
		System.out.println("\t\t 3. Focused Meditation ");
		System.out.println("\t\t 4. Movement Meditation ");
		System.out.println("\t\t 5. Mantra Meditation ");
		System.out.println("\t\t 6. Exit ");
		System.out.print("\t\t Enter Your Choice :");
		choice = Byte.parseByte(br.readLine());
		System.out.println("\n");
		switch(choice) {
		case 1:
			mantrasdao.mindfulness();break;
		case 2:
			mantrasdao.spiritual();break;
		case 3:
			mantrasdao.focused();break;
		case 4:
			mantrasdao.movement();break;
		case 5:
			mantrasdao.mantra();break;
		case 6:
			return;
		default:
			System.out.println("\t  Please select a valid option ");
		}
		}while(true);
	}
	
//method for art_of_living
	public void art_of_living() throws IOException, ClassNotFoundException, SQLException {
		do {
		System.out.println("#----------------------------------------------------#");
		System.out.println("<<<   Select The Option To Know The Details  >>>");
		System.out.println("#----------------------------------------------------#");
		System.out.println("\t\t 1. What Is ART_OF_LIVING ? \n\t\t 2. To Do List \n\t\t 3. Exit ");
		System.out.print("\t\t Enter Your Choice :");
		choice = Byte.parseByte(br.readLine());
		System.out.println("\n");
		switch(choice) {
		case 1:
			mantrasdao.def_art_of_living();break;
		case 2:
			mantrasdao.todolist();break;
		case 3:
			return;
		default:
			System.out.println("\t  Please select a valid option ");
		}
		}while(true);
	}
	
//method for healthservices
	public void healthservices() throws IOException, ClassNotFoundException, SQLException {
		do {
		System.out.println("#---------------------------------------------------#");
		System.out.println("<<<   Select The Option To Know The Details  >>>");
		System.out.println("#---------------------------------------------------#");
		System.out.println("\t\t 1. Getting help for Stress\n\t\t 2. Where to get help ?\n\t\t 3. Common Supplements\n\t\t 4. Exit ");
		System.out.print("\t\t Enter Your Choice :");
		choice = Byte.parseByte(br.readLine());
		System.out.println("\n");
		switch(choice) {
		case 1:
			mantrasdao.getting_help();break;
		case 2:
			mantrasdao.helplines();break;
		case 3:
			mantrasdao.suppliments();break;
		case 4:
			return;
		default:
			System.out.println("\t  Please select a valid option ");
		}
		}while(true);
	}
}
