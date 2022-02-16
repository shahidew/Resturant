package ir.university;

public class Employee extends Person {
    protected String nationalCode;
    protected int clockIn;
    protected int clockOut;
    protected int salary;
    protected JobPosition jobPosition;

    public Employee(String name, String family, Gender gender, String nationalCode, JobPosition jobPosition) {
        super(name, family, gender);
        this.nationalCode = nationalCode;
        this.clockIn = 0;
        this.clockOut = 0;
        this.salary = 0;
        this.jobPosition = jobPosition;
    }

    public String getNationalCode() {
        return this.nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public int getClockIn() {
        return this.clockIn;
    }

    public void setClockIn(int clockIn) {
        this.clockIn = clockIn;
    }

    public int getClockOut() {
        return this.clockOut;
    }

    public void setClockOut(int clockOut) {
        this.clockOut = clockOut;
    }

    public int calculateSalary() {
        int hour = this.clockOut - this.clockIn;
        switch(this.jobPosition) {
            case CHEF:
                this.salary = hour * 30000;
                break;
            case WAITER:
                this.salary = hour * 27000;
                break;
            case WORKER:
                this.salary = hour * 27000;
                break;
            case DRIVER:
                this.salary = hour * 25000;
        }

        return this.salary;
    }

    public String toString() {
        JobPosition var10000 = this.jobPosition;
        return " Employee : JobPosition = " + var10000 + "', nationalCode = '" + this.nationalCode + "', name = '" + this.name + "', family = '" + this.family + "', gender = " + this.gender + ", salary = " + this.calculateSalary() + "}";
    }
}
