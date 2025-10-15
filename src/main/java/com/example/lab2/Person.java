package com.example.lab2;

public class Person {
	public String name;
    public String surname;
    public int age;
    
    public Person(String name, String surname, int age) {
    	this.surname = surname;
    	this.name = name;
    	this.age = age;
    }
    
    @Override
	public boolean equals(Object obj) {
    	if (this == obj) return true;
    	if (obj == null || getClass() != obj.getClass()) return false;
    	Person other = (Person) obj;
        return surname.equals(other.surname) 
        		&& name.equals(other.name) 
        		&& age == other.age;    	
    }
}
