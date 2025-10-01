package com.example.lab2;

import java.lang.reflect.Type;

import com.google.gson.*;

public class App 
{
    public static void main( String[] args )
    {
    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
    	Person p1 = new Person("Andrew", "Smith", 35);
    	String jsonP1 = gson.toJson(p1);
    	System.out.println(jsonP1);
    	Person p2 = gson.fromJson(jsonP1, Person.class);
    	System.out.println(p1.equals(p2));
    }
}
