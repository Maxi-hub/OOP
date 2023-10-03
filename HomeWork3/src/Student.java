import java.util.Comparator;
import java.util.Objects;

public class Student extends User implements Comparator<Student> {

    private int studentID;
    private int res;

    public Student(String name, String surname, String patronymic, String dateOfBirth, int studentID) {
        super(name, surname, patronymic, dateOfBirth);
        this.studentID = studentID;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth='" + super.getDateOfBirth() + '\'' +
                ", studentID=" + studentID +
                '}';
    }


    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getStudentID(), student2.getStudentID());
    }
}
