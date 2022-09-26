package pro.sky.HomeWork15CollectionsAndSets.Service;

import org.springframework.stereotype.Service;
import pro.sky.HomeWork15CollectionsAndSets.Exceptions.EmployeeAlreadyAddedException;
import pro.sky.HomeWork15CollectionsAndSets.Exceptions.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceImp implements EmployeeServiceIInterface {

    List<Employee> employeesList = new ArrayList<>();

    @Override
    public String add(String firstName, String lastName) {
        Employee e = new Employee(firstName, lastName);

        boolean f = false;
        for (Employee person : employeesList) {
            if (person.equals(e)) {
                System.out.println(e + " этот уже есть в списке.");
                f = true;
                throw new EmployeeAlreadyAddedException();
            }
        }


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
        if (!f) {
            System.out.println(fff + " не найден");
            throw new EmployeeNotFoundException();
        }
        return f;
    }

    @Override
    public boolean remove(Employee fff) {
        boolean f = false;
        //remove
       // f = employeesList.remove(fff);
        for (int i=0; i< employeesList.size(); i++) {
            if (fff.equals(employeesList.get(i))) {
                employeesList.remove(i);
                System.out.println(fff + " удалён  ");
                f = true;
            } else {
                System.out.println(fff + " не найден");
              //  throw new EmployeeNotFoundException();
            }
        }
        return f;
    }


}
