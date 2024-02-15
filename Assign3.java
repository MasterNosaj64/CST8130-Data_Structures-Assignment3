import java.util.Scanner;
/***********************************************************************************
Class:  Assign3
Purpose:  This class contains the menu and is where the program begins execution
Author:   Jason Waid
Course:   CST8130 - Data Structures
Data members:   menuOption : String - Takes the user's input for the menu
Methods: main(): Contains the menu which runs the other methods upon execution     	          
*************************************************************************************/

public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directory dir = new Directory();
		String menuOption = "test";
		Scanner in = new Scanner(System.in);

		while (menuOption != null) {
			System.out.println("Enter c to create a new list");
			System.out.println("\tp to display all lists");
			System.out.println("\ta to add an entry to a list");
			System.out.println("\td to delete from a list");
			System.out.println("\tl to display a list");
			System.out.println("\tf to load lists from file");
			System.out.println("\tq to quit:");

			menuOption = in.next().toLowerCase();

			switch (menuOption) {

			case "c":
				// Create new email list object
				System.out.println("Enter name of list");
				dir.addList(in);
				break;

			case "p":
				// display all email lists
				dir.displayAllLists();
				break;

			case "a":
				// adds an email address to the desired email list
				dir.addAddressToList(in);
				break;

			case "d":
				// delete an email address from a list
				dir.deleteList(in);
				break;

			case "l":
				// display a particular email list
				dir.displayList(in);
				break;

			case "f":
				// use file an input to add emails
				dir.loadList(in);
				break;

			case "q":
				// quit
				menuOption = null;
				break;

			default:
				System.out.println("ERROR - Unknown command");

			}

		}
	}

}
