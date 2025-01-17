package model;

import java.time.LocalDate;

import util.UserComporator;

public abstract class User extends UserComporator<User> implements Comparable<User> {

    protected int id;
    protected String name;
    protected String lastName;
    protected LocalDate birthDate;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    @Override
    public int compareTo(User o) {
        return compare(this, o);
    }

    
}
