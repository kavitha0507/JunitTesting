package com.example;

import java.util.Objects;


public class User {
    private String name;
    private Address address; // Assuming Address is a placeholder for a defined class in the same package.

    public User(String name, Address address) { // Use the correct Address class.
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)return true;
        if (obj == null || getClass() != obj.getClass())return false;
        User user = (User) obj;
        return name.equals(user.name) && address.equals(user.address);

    }
    @Override
    public int hashCode(){
        return Objects.hash(name, address);
    }

}


