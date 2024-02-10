import java.util.Scanner;

class Department {
    private int departmentId;
    private String departmentName;

    public Department(int id, String name) {
        this.departmentId = id;
        this.departmentName = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

class Employee {
    private String name;
    private String dateOfJoining;
    private Department department;

    public Employee(String name, String dateOfJoining, Department department) {
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public Department getDepartment() {
        return department;
    }
}

public class employeedetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter date of joining: ");
        String dateOfJoining = scanner.nextLine();

        System.out.print("Enter department ID: ");
        int deptId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();

        
        Department department = new Department(deptId, deptName);

        Employee employee = new Employee(empName, dateOfJoining, department);

        
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Date of Joining: " + employee.getDateOfJoining());
        System.out.println("Department ID: " + employee.getDepartment().getDepartmentId());
        System.out.println("Department Name: " + employee.getDepartment().getDepartmentName());

        scanner.close();
    }
}
