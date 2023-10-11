package Controler;

import Data.*;
import Service.DataService;
import Service.StudyGroupService;
import View.StudentView;
import View.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    private Teacher teacher;
    private List<Student> students;
    private StudyGroupService studyGroupService = new StudyGroupService(teacher, students);


    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }


    public void createNewStudyGroup() {
        List<Student> studentList = new ArrayList<>();
        Teacher teacher = new Teacher("100", "100", "100", "100", 100);
        Student student1 = new Student("5", "5", "5", "5", 5);
        Student student2 = new Student("6", "6", "6", "6", 6);
        studentList.add(student1);
        studentList.add(student2);
        StudyGroup studyGroup = studyGroupService.getStudyGroup(teacher, studentList);
        System.out.println(studyGroup);
    }
}
