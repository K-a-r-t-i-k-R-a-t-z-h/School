package SchoolManagementSystem;

import java.util.List;

public class School {
private List<Student> students;
private List<Teacher> teachers;
private static int total_money_earned;
private static int total_money_spent;

    public School(List<Student> students, List<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
        total_money_earned=0;
        total_money_spent=0;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public static void updateTotal_money_earned(int money_earned) {
        total_money_earned+=money_earned;
    }

    public static void updateTotal_money_spent(int money_spent) {
        total_money_spent+=money_spent;
        total_money_earned-=money_spent;

    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public static int getTotal_money_earned() {
        return total_money_earned;
    }

    public static int getTotal_money_spent() {
        return total_money_spent;
    }
}
