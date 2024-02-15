import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/***********************************************************************************
Class:  Directory
Purpose:  This class contains a list of linked lists, otherwise known as a "directory"
Author:   Jason Waid
Course:   CST8130 - Data Structures
Data members:   directory : ArrayList<EmailList> 
Methods: Directory() - initializes the directory
		 addList(Scanner in) - adds a new list to the directory
		 addAddressToList(Scanner in) - adds email address to desired list
		 displayAllLists() - Displays all the lists in the directory
		 deleteList() - deletes the defines list
		 displayList(Scanner in) - displays the define list
		 loadList(Scanner in) - loads the list from input
*************************************************************************************/

public class Directory {
	private ArrayList<EmailList> directory;

	public Directory() {
		directory = new ArrayList<EmailList>();
	}

	public void addList(Scanner in) {
		System.out.print("\nEnter the name of the list: ");
		EmailList list = new EmailList(in.next());
		addAddressToList(in);
	}

	public void addAddressToList(Scanner in) {

	}

	public void displayAllLists() {

	}

	public void deleteList(Scanner in) {

	}

	public void displayList(Scanner in) {

	}

	public void loadList(Scanner in) {
		Scanner inFile = null;
		System.out.print("\n\nEnter name of file to process: ");
		File file = new File(in.next());

		if (file.exists()) {
			try {
				inFile = new Scanner(file);
			} catch (FileNotFoundException e) {
				System.err.println("Error - Invalid File Name");
			}
		}
	}

}
