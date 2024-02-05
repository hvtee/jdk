package lesson4.hw;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.add(new Employee("name1", "+375291234567",
                LocalDateTime.of(2000, Month.APRIL, 5, 5, 5),
                LocalDateTime.of(2011, Month.APRIL, 5, 5, 5)));
        employeeRepository.add(new Employee("name2", "+375291234568",
                LocalDateTime.of(2001, Month.APRIL, 5, 5, 5),
                LocalDateTime.of(2005, Month.APRIL, 5, 5, 5)));
        employeeRepository.add(new Employee("name3", "+375291234568",
                LocalDateTime.of(2001, Month.APRIL, 5, 5, 5),
                LocalDateTime.of(2007, Month.APRIL, 5, 5, 5)));

        employeeRepository.getAllEmployees();
        System.out.println();
        System.out.println(employeeRepository.getByFirstName("name1").toString() + "\n");
        System.out.println(employeeRepository.getByPhoneNumber("+375291234568").toString()+"\n");
        try {
            System.out.println(employeeRepository.getBySeniority(11).toString()+"\n");
        }
        catch (NullPointerException e) {
            System.out.println(Arrays.toString(e.getStackTrace()) + e);
        }
    }
}
