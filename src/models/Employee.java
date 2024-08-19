package models;

public class Employee {

    private static final double TAX_RATE = 0.18;

    private String firstName;

    private String lastName;

    private JobTitle jobTitle;

    private int yearsOfExperience;

    public Employee(String firstName, String lastName, JobTitle jobTitle, int yearsOfExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.yearsOfExperience = yearsOfExperience;
    }

    public double calculateSalary() {
        double baseSalary = jobTitle.getSalary();
        double experienceMultiplier = 1 + (yearsOfExperience * 0.05); // 5% increase per year of experience
        return baseSalary * experienceMultiplier;
    }

    public double calculateTax() {
        return calculateSalary() * TAX_RATE;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobTitle=" + jobTitle +
                ", salary=" + calculateSalary() +
                ", tax=" + calculateTax() +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public enum JobTitle {
        JUNIOR_JAVA_DEVELOPER(500),
        MIDDLE_JAVA_DEVELOPER(2000),
        SENIOR_JAVA_DEVELOPER(5000),
        DEVOPS_ENGINEER(85000),
        SYSTEM_ADMINISTRATOR(70000);

        private final double salary;

        JobTitle(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }
    }
}
