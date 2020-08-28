import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StringList {
	
	public static void main(String[] args) {
		//Created a new string list that is pre-filled with strings.
		String[] newList = {"Romeo & Juliet", "Platoon", "Kate & Leopold", "Poltergeist III",
				"Harold and Kumar Go to White Castle", "Clerks II"};
		
		/*Created a loop to iterate through the list and look for the character "&" 
		then if the for loop found "&" it would replace it with "and" and print out the 
		current result of the list*/
		for(int i = 0; i < newList.length; i++) {
			newList[i] = newList[i].replace("&", "and");
			System.out.println(newList[i]);
		}
		System.out.println("--------------------------------------------");
		
		arrayList();
		
	}
	
	public static void arrayList() {
		
		//Created a ArrayList called currentList
		ArrayList <String> currentList = new ArrayList<String>();
		
		//Added Strings into the list.
		currentList.add("Romeo & Juliet");
		currentList.add("Platoon");
		currentList.add("Kate & Leopold");
		currentList.add("Poltergeist III");
		currentList.add("Harold and Kumar Go to White Castle");
		currentList.add("Clerks II");
		
		//Printed out the list to make sure it worked right.
		System.out.println("Original List: " + currentList);
		
		/*Set a 'for loop' to go through the ArrayList and used set to try to replace the & element using
		get(i) is to access the element at that count and .replace is to replace & with and. */
		for (int i = 0; i < currentList.size(); i++) {
				currentList.set(i, currentList.get(i).replace("&", "and"));
			}
		//Then print out the new set list.
			System.out.println("Edited List: " + currentList);			
	}

}
