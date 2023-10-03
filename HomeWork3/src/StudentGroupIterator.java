import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private List<Student> students;
    private Teacher teacher;

    public void zeroCounter(){
        this.counter = 0;
    }

    public StudentGroupIterator() {
        this.counter = 0;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){ students.add(student); }

    @Override
    public boolean hasNext() { return counter < students.size(); }

    @Override
    public Student next() { return students.get(counter ++); }

    @Override
    public void remove() {
        students.remove(counter);
    }

}
