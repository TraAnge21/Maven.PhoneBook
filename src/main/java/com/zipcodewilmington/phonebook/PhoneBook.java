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
        List < String> phoneList=phoneBook.get(name);
        phoneBook.put(name, phoneList);
//        map.put(name, Arrays.asList(phoneNumber));
//        phoneList.add(phoneNumber);
//        Map<String, List<Item>> items = new HashMap<>();
//        items.computeIfAbsent(key, k -> new ArrayList<>()).add(item);

        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }




    // adds many phone numbers to a single name entry
    public void addAll(String name, String... phoneNumbers) {

        List < String> phoneNumbs = new ArrayList<String>(Arrays.asList(phoneNumbers));
//        numbers.add(phoneNumbers);
        phoneBook.put(name, phoneNumbs);


    }

    // removes an entry to the composite associate data type
    public void remove(String name) {
        phoneBook.remove(name);

    }


    // check if the hashmap has a specific name or entry/key
    public Boolean hasEntry(String name) {
       if (phoneBook.containsKey(name)) {
           return true;
       }
        return false;
    }


    // returns a phone number for the respective input name
    public List<String> lookup(String name) {
        return  phoneBook.get(name);
    }


    // returns a name for the respective input phoneNumber
    public String reverseLookup(String phoneNumber) {

//        for (String name : phoneBook.keySet()) {
//            if (phoneNumber.equals(phoneBook.get(name))) {
//                return name;
//            }
//        }
//        return null;
//    }

        String key = "";
        for (Map.Entry <String, List<String>> entry : phoneBook.entrySet()) {
            key = entry.getKey();
        }
        return key;
    }



    // returns a list of all names in this PhoneBook
    public List<String> getAllContactNames() {
        List < String> result = new ArrayList<>(phoneBook.keySet());r
        return result;
    }


    public Map<String, List<String>> getMap() {

        return null;
    }
}
