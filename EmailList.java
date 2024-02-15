import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/***********************************************************************************
Class:  EmailList
Purpose:  This class contains an object of a LinkedList
Author:   Jason Waid
Course:   CST8130 - Data Structures
Data members:   name : String - The name of the current list
				eList : LinkedList<EmailAddress> - The object of the linked list
Methods: EmailList(String name) - initial constructor that creates the list and its name  
  	     createList(Scanner in) - Creates a list object
  	     displayList() - Prints the current list
  	     addEmail(Scanner in) - Adds email to list
  	     loadList(Scanner in) - loads the list requested by the user
  	     deleteFromList(Scanner in) - deletes the inputed email from the current list
  	     binarySortAndInsert(ArrayList<EmailList> directory) - sorts and inserts email into list
  	     isGreaterThan(String name) - compares two strings and determines if it is greater or not
  	     isEqual(EmailList elist) - compares two strings and determines if it is equal or not
*************************************************************************************/

public class EmailList {
	private String name;
	private LinkedList<EmailAddress> eList;

	public EmailList(String name) {
		this.name = name;
		eList = new LinkedList<EmailAddress>();
	}

	public void createList(Scanner in) {

	}

	public void displayList(Scanner in) {
		
	}
	
	public void addEmail(Scanner in) {
		boolean power = true;
		
		System.out.print("\nEnter valid email address: ");
		EmailAddress email = new EmailAddress();
		email.addAddress(in, "y");
		
		while (power) {
		System.out.print("\nAnother? y/n");
		
		switch (in.next()){
			case "y":
				addEmail(in);
				break;
			case "n":
				power = false;
				break;
			default:
				System.out.print("\nERROR - Unknown command");
				in.next();
				break;
		}
	}
	}

	public void loadList(Scanner in) {

	}

	public void deleteFromList(Scanner in) {

	}

	// taken from Assign 2 solutions and modified
	public int binarySortAndInsert(ArrayList<EmailList> directory) {
		int high = directory.size() - 1;
		int low = 0;

		while (low <= high) {
			int middle = (high + low) / 2;
			if (directory.get(middle).isGreaterThan(name) == 0)
				return middle;
			if (directory.get(middle).isGreaterThan(name) > 0)
				high = middle - 1;
			else
				low = middle + 1;
		}
		return low;
	}

	// taken from Assign 2 solutions and modified
	public int isGreaterThan(String name) {
		return this.name.compareTo(name);
	}

	// taken from Assign 2 solutions and modified
	public boolean isEqual(EmailList elist) {
		if (this.name.equalsIgnoreCase(elist.name))
			return true;
		else
			return false;
	}

}
