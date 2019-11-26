package lab_7;

public class HourlyPayment extends BasicPay {
    public HourlyPayment(String name, Double salary) {
        super(name, salary);
    }

    @Override
    Double GetSalary() {
        return salary = Math.floor(20.8 * 8 * salary) ;
    }
}
