import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentGroup> {
    private int counter;
    private List<StudentGroup> studentGroups;


    public Stream() {
        this.counter = 0;
        this.studentGroups = new ArrayList<>();
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void addStudentGroup(StudentGroup studentGroup){ studentGroups.add(studentGroup); }

    @Override
    public boolean hasNext() { return counter < studentGroups.size(); }

    @Override
    public StudentGroup next() { return studentGroups.get(counter++); }

    @Override
    public String toString() {
        return "studentGroups=" + studentGroups;
    }
}
