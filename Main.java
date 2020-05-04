package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     Student karthi=new Student(1,"karthi",2);
     Student mohan=new Student(2,"mohan",3);
     Student rahul=new Student(3,"rahul",1);
     List<Student> temp=new ArrayList<>();
     temp.add(karthi);
     temp.add(mohan);
     temp.add(rahul);
     Teacher adri=new Teacher(1,"adri",700);
        Teacher nagu=new Teacher(2,"nagu",500);
        Teacher suresh=new Teacher(3,"suresh",400);
        List<Teacher> temp1=new ArrayList<>();
        temp1.add(adri);
        temp1.add(nagu);
        temp1.add(suresh);
        School ghs=new School(temp,temp1);
        karthi.setPaid_fee(2000);
        adri.updateSalary(adri.getSalary());
        System.out.println(School.getTotal_money_earned());

    }
}
