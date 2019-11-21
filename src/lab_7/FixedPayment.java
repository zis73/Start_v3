package lab_7;

public class FixedPayment extends BasicPay {

    public FixedPayment(String name, int salary) {
        super(name, salary);
    }

    @Override
    void GetSalary(Integer salary) {
        System.out.println("Вот фиксированная зп:" + salary);
    }
}
