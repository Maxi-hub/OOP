package org.example.service;

import org.example.data.Student;
import org.example.data.Teacher;
import org.example.data.TeacherGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroupService {
    private TeacherGroup teacherGroup;

    public void createTeacherGroup(List<Teacher> teachers) {
        this.teacherGroup = new TeacherGroup(teachers);
    }

    public TeacherGroup getTeachersGroup() { return teacherGroup; }

    public Teacher getTeacherFromTeacherGroup(String firstName, String secondName){
        Iterator<Teacher> iterator = teacherGroup.iterator();
        List<Teacher> result = new ArrayList<>();
        while (iterator.hasNext()){
            Teacher teacher = iterator.next();
            if(teacher.getFirstName().equalsIgnoreCase(firstName)
                    && teacher.getSecondName().equalsIgnoreCase(secondName)){
                result.add(teacher);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

}
