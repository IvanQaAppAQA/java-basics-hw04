public class Employee implements calculatePay{
    public String employeeId;
    public String name;
    public double averageMonthlySalary;
    // TODO fix class declaration and declare variables here

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name; // TODO fill in code here
    }

    public String getEmployeeId() {
        // TODO fill in code here and replace the return statement
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId; // TODO fill in code here
    }

    public String getName() {
        // TODO fill in code here and replace the return statement
        return name;
    }

    public void setName(String name) {
        this.name = name;// TODO fill in code here
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return this.getName() + " " + averageMonthlySalary + " ";// TODO fill in code here and replace the return statement, be sure to format double value
    }

    public void calculatePay() {
    }
}


