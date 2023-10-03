import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {
    boolean res;

    @Override
    public int compare(StudentGroup studentGroup1, StudentGroup studentGroup2) {
        int studentID1 = studentGroup1.getStudents().get(0).getStudentID();
        int studentID2 = studentGroup2.getStudents().get(0).getStudentID();
        return Integer.compare(studentID1, studentID2);
    }



    @Override
    public String toString() {
        return "StreamComparator{" +
                "res=" + res +
                '}';
    }
}




