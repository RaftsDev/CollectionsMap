package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        languages.put("Java","High level, object oriented, independent");
        languages.put("Python","interpreted, high-level, object oreinted");
        languages.put("Algol","Algoritmic");
        languages.put("BASIC","For beginners");

        System.out.println(languages.get("BASIC"));

        System.out.println(languages.put("BASIC","From 1980s"));//Get previous value
        System.out.println(languages.put("BASIC","From MS"));

        //Check contain a key
        if(languages.containsKey("Java")){
            System.out.println("languages map contais a key Java: "+languages.get("Java"));
        }

        //Going through all key sets.
        System.out.println("*********** Using keyset() ***********");
        for(String key:languages.keySet()){
            System.out.println("languages map has key: "+key+" with value: "+languages.get(key));
        }
    }
}
