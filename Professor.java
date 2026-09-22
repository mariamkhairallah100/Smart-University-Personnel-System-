public class Professor extends UniversityEmployee implements Evaluatable {
    private int publishedPapers;

    public Professor(String employeeId, String fullName, double baseSalary, int publishedPapers) {
        super(employeeId, fullName, baseSalary);
        this.publishedPapers = publishedPapers;
    }

    public int getPublishedPapers() {
        return publishedPapers;
    }

    public void setPublishedPapers(int publishedPapers) {
        this.publishedPapers = publishedPapers;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary() + (publishedPapers * 150.00);
    }

    @Override
    public void conductDuties() {
        System.out.println("Professor [" + getEmployeeId() + "] is delivering advanced curriculum lectures and supervising graduate theses.");
    }

    @Override
    public void evaluatePerformance(double score) {
        if (score < 0.0 || score > 100.0) {
            throw new IllegalArgumentException("Performance score must be between 0.0 and 100.0.");
        }
        System.out.printf("Professor [%s] Performance Rating: %.2f%% - Evaluation Complete.%n", 
                getEmployeeId(), score);
    }
}