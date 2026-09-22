public class Administrator extends UniversityEmployee implements Evaluatable {
    private double overtimeHours;

    public Administrator(String employeeId, String fullName, double baseSalary, double overtimeHours) {
        super(employeeId, fullName, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary() + (overtimeHours * 45.00);
    }

    @Override
    public void conductDuties() {
        System.out.println("Administrator [" + getEmployeeId() + "] is managing institutional budgets and admissions workflows.");
    }

    @Override
    public void evaluatePerformance(double score) {
        if (score < 0.0 || score > 100.0) {
            throw new IllegalArgumentException("Performance score must be between 0.0 and 100.0.");
        }
        System.out.printf("Administrator [%s] Performance Rating: %.2f%% - Evaluation Complete.%n", 
                getEmployeeId(), score);
    }
}