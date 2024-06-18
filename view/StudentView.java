package view;

import java.util.List;

import model.Student;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> students) {
        System.out.println(students);
    }
    
}
