package com.io;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	  	private static Scanner in = new Scanner(System.in);
	    private static File file = new File("C:/Users/www.abcom.in/eclipse-workspace/Day27/src/com/io/Addressbook.txt");
	    static List<Person> people = new ArrayList<>();

	    public static void main(String[] args) throws IOException {
	        readPeopleFromFile();
	        showMainMenu();
	    }
	    
	
	    private static void addPerson() throws IOException {

	        System.out.println("Enter name: ");
	        String name = in.nextLine();
	        System.out.println("Enter surname: ");
	        String surname = in.nextLine();
	        System.out.println("Enter phone number: ");
	        String phoneNumber = in.nextLine();
	        System.out.println("Enter email: ");
	        String email = in.nextLine();
	        System.out.println("Enter addres: ");
	        String address = in.nextLine();

	        Person person = new Person(name, surname, phoneNumber, email, address);
	        addToFile(person);
	        people.add(person);
	        System.out.println("Added person: "  + person);
	        System.out.println();
	        showMainMenu();
	    }

	    private static void addToFile(Person person) {
	            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
	                writer.write(person.getName()+"\r\n" + person.getSurname() + "\r\n" + person.getPhoneNumber() + "\r\n" + person.getEmail() +
	                "\r\n" + person.getAddress()+"\r\n\r\n");
	            } catch(IOException e) {
	                System.out.println(e);
	            }
	    }

	    private static boolean readPeopleFromFile() throws IOException {
	        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
	            String name = null;
	            while((name = reader.readLine()) != null) {
	                Person person = new Person(name, reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine());
	                people.add(person);    
	                reader.readLine();
	            }
	            return true;
	        }
	        catch ( IOException e) {
	            System.out.println(e);
	        }
	        return false;
	    }

	    private static void showMainMenu() throws IOException {
	        System.out.println("1. Add person");
	        System.out.println("2. Show all contacts");
	        System.out.println("3. Close program");

	        String choice;
	        do {
	            choice = in.nextLine();
	            switch (choice) {
	                case "1":
	                    addPerson();
	                    break;
	                case "2":
	                    System.out.println(people);
	                    System.out.println();
	                    showMainMenu();
	                    break;
	                case "3":
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Enter numer from 1 to 3");
	            }
	        }while(!choice.equals("3"));
	    }
}


