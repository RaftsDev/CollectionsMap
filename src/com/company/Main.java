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
    }
}
