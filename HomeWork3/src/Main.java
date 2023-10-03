import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Poll", "Petrov", "Ivanovich", "12.12.2000", 111);
        Student student2 = new Student("Mike", "Sidorov", "Sergeevich", "03.03.1999", 222);
        Student student3 = new Student("Tom", "Ivanov", "Petrovich", "01.01.2001", 333);
        Student student4 = new Student("Suzy", "Smith", "", "05.05.2000", 444);
        Student student5 = new Student("Zara", "Barnaby", "", "07.07.1998", 555);
        Teacher teacher1 = new Teacher("Barny", "Tobolsky", "Semenovich", "06.06.1978", 200);
        Teacher teacher2 = new Teacher("Holly", "Kruz", "", "14.12.1975", 201);

        StudentGroup studentGroup1 = new StudentGroup();
        List<Student> stGroup1 = new ArrayList<>();
        stGroup1.add(student3);
        stGroup1.add(student1);
        stGroup1.add(student2);
        studentGroup1.setStudents(stGroup1);
        studentGroup1.setTeacher(teacher1);
        System.out.println("Список студентов группы 1: " + studentGroup1.getStudents());
        System.out.println("_____________________________");
        Collections.sort(studentGroup1.getStudents(), new StudentComparator());
        System.out.println("Отсортированный список студентов группы1 по ID студента: " + studentGroup1);
        System.out.println("+++++++++++++++++++++++++++++");

        StudentGroupIterator iterator = new StudentGroupIterator();
        iterator.addStudent(student1);
        iterator.addStudent(student2);
        iterator.addStudent(student3);
        iterator.addStudent(student4);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("_____________________________");
        StudentGroup studentGroup2 = new StudentGroup();
        List<Student> stGroup2 = new ArrayList<>();
        stGroup2.add(student4);
        stGroup2.add(student5);
        studentGroup2.setStudents(stGroup2);
        studentGroup2.setTeacher(teacher2);
        System.out.println("Список студентов группы 2: " + studentGroup2);
        System.out.println("_____________________________");
        Stream streamIterator = new Stream();
        streamIterator.addStudentGroup(studentGroup1);
        streamIterator.addStudentGroup(studentGroup2);
        while (streamIterator.hasNext()) {
            System.out.println(streamIterator.next());
        }

        System.out.println("+++++++++++++++++++");
        Stream stream = new Stream();
        stream.addStudentGroup(studentGroup2);
        stream.addStudentGroup(studentGroup1);
        System.out.println("Все студенческие группы " + stream);

        Collections.sort(stream.getStudentGroups(), new StreamComparator());
        System.out.println("Все студенческие группы после сортировки " + stream.toString());

    }
}