package SchoolManagementSystem;

public class Student {

    private int id;
    private String name;
    private int rank;
    private int paid_fee;
    private int total_fee;

    public Student(int id, String name, int rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.paid_fee = 0;
        this.total_fee = 30000;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setPaid_fee(int fee) {
        paid_fee+=fee;
        School.updateTotal_money_earned(fee);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getPaid_fee() {
        return paid_fee;
    }

    public int getTotal_fee() {
        return total_fee;
    }

    @Override
    public String toString() {
        return "name"+name;
    }
}
