import java.util.*;

class Employee {
    private String name;
    private Date dateOfJoining;
    private int departmentId;

    public Employee(String name, Date dateOfJoining, int departmentId) {
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public int getDepartmentId() {
        return departmentId;
    }
}

public class employeedetails {
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee("John Doe", new Date(), 101);
        Employee emp2 = new Employee("Jane Smith", new Date(), 102);

        // Displaying employee details
        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Date of Joining: " + emp1.getDateOfJoining());
        System.out.println("Department ID: " + emp1.getDepartmentId());
        System.out.println();

        System.out.println("Employee 2 Details:");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Date of Joining: " + emp2.getDateOfJoining());
        System.out.println("Department ID: " + emp2.getDepartmentId());
    }
}
