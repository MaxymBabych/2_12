package com.brainacad.oop.testnest1;

/**
 * Created by Maksym.Babych on 13.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook= new MyPhoneBook();
        myPhoneBook.addPhoneNumber("pers1", "87512");
        myPhoneBook.addPhoneNumber("pers2", "654564");
        myPhoneBook.addPhoneNumber("pers3", "654512");
        myPhoneBook.addPhoneNumber("pers4", "6545454512");
        myPhoneBook.addPhoneNumber("pers5", "8754521");

        myPhoneBook.printPhoneBook();

    }
}
