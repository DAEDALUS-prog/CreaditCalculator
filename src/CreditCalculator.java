public class CreditCalculator {
    private static int amount;
    private static int years;
    private static int monthlyPayment;

    public CreditCalculator() {
    }

    public CreditCalculator(int amount, int years) {
        this.amount = amount;
        this.years = years;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getMonthlyPayment() {
        monthlyPayment = calculate();
        return monthlyPayment;
    }

    public static int calculate() {
        return amount / (years * 12);
    }

}
