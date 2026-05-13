package Iterator.Challenge;

import java.util.List;
import java.util.Iterator;

public class EmployeeIterator implements Iterator<Employee> {

    private List<Employee> employees;
    private int position = 0;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return position < employees.size();
    }

    @Override
    public Employee next() {
        return employees.get(position++);
    }
}
