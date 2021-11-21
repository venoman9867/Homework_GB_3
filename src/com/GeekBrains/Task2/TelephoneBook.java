package com.GeekBrains.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneBook{
    private Map<String,List<String>> phoneBook;
    public TelephoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String families,String number){
        if(phoneBook.containsKey(families)){
            phoneBook.get(families).add(number);
        }else{
            phoneBook.put(families, new ArrayList<>(){
            });
            phoneBook.get(families).add(number);
        }
    }
    public List<String> get(String families){
        return phoneBook.get(families);
    }
}
