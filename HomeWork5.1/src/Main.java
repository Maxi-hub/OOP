import Controler.Controller;
import Data.Student;
import Data.StudyGroup;
import Data.Teacher;
import Service.StudyGroupService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("1", "1","1","1");
        controller.createStudent("2", "2","2","2");
        controller.getAllStudent();
        controller.createStudent("3", "3","3","3");
        controller.createStudent("4", "4","4","4");
        controller.getAllStudent();

        controller.createNewStudyGroup();
    }
}