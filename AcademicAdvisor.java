public class AcademicAdvisor {
	private String advisorId;
	private String department;
	private int assignedStudents;
	private boolean isActive;

	public AcademicAdvisor(String advisorId, String department, int assignedStudents)
			throws InvalidAdvisingLoadException {
		this.advisorId = advisorId;
		this.department = department;
		setAssignedStudents(assignedStudents);
		isActive = true;
	}

	public String getAdvisorId() {
		return advisorId;
	}

	public String getDepartment() {
		return department;
	}

	public int getAssignedStudents() {
		return assignedStudents;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setAssignedStudents(int count) throws InvalidAdvisingLoadException {
		if (count < 1 || count > 50) {
			throw new InvalidAdvisingLoadException(
					"Assigned students count (" + count + ") must be between 1 and 50.");
		}
		assignedStudents = count;
	}

	public void setActive(boolean active) {
		isActive = active;
	}
}
