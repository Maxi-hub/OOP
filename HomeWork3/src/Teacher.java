public class Teacher extends User{
    private int teacherID;

    public Teacher(String name, String surname, String patronymic, String dateOfBirth, int teacherID) {
        super(name, surname, patronymic, dateOfBirth);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth='" + super.getDateOfBirth() + '\'' +
                ", teacherID=" + teacherID +
                '}';
    }
}
