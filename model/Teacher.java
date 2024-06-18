package model;

public class Teacher extends User {


    public Teacher(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%d, name=%s, lastName=%s]", id, name, lastName);
    }
    
    
}
