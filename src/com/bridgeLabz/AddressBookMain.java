package com.bridgeLabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to AddressBook master branch");

        MultipleAddressBook obj = new MultipleAddressBook();

        while (true) {
            System.out.println("Enter \n 1. Add  new AddressBook\n 2. Add contact in AddressBook\n "
                    + "3. edit the contact in AddressBook\n 4. delete the contact in AddressBook\n " +
                    "5. delete the AddressBook\n 6. Print the AddressBook\n 7. Print the contacts in AddressBook\n " +
                    "8. Search Contact by city\n 9. Search Contact by state\n 0. To exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    obj.addAddressBook();
                    break;
                case 2:
                    obj.addContact();
                    break;
                case 3:
                    obj.editContactInBook();
                    break;
                case 4:
                    obj.deleteContactInBook();
                    break;
                case 5:
                    obj.deleteAddressBook();
                    break;
                case 6:
                    obj.printBook();
                    break;
                case 7:
                    obj.printContactsInBook();
                    break;
                case 8:
                    System.out.println("Please enter the city ");
                    Scanner s1 = new Scanner(System.in);
                    String city = s1.next();
                    obj.searchCity(city);
                    break;
                case 9:
                    System.out.println("Please enter the state ");
                    Scanner s2 = new Scanner(System.in);
                    String state = s2.next();
                    obj.searchState(state);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong input Please enter again");
            }
        }
    }
}
