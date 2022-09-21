package pro.sky.HomeWork15CollectionsAndSets.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceImp implements EmployeeServiceIInterface {

    List<Employee> employeesList = new ArrayList<>();

    @Override
    public String add(String firstName, String lastName) {
        Employee e = new Employee(firstName, lastName);
        employeesList.add(e);
        System.out.println('\n' + " Добавлен: Фамилия='" + firstName + '\'' +
                ", Имя='" + lastName + '\'');
        return "ok";
    }

    @Override
    public String employeeList() {
        System.out.println(" список: " + employeesList);
        return employeesList.toString();
    }

    @Override
    public boolean find(Employee fff) {
        boolean f = false;

        for (Employee person : employeesList) {
            if (person.equals(fff)) {
                System.out.println(fff + " = " + person);
                f = true;
            }
        }
        return f;
    }

    @Override
    public boolean remove(Employee fff) {
        boolean f = false;
        //remove
        f = employeesList.remove(fff);
   /*     for (Employee person : employeesList) {
            if (person.equals(fff)) {
                System.out.println(fff + " = " + person);
                f = true;
            }
        } */
        return f;
    }


}
