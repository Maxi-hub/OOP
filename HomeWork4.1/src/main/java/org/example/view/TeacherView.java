package org.example.view;

import org.example.data.StudentGroup;
import org.example.data.Teacher;
import org.example.data.TeacherGroup;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{

    Logger logger = Logger.getLogger(StudentView.class.getName());
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher.toString());
        }
    }

    public void sendOnConsoleUserGroup(TeacherGroup teacherGroup){
        logger.info(teacherGroup.toString());
    }
}
