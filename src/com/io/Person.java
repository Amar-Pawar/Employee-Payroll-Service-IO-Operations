package com.io;

public class Person {
	 
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String address;

    Person(String name, String surname, String phoneNumber, String email, String address) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
 
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    String getEmail() {
        return email;
    }

    String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "\nName: " + getName() + "\nSurname: " + getSurname() + "\nPhone number: " + getPhoneNumber() + "\nEmail: " +
                getEmail() + "\nAddress: " + getAddress()+"\n";
    }
    }
