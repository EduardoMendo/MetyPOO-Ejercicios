package org.efmb;

import java.util.HashMap;
import java.util.Map;
import models.Person;

public class Main {
    public static void main(String[] args) {

        //Diccionario
        Map<Integer,String> diccionario = new HashMap<Integer,String>();

        diccionario.put(1, "Joan");
        diccionario.put(2, "Edu");
        diccionario.put(3, "Andrea");
        diccionario.put(4, "Kevin");

        System.out.println(diccionario.get(4));

        Map<String, String> diccionario2 = new HashMap<String, String>();
        diccionario2.put( "Juan", "Kevin");
        diccionario2.put( "Edu", "Angel");
        diccionario2.put( "Eri", "Abi");
        diccionario2.put( "Sharon", "Julian");

        System.out.println(diccionario2.get("Edu"));

        Map<String, Person> list = new HashMap<String, Person>();

        list.put("Juan", new Person("Juan", "Reyes"));


    }
}