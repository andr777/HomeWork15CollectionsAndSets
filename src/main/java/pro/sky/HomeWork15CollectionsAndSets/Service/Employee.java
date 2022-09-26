package pro.sky.HomeWork15CollectionsAndSets.Service;

import org.springframework.stereotype.Service;

import java.lang.String;

@Service
public class Employee {
   private String firstName;         // фамилия
    private String lastName;            // имя

    public Employee() {
        this(null, null);
    }

    public Employee(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        return this.firstName.equals(employee.getFirstName()) && this.lastName.equals(employee.getLastName());




    }

    @Override
    public String toString() {
        return this.firstName+", "+this.lastName;
    }



}
