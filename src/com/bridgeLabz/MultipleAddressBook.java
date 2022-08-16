package com.bridgeLabz;

import java.util.*;

public class MultipleAddressBook {

    Map<String, AddressBookMethod> addressBookMap = new HashMap<>();
    List<Contact> contacts = new ArrayList<>();

    public void addAddressBook() {
        System.out.println("Enter Name of new Address Book: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        if (addressBookMap.containsKey(bookName)) {
            System.out.println("Address book with this name exists, Enter new name.");
            addAddressBook();
        } else {
            AddressBookMethod addressBook = new AddressBookMethod();
            addressBookMap.put(bookName, addressBook);
            System.out.println("Address Book " + bookName + " successfully added!!");
        }
    }
    public void addContact() {
        System.out.println("Enter the name of Address book to add the contact.");
        Scanner scanner = new Scanner(System.in);
        String newContact = scanner.nextLine();
        if (addressBookMap.get(newContact) == null) {
            System.out.println("No book found");

        } else {
            addressBookMap.get(newContact).addContacts();
        }
    }
    public void editContactInBook() {
        System.out.println("Enter Name of Address Book you want to edit: ");
        Scanner scanner = new Scanner(System.in);
        String editBookName = scanner.next();
        if (addressBookMap.containsKey(editBookName)) {
            addressBookMap.get(editBookName).editContact();
        } else {
            System.out.println("AddressBook doesn't exist, Please enter correct name.");
            editContactInBook();
        }
    }
    public void deleteAddressBook() {
        System.out.println("Enter Name of Address Book you want to delete: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        if (addressBookMap.containsKey(bookName)) {
            addressBookMap.remove(bookName);
        } else {
            System.out.println("AddressBook doesn't exist, Please enter correct name.");
            deleteAddressBook();
        }
    }
    public void deleteContactInBook() {
        System.out.println("Enter Name of Address Book you want to delete the contacts in it: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        if (addressBookMap.containsKey(bookName)) {
            addressBookMap.get(bookName).deleteContact();
        } else {
            System.out.println("AddressBook doesn't exist, Please enter correct name.");
            deleteContactInBook();
        }
    }
    public void printBook() {
        System.out.println("These are AddressBooks in program.");
        for (String book : addressBookMap.keySet()) {
            System.out.println(book);
        }
    }
    public void printContactsInBook() {
        for (String i : addressBookMap.keySet()) {
            System.out.println(i);
            System.out.println(addressBookMap.get(i).list);
        }
        System.out.println(" ");
    }
    public void searchCity(String city){
        for (String name : addressBookMap.keySet())
            addressBookMap.get(name).searchByCity(city);
    }
    public void searchState(String state){
        for (String name : addressBookMap.keySet())
            addressBookMap.get(name).searchByState(state);
    }
}
