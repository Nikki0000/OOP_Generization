import java.util.List;

import controller.StudentController;
import controller.TeacherController;
import model.Student;
import service.TeacherService;

public class Main {
    public static void main(String[] args) {
        
        new StudentController()
            .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"), 
                new Student(2  , "Ira", "Ivanova")));


        TeacherService teacherService = new TeacherService();

        TeacherController teacherController = new TeacherController(teacherService);

        teacherService.createTeacher(3, "Tamara", "Stepanovna");
        teacherService.createTeacher(4, "Svetlana", "Sidorova");

        teacherController.sendOnConsole();


    }

}
