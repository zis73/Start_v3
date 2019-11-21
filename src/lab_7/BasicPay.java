package lab_7;

public abstract class BasicPay {
    private String name;
    private int salary;

    public BasicPay(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    abstract void GetSalary(Integer salary);

}
