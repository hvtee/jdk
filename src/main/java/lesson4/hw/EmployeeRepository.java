package lesson4.hw;

import java.util.*;

public class EmployeeRepository implements List<Employee> {
    private Employee[] employees = new Employee[10];
    private int index = 0;

    public Employee getByFirstName(String firstName) {
        for (Employee employee : employees) {
            if (employee != null && Objects.equals(employee.getFirstName(), firstName)) {
                return employee;
            }
        }
        return null;
    }

    public Employee getByPhoneNumber(String phoneNumber) {
        for (Employee employee : employees) {
            if (employee != null && Objects.equals(employee.getPhoneNumber(), phoneNumber)) {
                return employee;
            }
        }
        return null;
    }

    public Employee getBySeniority(int seniority) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSeniority() == seniority) {
                return employee;
            }
        }
        return null;
    }

    public void getAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Employee> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Employee employee) {
        if (index < employees.length) {
            employees[index++] = employee;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Employee> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Employee> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Employee get(int index) {
        return null;
    }

    @Override
    public Employee set(int index, Employee element) {
        return null;
    }

    @Override
    public void add(int index, Employee element) {

    }

    @Override
    public Employee remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Employee> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Employee> listIterator(int index) {
        return null;
    }

    @Override
    public List<Employee> subList(int fromIndex, int toIndex) {
        return null;
    }
}
