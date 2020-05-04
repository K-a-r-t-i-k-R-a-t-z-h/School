package SchoolManagementSystem;

public class Teacher {
    private int id;
    private  String name;
    private int salary;
    private int salary_earned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        salary_earned=0;
    }

    public void updateSalary(int salary) {
        salary_earned+=salary;
         School.updateTotal_money_spent(salary);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


}
