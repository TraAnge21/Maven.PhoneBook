package com.zipcodewilmington.phonebook;

import java.lang.reflect.Array;
import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;
    ArrayList < String> phoneList = new ArrayList<>();

    public PhoneBook(Map<String, List<String>> map) {

        this.phonebook = new phonebook;
    }

    public PhoneBook() {

        this.phonebook= new LinkedHashMap<>();

    }

    // adds an entry to the composite associate data type
    public void add(String name, String phoneNumber) {

        phonebook.put(name, Arrays.asList(phoneNumber));
        phoneList.add(phoneNumber);
    }

    // adds many phone numbers to a single name entry
    public void addAll(String name, String... phoneNumbers) {

    }

    // removes an entry to the composite associate data type
    public void remove(String name) {

    }

    // removes an entry to the composite associate data type
    public Boolean hasEntry(String name) {

        return null;
    }


    // returns a phone number for the respective input name
    public List<String> lookup(String name) {

        return null;
    }


    // returns a name for the respective input phoneNumber
    public String reverseLookup(String phoneNumber)  {

        return null;
    }

    // returns a list of all names in this PhoneBook
    public List<String> getAllContactNames() {

        return null;
    }

    public Map<String, List<String>> getMap() {

        return null;
    }
}
