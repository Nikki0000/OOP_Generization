package controller;

import java.util.List;

import model.Teacher;
import model.User;
import service.TeacherService;
import view.TeacherView;
import view.UserView;

public class TeacherController implements UserController {
    
    private UserView<Teacher> teacherView;

    private TeacherService teacherService;

    

    public TeacherController(TeacherService teacherService) {
        this.teacherView = new TeacherView();
        this.teacherService = teacherService;
    }

    @Override
    public <T extends User> User createUser(T user) {
        Teacher teacher = (Teacher) user;
        return teacherService.createTeacher(teacher.getId(), teacher.getName(), teacher.getLastName());
    }

    public void sendOnConsole() {
        List<Teacher> teachers = teacherService.getTeachers();
        teacherView.sendOnConsole(teachers);
    }

    

}
