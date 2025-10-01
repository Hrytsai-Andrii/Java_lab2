package com.example.lab2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import junit.framework.TestCase;

public class AppTest extends TestCase
{
    public void testApp()
    {
    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
    	Person p1 = new Person("Andrew", "Smith", 35);
    	String jsonP1 = gson.toJson(p1);
    	Person p2 = gson.fromJson(jsonP1, Person.class);
        assertTrue( p1.equals(p2) );
    }
}
