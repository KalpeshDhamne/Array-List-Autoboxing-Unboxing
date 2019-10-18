package com.arraylist;

import java.util.ArrayList;

public class Contacts {

    private static ArrayList<String> contactName = new ArrayList<>();
    private static ArrayList<Integer> contactNumber = new ArrayList<>();
    private int index = 0;

    public boolean addContactDetails(String name, int number) {
        int i = this.index;
        contactName.add(i, name);
        contactNumber.add(i, number);
        boolean isNameUpdated = contactName.contains(name);
        boolean isNumberUpdated = contactNumber.contains(number);
        if (isNameUpdated && isNumberUpdated) {
            this.index += 1;
            return true;
        }
        return false;
    }

    private int findContact(String name) {
        return contactName.indexOf(name);
    }

    public void updateContact(String name, int number) {
        int index = findContact(name);
        if (index >= 0) {
            contactNumber.set(index, number);
        }
    }

    public void updateContact(String name, String newName) {
        int index = findContact(name);
        if (index >= 0) {
            contactName.set(index, newName);
        }
    }

    public void removeContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            contactName.remove(index);
            contactNumber.remove(index);
        }
    }

    public void searchContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            System.out.println(contactName.get(index));
            System.out.println(contactNumber.get(index));
        }
    }

    public void displayContactsDetails() {
        for (int i = 0; i < contactName.size(); i++) {
            System.out.println(contactName.get(i) + " " + contactNumber.get(i));
        }
    }
}
