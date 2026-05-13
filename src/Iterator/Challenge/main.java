package Iterator.Challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("An"));
        employees.add(new Employee("Bình"));
        employees.add(new Employee("Cường"));

        EmployeeIterator iterator = new EmployeeIterator(employees);

        System.out.println("Danh sách nhân viên:");

        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            System.out.println(emp.getName());
        }
    }
}
