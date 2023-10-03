import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup() {
        this.students = students;
        this.teacher = teacher;
        this.index = 0;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    int index;

    public boolean hasNext() { return index++ < 2;}

    public String next() {
        switch (index){
            case 1:
                System.out.println("students: %d" + students);
            case 2:
                System.out.println("teacher: %d" + teacher);
        }
        return null;
    }


    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    }
