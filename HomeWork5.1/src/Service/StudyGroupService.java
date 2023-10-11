package Service;

import Data.Student;
import Data.StudyGroup;
import Data.Teacher;

import java.util.List;

public class StudyGroupService extends StudyGroup{
    private List<StudyGroup> studyGroupList;

    public StudyGroupService(Teacher teacher, List<Student> students) {
        super(teacher, students);
    }

    @Override
    public Teacher getTeacher() {
        return super.getTeacher();
    }

    @Override
    public void setTeacher(Teacher teacher) {
        super.setTeacher(teacher);
    }

    @Override
    public List<Student> getStudents() {
        return super.getStudents();
    }

    public StudyGroup getStudyGroup(Teacher teacher, List<Student> students) {
        StudyGroup studyGroup = new StudyGroup(teacher, students);
        studyGroup.setTeacher(teacher);
        studyGroup.setStudents(students);
        return studyGroup;
    }


    @Override
    public String toString() {
        return "StudyGroup{ " + studyGroupList + '}';
    }
}
