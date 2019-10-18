package com.arraylist;

import java.util.Scanner;

public class MobilePhone {

    private static Contacts contacts = new Contacts();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            printInstruction();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    modifyContactNumber();
                    break;
                case 3:
                    modifyContactName();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    displayList();
                    break;
                case 7:
                    quit = true;
            }
        }
    }

    public static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To add new contact.");
        System.out.println("\t 2 - To modify contact number.");
        System.out.println("\t 3 - To modify contact name.");
        System.out.println("\t 4 - To remove contact details.");
        System.out.println("\t 5 - To search for contact details.");
        System.out.println("\t 6 - To display contact list");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void addNewContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter contact number");
        int number = scanner.nextInt();
        scanner.nextLine();
        contacts.addContactDetails(name, number);
    }

    public static void modifyContactNumber() {
        System.out.println("Enter contact name which number need to modify");
        String name = scanner.nextLine();
        System.out.println("Enter new mobile number");
        int number = scanner.nextInt();
        scanner.nextLine();
        contacts.updateContact(name, number);
    }

    public static void modifyContactName() {
        System.out.println("Enter contact name");
        String name = scanner.nextLine();
        System.out.println("Enter new name");
        String newName = scanner.nextLine();
        contacts.updateContact(name, newName);
    }

    public static void removeContact() {
        System.out.println("Enter contact name");
        String name = scanner.nextLine();
        contacts.removeContact(name);
    }

    public static void findContact() {
        System.out.println("Enter contact name");
        String name = scanner.nextLine();
        contacts.searchContact(name);
    }

    private static void displayList() {
        contacts.displayContactsDetails();
    }
}
