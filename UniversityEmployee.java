public abstract class UniversityEmployee {
    private String employeeId;
    private String fullName;
    private double baseSalary;

    public UniversityEmployee(String employeeId, String fullName, double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        this.baseSalary = baseSalary;
    }

    public void displayProfile() {
        System.out.printf("Employee ID: %s | Name: %s | Base Salary: $%.2f/mo%n", 
                employeeId, fullName, baseSalary);
    }

    public abstract double calculateMonthlySalary();
    public abstract void conductDuties();
}