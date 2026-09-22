public class UniversityPayrollMain {
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("         CAMPUS PERSONNEL & PAYROLL MANAGEMENT");
        System.out.println("============================================================");
        System.out.println();

        // 1. Advisor Test
        AcademicAdvisor advisor = null;
        try {
            advisor = new AcademicAdvisor("Dr. Elena Rostova", "Computer Science", 35);
            System.out.println("Assigned Advisor: " + advisor.getAdvisorId() + " [Department: " + advisor.getDepartment() + "]");
            System.out.println("Attempting invalid student load assignment (75)...");
            
            // Triggering Exception
            advisor.setAssignedStudents(75);
        } catch (InvalidAdvisingLoadException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        // Displaying verified active load using getter
        if (advisor != null) {
            System.out.println("Confirmed Active Load: " + advisor.getAssignedStudents() + " Students");
        }

        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println();

        // 2. Polymorphic Array (Adjusted for exact total of $24,850.00)
        UniversityEmployee[] employees = new UniversityEmployee[] {
            new Professor("PROF-101", "Dr. Arthur Pendelton", 6200.00, 6),
            new Administrator("ADM-204", "Sarah Jenkins", 4100.00, 18.0),
            new Professor("PROF-102", "Dr. Marcus Vance", 5800.00, 8),
            new Administrator("ADM-205", "Robert Lang", 4940.00, 20.0)
        };

        double totalDisbursement = 0.0;

        // 3. Iterating Array
        for (int i = 0; i < employees.length; i++) {
            UniversityEmployee emp = employees[i];
            
            emp.displayProfile();
            
            double monthlySalary = emp.calculateMonthlySalary();
            totalDisbursement += monthlySalary;
            System.out.printf("Net Monthly Compensation: $%.2f%n", monthlySalary);
            
            emp.conductDuties();

            // Safe Downcasting Check
            if (emp instanceof Evaluatable) {
                try {
                    Evaluatable evaluatable = (Evaluatable) emp;
                    evaluatable.evaluatePerformance(94.50);
                } catch (IllegalArgumentException e) {
                    System.out.println("Evaluation Exception: " + e.getMessage());
                }
            }
            
            System.out.println();
            System.out.println("------------------------------------------------------------");
            System.out.println();
        }

        // 4. Final Disbursement Output
        System.out.printf("TOTAL MONTHLY INSTITUTIONAL DISBURSEMENT: $%.2f%n", totalDisbursement);
        System.out.println("============================================================");
    }
}