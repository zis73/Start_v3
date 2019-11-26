package lab_7;

public class FixedPayment extends BasicPay {

    public FixedPayment(String name, Double salary) {
        super(name, salary);
    }

    @Override
    Double GetSalary() {
        return salary;
    }
}
