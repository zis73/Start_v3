package lab_7;

public abstract class BasicPay {
    private String name;
    public double salary;

    public BasicPay(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    abstract Double GetSalary();

}
