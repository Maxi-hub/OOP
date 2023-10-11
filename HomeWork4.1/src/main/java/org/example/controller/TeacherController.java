package org.example.controller;

import org.example.data.Teacher;
import org.example.service.TeacherGroupService;
import org.example.service.TeacherService;
import org.example.view.TeacherView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private TeacherService teacherService = new TeacherService();
    private final TeacherGroupService teacherGroupService = new TeacherGroupService();
    private TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(teacherService.getAll());
    }

    public void createTeacherGroup(List<Teacher> teachers){
        teacherGroupService.createTeacherGroup(teachers);
        teacherView.sendOnConsoleUserGroup(teacherGroupService.getTeachersGroup());
    }

    public void getTeacherInTeacherGroup(String firstName, String secondName){
        Teacher teacher = teacherGroupService.getTeacherFromTeacherGroup(firstName, secondName);
        teacherView.sendOnConsole(Collections.singletonList(teacher));
    }

}
