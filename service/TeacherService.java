package service;

import java.util.ArrayList;
import java.util.List;

import model.Teacher;

public class TeacherService {

    private List<Teacher> teachers = new ArrayList<>();

    public Teacher createTeacher(int id, String name, String lastName) {
        Teacher teacher = new Teacher(id, name, lastName);
        teachers.add(teacher);
        return teacher;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    
}
