import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EncryptionProgram {
	
	private Scanner scanner;
	
	private Random random;
	
	private ArrayList<Character> list;
	
	private ArrayList<Character> shuffledList;
	
	private char character;
	
	private String line;
	
	private char[] letters;
	
	
	EncryptionProgram() {
		
		scanner = new Scanner(System.in);
				
		list = new ArrayList();
		
		shuffledList = new ArrayList();
		
		character = ' ';
		
		newKey();
		askQuestion();
	}
		private void askQuestion() {
				
			while(true) {
				System.out.println("***************************************************");
				System.out.println("What do you want to do?");
				System.out.println("(N)ew Key, (G)et Key, (E)ncrypt, (D)ecrypt, (Q)uit");
				
				//take the response and read the first letter
				char response = Character.toUpperCase(scanner.nextLine().charAt(0));
				
				switch(response) {
				case 'N':
					newKey();
					break;
				case 'G':
					getKey();
					break;
				case 'E':
					encrypt();
					break;
				case 'D':
					decrypt();
					break;
				case 'Q':
					quitProgram();
					break;
				default:
					System.out.println("Not a valid answer!");
				
				}
			}
			
		}
		
		private void newKey() {
			//gets rid of old key first then creates a new one
			character = ' ';
			list.clear();
			shuffledList.clear();
			
			for(int i=32; i < 127; i++) {
				//32-127 is iterating over ASCII characters
				list.add(Character.valueOf(character));
				character++;
			}
			//make a copy of ArrayList
			shuffledList = new ArrayList(list);
			Collections.shuffle(shuffledList);
			System.out.println("A new key was generated!");
			
		}
		
		private void getKey() {
			System.out.println("Key: ");
			for(Character x : list) {
				//returns all characters in the ASCII table
				System.out.print(x);
			}
			System.out.println();
			for(Character x : shuffledList) {
				//returns all characters from list copied to shuffledList
				System.out.print(x);
			}
			System.out.println();
			
		}
		
		private void encrypt() {
			System.out.println("Enter a message to encrypt: ");
			String message = scanner.nextLine();
			
			letters = message.toCharArray();
			
			for(int i = 0; i < letters.length; i++) {
				//traverse the message and find the ASCII letter
				for(int j = 0; j < list.size(); j++) {
					//retrieve the corresponding shuffled letter
					if(letters[i] == list.get(j)) {
						letters[i]=shuffledList.get(j);
						break;
					}
				}
			}
			System.out.println("Encrypted: ");
			for(char x: letters) {
				System.out.print(x);
			}
			System.out.println();
		}
		
		private void decrypt() {
			System.out.println("Enter a message to decrypt: ");
			String message = scanner.nextLine();
			
			letters = message.toCharArray();
			
			for(int i = 0; i < letters.length; i++) {
				//traverse the message and find the ASCII letter
				for(int j = 0; j < shuffledList.size(); j++) {
					//retrieve the corresponding shuffled letter
					if(letters[i] == shuffledList.get(j)) {
						letters[i]=list.get(j);
						break;
					}
				}
			}
			System.out.println("Encrypted: ");
			for(char x: letters) {
				System.out.print(x);
			}
			System.out.println();
			
		}
		
		private void quitProgram() {
			System.out.println("Have a nice day bro!!");
			System.exit(0);
		
		}
	
	}


