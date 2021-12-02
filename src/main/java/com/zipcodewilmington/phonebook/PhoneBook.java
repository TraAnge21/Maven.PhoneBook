package com.zipcodewilmington.phonebook;

import java.lang.reflect.Array;
import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */

public class PhoneBook {
//    final
    private Map<String, List<String>> phoneBook;
//    List < String> phoneList = new ArrayList<>();

    public PhoneBook() {

        this.phoneBook= new LinkedHashMap<>();

    }

    public PhoneBook(Map<String, List<String>> map) {

//        this.phonebook= new phonebook();
        this.phoneBook =map;
    }



    // adds an entry to the composite associate data type
    public void add(String name, String phoneNumber) {

        map.put(name, Arrays.asList(phoneNumber));
        phoneList.add(phoneNumber);
    }


    // adds many phone numbers to a single name entry
    public void addAll(String name, String... phoneNumbers) {
        map.put(name, Arrays.asList(phoneNumbers));
    }


    // removes an entry to the composite associate data type
    public void remove(String name) {
        map.remove(name);

    }


    // check if the hashmap has a specific name or entry/key
    public Boolean hasEntry(String name) {
       if (map.containsKey(name)) {
           return true;
       }
        return false;
    }


    // returns a phone number for the respective input name
    public List<String> lookup(String name) {
        return  map.get(name);
    }


    // returns a name for the respective input phoneNumber
    public String reverseLookup(String phoneNumber) {

//        for (String name : phonebook.keySet()) {
//            if (phoneNumber.equals(phonebook.get(name))) {
//                return name;
//            }
//        }
//        return null;
//    }

        String key = "";
        for (Map.Entry <String, List<String>> entry : map.entrySet()) {
            key = entry.getKey();
        }
        return key;
    }



    // returns a list of all names in this PhoneBook
    public List<String> getAllContactNames() {

        return null;
    }


    public Map<String, List<String>> getMap() {

        return null;
    }
}
