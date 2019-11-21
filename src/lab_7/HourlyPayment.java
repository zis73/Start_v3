package lab_7;

public class HourlyPayment extends BasicPay {
    public HourlyPayment(String name, Integer salary) {
        super(name, salary);
    }

    @Override
    void GetSalary(Integer salary) {
        salary = (int) 20.8 * 8 * salary;
        System.out.println("Вот зп почасовая:" + salary);
    }
}
