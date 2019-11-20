package ExceptionsHomework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    private static List<Contacts> contactsArrayList = new ArrayList<>();
    private static String textMessage = "List of available commands: \n" +
            "addCont - Add contact \n" +
            "listCont - List of contact \n" +
            "exit - Exit this program";

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        boolean terMenu = true;
        contactsArrayList = getContacts();
        System.out.println();

        do {
            System.out.println(textMessage);
            Scanner scanner = new Scanner(System.in);
            String command1 = scanner.next();
            switch (command1) {
                case "addCont":
                    try {
                        addCont();
                    } catch (DuplicatesException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println(textMessage);
                    break;
                case "listCont":
                    listCont();
                    System.out.println("\n" + textMessage);
                    break;
                case "exit":
                    terMenu = false;
                    break;
                default:
                    System.out.println("Not found this command. \n" + textMessage);
                    break;
            }

        } while (terMenu);
        System.out.println("Pokeda");
    }

    private static List<Contacts> getContacts() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Contacts.txt"));
            contactsArrayList = (ArrayList<Contacts>) ois.readObject();
        } catch (Exception e) {
            System.out.println("The Contacts.txt file does not exist or is empty.");
        }
        return contactsArrayList;
    }

    private static void addCont() throws DuplicatesException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the surname of the man: ");
        String surname = sc.next();
        System.out.println("Enter the firstName of the man: ");
        String firstName = sc.next();
        System.out.println("Enter the phoneNumber of the man: ");
        String phoneNumber = sc.next();
        System.out.println("Enter the type of the man: ");
        String type = sc.next();
        boolean param = true;
        for (Contacts contacts : contactsArrayList) {
            if (surname.equals(contacts.getSurname()) & (firstName.equals(contacts.getFirstName()) & (phoneNumber.equals(contacts.getPhoneNumber())))) {
                param = false;
            }
        }
        if (param) {
            contactsArrayList.add(new Contacts.Builder()
                    .surname(surname)
                    .firstName(firstName)
                    .phoneNumber(phoneNumber)
                    .type(type)
                    .build());
            writeFile();
        } else {
            throw new DuplicatesException("This contact is already on the list!\n");
        }
    }

    private static void listCont() {
        System.out.println("List of contacts: \n");
        int i = 0;
        for (Contacts k : contactsArrayList) {
            i++;
            System.out.println(i + "." + k.getSurname() + " " + k.getFirstName() + " " +
                    k.getPhoneNumber() + " " + k.getType());
        }
    }

    private static void writeFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Contacts.txt"))) {
            oos.writeObject(contactsArrayList);
            System.out.println("Success \n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





