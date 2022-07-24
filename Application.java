public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.init();
        application.run();
    }

    private CreditCalculator calculator;

    public void init() {
        calculator = new CreditCalculator();
    }

    public void run() {
        calculator.setAmount(50000);
        calculator.setYears(3);
        CreditCalculator.calculate();
        System.out.println("Месячный платёж: " + calculator.getMonthlyPayment());
    }
}