package org.example.data;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private int counter;
    private List<Teacher> teachers;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.counter = counter;
        this.teachers = teacherGroup.getTeachers();
    }

    @Override
    public boolean hasNext() { return counter < teachers.size(); }

    @Override
    public Teacher next() { return teachers.get(counter++); }

}
